package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumWaitingTimeTest {
    @Test
    fun `test minimum waiting time with single item`() {
        val result = minimumWaitingTime(mutableListOf(4))

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `test minimum waiting time with two items`() {
        val result = minimumWaitingTime(mutableListOf(5, 3))

        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `test minimum waiting time with 3 items`() {
        val result = minimumWaitingTime(mutableListOf(5, 1, 4))

        assertThat(result).isEqualTo(6)
    }

    @Test
    fun `test minimum waiting time with 5 items`() {
        val result = minimumWaitingTime(mutableListOf(3, 2, 1, 2, 6))

        assertThat(result).isEqualTo(17)
    }
}