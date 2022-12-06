package ro.johann.playground.kotlin.algo.easy

fun runLengthEncoding(string: String): String = string
    .asSequence()
    .fold(mutableListOf<Group>()) { groups, char -> groups.append(char) }
    .joinToString(separator = "")

private fun MutableList<Group>.append(char: Char): MutableList<Group> {
    if (isEmpty() || last().char != char || last().length >= 9) {
        add(Group(char, 1))
    } else {
        last().length++
    }
    return this
}

private data class Group(val char: Char, var length: Int) {
    override fun toString(): String = "$length$char"
}
