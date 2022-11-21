package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PalindromeCheckTest {
    @Test
    fun `test with single letter`() {
        assertThat(isPalindrome("a")).isTrue
    }

    @Test
    fun `test with two letter palindrome`() {
        assertThat(isPalindrome("bb")).isTrue
    }

    @Test
    fun `test with two letter not palindrome`() {
        assertThat(isPalindrome("ab")).isFalse
    }

    @Test
    fun `test with long palindrome`() {
        assertThat(isPalindrome("abcdcba")).isTrue
    }

    @Test
    fun `test with long not palindrome`() {
        assertThat(isPalindrome("abcdecba")).isFalse
    }
}