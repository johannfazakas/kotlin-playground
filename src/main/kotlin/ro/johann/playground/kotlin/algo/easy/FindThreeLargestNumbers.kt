package ro.johann.playground.kotlin.algo.easy

// time O(n), space O(1)
fun findThreeLargestNumbers(array: List<Int>): List<Int> {
    val largestBucket = mutableListOf(Int.MIN_VALUE, Int.MIN_VALUE, Int.MIN_VALUE)

    array.forEach { value ->
        if (value > largestBucket[0]) {
            largestBucket[0] = value
            largestBucket.sort()
        }
    }
    return largestBucket
}
