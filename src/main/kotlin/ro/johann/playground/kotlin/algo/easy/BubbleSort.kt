package ro.johann.playground.kotlin.algo.easy

fun bubbleSort(array: MutableList<Int>): List<Int> {
    var isSorted = false
    var indexLimit = array.size - 2
    while (!isSorted) {
        isSorted = true
        (0..indexLimit).forEach { index ->
            if (array[index] > array[index + 1]) {
                array.swap(index, index + 1)
                isSorted = false
            }
        }
        indexLimit--
    }
    return array
}

private fun <T> MutableList<T>.swap(first: Int, second: Int) {
    val temp = this[first]
    this[first] = this[second]
    this[second] = temp
}
