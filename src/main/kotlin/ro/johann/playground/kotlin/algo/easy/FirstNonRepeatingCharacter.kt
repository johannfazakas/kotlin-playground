package ro.johann.playground.kotlin.algo.easy

fun firstNonRepeatingCharacter(string: String): Int {
    val charsMap = string.asSequence().fold(mutableMapOf<Char, Int>()) { accumulator, char ->
        accumulator.also {
            it[char] = it[char]?.let { count -> count + 1 } ?: 1
        }
    }
    string.forEachIndexed { index, char -> if (charsMap[char] == 1) return index }
    return -1
}
