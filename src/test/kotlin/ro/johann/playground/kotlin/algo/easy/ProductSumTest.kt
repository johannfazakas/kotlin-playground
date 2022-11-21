package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductSumTest {

    @Test
    fun `test flat product sum`() {
        val input = listOf(1, 3)

        val result = productSum(input)

        assertThat(result).isEqualTo(4)
    }

    @Test
    fun `test single sublevel product sum`() {
        val input = listOf(3, listOf(5, 8))

        val result = productSum(input)

        assertThat(result).isEqualTo(29)
    }

    @Test
    fun `test 3 level product sum`() {
        val input = listOf(3, listOf(5, listOf(8)))

        val result = productSum(input)

        assertThat(result).isEqualTo(61)
    }
}