package ro.johann.playground.kotlin.algo.easy

// time 0(log n), space O(1)
fun binarySearch(array: List<Int>, target: Int): Int {
    var (begin, end) = 0 to array.size - 1
    while (begin <= end) {
        val middle = (begin + end) / 2
        when {
            array[middle] == target -> return middle
            array[middle] < target -> begin = middle + 1
            else -> end = middle - 1
        }
    }
    return -1
}

// time 0(log n), space O(1)
tailrec fun binarySearchR(array: List<Int>, target: Int, begin: Int = 0, end: Int = array.size - 1): Int {
    val middle = (begin + end) / 2
    return when {
        begin > end -> -1
        array[middle] == target -> middle
        array[middle] < target -> binarySearchR(array, target, middle + 1, end)
        else -> binarySearchR(array, target, begin, middle - 1)
    }
}
