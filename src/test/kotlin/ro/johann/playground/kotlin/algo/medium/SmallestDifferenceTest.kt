package ro.johann.playground.kotlin.algo.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SmallestDifferenceTest {
    @Test
    fun `find smallest diff with single element lists`() {
        val arrayOne = mutableListOf(-3)
        val arrayTwo = mutableListOf(2)

        val result = smallestDifference(arrayOne, arrayTwo)

        assertThat(result).containsExactly(-3, 2)
    }

    @Test
    fun `find smallest diff with single and multi element list`() {
        val arrayOne = mutableListOf(6)
        val arrayTwo = mutableListOf(-8, 3, 10)

        val result = smallestDifference(arrayOne, arrayTwo)

        assertThat(result).containsExactly(6, 3)
    }

    @Test
    fun `find smallest diff with multi and single element list`() {
        val arrayOne = mutableListOf(-7, -5, 23)
        val arrayTwo = mutableListOf(-4)

        val result = smallestDifference(arrayOne, arrayTwo)

        assertThat(result).containsExactly(-5, -4)
    }

    @Test
    fun `find smallest diff with example from algo expert`() {
        val arrayOne = mutableListOf(-1, 5, 10, 20, 28, 3)
        val arrayTwo = mutableListOf(26, 134, 135, 15, 17)

        val result = smallestDifference(arrayOne, arrayTwo)

        assertThat(result).containsExactly(28, 26)
    }
}