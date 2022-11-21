package ro.johann.playground.kotlin.algo.easy

// time: O(n log n)
// space O(1)
fun minimumWaitingTime(queries: MutableList<Int>): Int {
    queries.sortDescending()
    return queries.asSequence()
        .mapIndexed { index, value -> value * index }
        .sum()
}
