package ro.johann.playground.kotlin.algo.medium

// time O(n), space O(1)
fun isMonotonic(array: List<Int>): Boolean {
    val condition = if (array.isNotEmpty() && array[0] < array[array.size - 1]) ::notDecreasing else ::notIncreasing
    for (index in 1 until array.size)
        if (!condition(array[index - 1], array[index])) return false
    return true
}

private fun notDecreasing(first: Int, second: Int) = first <= second

private fun notIncreasing(first: Int, second: Int) = first >= second
