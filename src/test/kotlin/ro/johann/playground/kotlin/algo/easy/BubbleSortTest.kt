package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class BubbleSortTest {
    @Test
    fun `sort single element list`() {
        val input = mutableListOf(5)

        bubbleSort(input)

        Assertions.assertThat(input).containsExactly(5)
    }

    @Test
    fun `sort 2 element list`() {
        val input = mutableListOf(5, 2)

        bubbleSort(input)

        Assertions.assertThat(input).containsExactly(2, 5)
    }

    @Test
    fun `sort 3 element list`() {
        val input = mutableListOf(5, 1, 3)

        bubbleSort(input)

        Assertions.assertThat(input).containsExactly(1, 3, 5)
    }

    @Test
    fun `sort long list`() {
        val input = mutableListOf(7, 2, 3, 0, 9, 5, 4, 8, 1, 5, 6, 8, 3, 2)

        bubbleSort(input)

        Assertions.assertThat(input).containsExactly(0, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9)
    }
}