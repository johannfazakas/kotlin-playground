package ro.johann.playground.kotlin.algo.easy

fun selectionSort(array: MutableList<Int>): List<Int> {
    for (i in array.indices) {
        var smallestIndex = i
        for (j in (i + 1) until array.size) {
            if (array[j] < array[smallestIndex]) smallestIndex = j
        }
        array.swap(i, smallestIndex)
    }
    return array
}

private fun <T> MutableList<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}
