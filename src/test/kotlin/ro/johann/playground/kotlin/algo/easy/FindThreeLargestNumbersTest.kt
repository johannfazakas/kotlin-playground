package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FindThreeLargestNumbersTest {
    @Test
    fun `find three largest numbers when 3 sorted elements in list`() {
        val input = listOf(1, 2, 5)

        val output = findThreeLargestNumbers(input)

        assertThat(output).containsExactly(1, 2, 5)
    }

    @Test
    fun `find three largest numbers when 3 not sorted elements in list`() {
        val input = listOf(4, 2, 3)

        val output = findThreeLargestNumbers(input)

        assertThat(output).containsExactly(2, 3, 4)
    }

    @Test
    fun `find three largest numbers when longer list`() {
        val input = listOf(6, 3, 2, 9, 12, 3)

        val output = findThreeLargestNumbers(input)

        assertThat(output).containsExactly(6, 9, 12)
    }

    @Test
    fun `find three largest numbers with example input`() {
        val input = listOf(141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7)

        val output = findThreeLargestNumbers(input)

        assertThat(output).containsExactly(18, 141, 541)
    }
}