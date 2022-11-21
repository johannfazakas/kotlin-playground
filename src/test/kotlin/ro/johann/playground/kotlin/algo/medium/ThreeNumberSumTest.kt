package ro.johann.playground.kotlin.algo.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeNumberSumTest {
    @Test
    fun `find match from three element list`() {
        val inputArray = mutableListOf(5, 2, 9)
        val targetSum = 16

        val result = threeNumberSum(inputArray, targetSum)

        assertThat(result).hasSize(1)
        assertThat(result[0]).containsExactlyInAnyOrder(2, 5, 9)
    }

    @Test
    fun `find no match from three element list`() {
        val inputArray = mutableListOf(5, 2, 11)
        val targetSum = 15

        val result = threeNumberSum(inputArray, targetSum)

        assertThat(result).hasSize(0)
    }

    @Test
    fun `find 2 matches from list`() {
        val inputArray = mutableListOf(8, 5, 2, -3, 3)
        val targetSum = 10

        val result = threeNumberSum(inputArray, targetSum)

        assertThat(result).hasSize(2)
        assertThat(result[0]).containsExactly(-3, 5, 8)
        assertThat(result[1]).containsExactly(2, 3, 5)
    }

    @Test
    fun `find 3 matches from list`() {
        val inputArray = mutableListOf(12, 3, 1, 2, -6, 5, -8, 6)
        val targetSum = 0

        val result = threeNumberSum(inputArray, targetSum)

        assertThat(result).hasSize(3)
        assertThat(result[0]).containsExactly(-8, 2, 6)
        assertThat(result[1]).containsExactly(-8, 3, 5)
        assertThat(result[2]).containsExactly(-6, 1, 5)
    }
}