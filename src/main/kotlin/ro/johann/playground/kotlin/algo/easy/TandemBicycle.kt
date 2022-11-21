package ro.johann.playground.kotlin.algo.easy

import kotlin.math.max

fun tandemBicycle(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
    require(redShirtSpeeds.size == blueShirtSpeeds.size)
    redShirtSpeeds.sort()
    blueShirtSpeeds.apply { if (fastest) sortDescending() else sort() }
    return redShirtSpeeds.indices.map { index -> max(redShirtSpeeds[index], blueShirtSpeeds[index]) }.sum()
}
