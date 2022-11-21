package ro.johann.playground.kotlin.algo.medium

import kotlin.math.abs

// time O(n log(n)), space O(1)
fun smallestDifference(arrayOne: MutableList<Int>, arrayTwo: MutableList<Int>): List<Int> {
    arrayOne.sort()
    arrayTwo.sort()
    var (indexOne, indexTwo) = 0 to 0
    var (bestIndexOne, bestIndexTwo) = 0 to 0
    var smallestDifference = Long.MAX_VALUE

    while (indexOne < arrayOne.size && indexTwo < arrayTwo.size) {
        val currentDifference = abs(arrayOne[indexOne].toLong() - arrayTwo[indexTwo].toLong())
        if (currentDifference < smallestDifference) {
            bestIndexOne = indexOne
            bestIndexTwo = indexTwo
            smallestDifference = currentDifference
        }
        if (smallestDifference.toInt() == 0) {
            break
        }
        if (arrayOne[indexOne] < arrayTwo[indexTwo]) {
            indexOne++
        } else {
            indexTwo++
        }
    }
    return listOf(arrayOne[bestIndexOne], arrayTwo[bestIndexTwo])
}
