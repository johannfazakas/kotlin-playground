package ro.johann.playground.kotlin.algo.easy

private const val ALPHABET_LENGTH = 26

fun caesarCipherEncryptor(string: String, key: Int): String =
    string.asSequence()
        .map { it + key }
        .map { it.normalize() }
        .joinToString(separator = "")

private fun Char.normalize(): Char = if (isAlphabetical()) this else (this - ALPHABET_LENGTH).normalize()

private fun Char.isAlphabetical(): Boolean = this in 'a'..'z'
