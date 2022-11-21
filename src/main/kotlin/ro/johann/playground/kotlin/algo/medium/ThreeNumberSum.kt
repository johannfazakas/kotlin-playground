package ro.johann.playground.kotlin.algo.medium

fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    array.sort()
    val result = mutableListOf<List<Int>>()
    array.forEachIndexed { index, firstValue ->
            var (leftIndex, rightIndex) = (index + 1) to array.size - 1
            while (leftIndex < rightIndex) {
                val partialSum = firstValue + array[leftIndex] + array[rightIndex]
                if (partialSum == targetSum)
                    result += listOf(firstValue, array[leftIndex], array[rightIndex])
                if (partialSum < targetSum) {
                    leftIndex++
                } else {
                    rightIndex--
                }
            }
        }
    return result
}
