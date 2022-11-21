package ro.johann.playground.kotlin.algo.easy

fun isPalindrome(string: String): Boolean = (0 until string.length / 2).all { string[it] == string[string.length - it - 1] }
