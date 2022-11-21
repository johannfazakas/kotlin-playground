package ro.johann.playground.kotlin.algo.easy

import java.lang.IllegalArgumentException

fun productSum(array: List<*>, level: Int = 1): Int =
    // sumOf is not recognized by algo expert compiler
    level * array.sumBy {
        when (it) {
            is Int -> it
            is List<*> -> productSum(it, level + 1)
            else -> throw IllegalArgumentException("Array element is not Int or List.")
        }
    }
