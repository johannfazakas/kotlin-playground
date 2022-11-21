package ro.johann.playground.kotlin.algo.sort

fun quickSort(list: MutableList<Int>) {
    quickSort(list, 0, list.size - 1)
}

private fun quickSort(list: MutableList<Int>, leftIndex: Int, rightIndex: Int) {
    if (leftIndex >= rightIndex) return
    val pivotIndex = partition(list, leftIndex, rightIndex)
    quickSort(list, leftIndex, pivotIndex - 1)
    quickSort(list, pivotIndex + 1, rightIndex)
}

private fun partition(list: MutableList<Int>, leftIndex: Int, rightIndex: Int): Int {
    val pivot = list[rightIndex]
    var pivotIndex = leftIndex
    (leftIndex..rightIndex).forEach { index ->
        if (list[index] < pivot) {
            swap(list, pivotIndex, index)
            pivotIndex++
        }
    }
    swap(list, pivotIndex, rightIndex)
    return pivotIndex
}

private fun swap(list: MutableList<Int>, firstIndex: Int, secondIndex: Int) {
    val firstValue = list[firstIndex]
    list[firstIndex] = list[secondIndex]
    list[secondIndex] = firstValue
}
