package ro.johann.playground.kotlin.algo.easy

fun nonConstructibleChange(coins: MutableList<Int>): Int {
    var maxChange = 0
    coins.sorted().forEach { coin ->
        if (coin > maxChange + 1) return maxChange + 1
        maxChange += coin
    }
    return maxChange + 1
}

fun nonConstructibleChangeV1(coins: MutableList<Int>): Int {
    val constructibleSums = mutableSetOf<Int>()
    coins.forEach { coin ->
        constructibleSums.toList().forEach { constructibleSums.add(it + coin) }
        constructibleSums.add(coin)
    }

    return (1..Int.MAX_VALUE).first { sum -> !constructibleSums.contains(sum) }
}
