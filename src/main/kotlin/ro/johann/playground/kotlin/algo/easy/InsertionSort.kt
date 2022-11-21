package ro.johann.playground.kotlin.algo.easy

fun insertionSort(array: MutableList<Int>): List<Int> {
    (1 until array.size).forEach { i ->
        var j = i
        while (j > 0 && array[j] < array[j - 1]) {
            array.swap(j, j - 1)
            j--
        }
    }
    return array
}

private fun <T> MutableList<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}
