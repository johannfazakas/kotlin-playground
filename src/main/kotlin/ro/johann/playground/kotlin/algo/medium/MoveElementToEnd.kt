package ro.johann.playground.kotlin.algo.medium

// time O(n), space O(1)
fun moveElementToEnd(array: MutableList<Int>, toMove: Int): List<Int> {
    var (i, j) = 0 to 0
    while (j < array.size) {
        if (array[j] != toMove) {
            if (i != j) {
                array[i] = array[j]
            }
            i++
        }
        j++
    }
    while (i < array.size) {
        array[i] = toMove
        i++
    }
    return array
}
