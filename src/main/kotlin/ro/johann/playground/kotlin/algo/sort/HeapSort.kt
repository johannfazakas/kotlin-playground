package ro.johann.playground.kotlin.algo.sort

fun heapSort(list: MutableList<Int>) {
    list.largestParentIndex().downTo(0).forEach {
        list.heapify(list.size, it)
    }
    (list.size - 1).downTo(1).forEach {
        list.swap(0, it)
        list.heapify(it, 0)
    }
}

private fun MutableList<Int>.heapify(size: Int, node: Int) {
    getSuccessorChildren(size, node)?.let {
        swap(it, node)
        heapify(size, it)
    }
}

private fun MutableList<Int>.getSuccessorChildren(size: Int, node: Int): Int? =
    sequenceOf(node, node.leftChild(size), node.rightChild(size))
        .filterNotNull()
        .maxByOrNull { this[it] }
        .takeIf { it != node }

private fun <T> MutableList<T>.largestParentIndex() = this.size / 2 - 1

private fun Int.leftChild(size: Int) = leftChild().takeIf { it < size }
private fun Int.rightChild(size: Int) = rightChild().takeIf { it < size }
private fun Int.leftChild() = 2 * this + 1
private fun Int.rightChild() = 2 * this + 2

private fun MutableList<Int>.swap(firstIndex: Int, secondIndex: Int) {
    val firstValue = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = firstValue
}
