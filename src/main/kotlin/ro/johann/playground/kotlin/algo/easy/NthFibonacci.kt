package ro.johann.playground.kotlin.algo.easy

fun getNthFib(n: Int): Int =
    getNthFib(mutableMapOf(1 to 0, 2 to 1), n)

private fun getNthFib(cache: MutableMap<Int, Int>, n: Int): Int =
    cache[n] ?: (getNthFib(cache, n - 1) + getNthFib(cache, n - 2)).also { cache[n] = it }
