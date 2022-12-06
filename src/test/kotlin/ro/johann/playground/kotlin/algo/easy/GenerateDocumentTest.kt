package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GenerateDocumentTest {

    @Test
    fun `should generate document when input is same as output`() {
        assertThat(generateDocument("abc", "abc")).isTrue
    }

    @Test
    fun `should generate document when output is empty`() {
        assertThat(generateDocument("abcde", "")).isTrue
    }

    @Test
    fun `should generate document when input is same as output but scrambled`() {
        assertThat(generateDocument("ebacd", "abcde")).isTrue
    }

    @Test
    fun `should generate document when input has more characters than input`() {
        assertThat(generateDocument("aedcb", "bcd")).isTrue
    }

    @Test
    fun `should not generate document when input is missing characters`() {
        assertThat(generateDocument("edcba", "abcdex")).isFalse
    }

    @Test
    fun `should not generate document when input is missing enough characters`() {
        assertThat(generateDocument("ab", "aa")).isFalse
    }

    @Test
    fun `should not generate document when input is same as output with different case`() {
        assertThat(generateDocument("A", "a")).isFalse
    }

    @Test
    fun `should generate document with algo expert example`() {
        assertThat(generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!")).isTrue
    }
}