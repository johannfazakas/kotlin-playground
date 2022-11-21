package ro.johann.playground.kotlin.algo.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MoveElementToEndTest {
    @Test
    fun `test with algo expert input`() {
        val array = mutableListOf(2, 1, 2, 2, 2, 3, 4, 2)
        val toMove = 2

        val result = moveElementToEnd(array, toMove)

        assertThat(result).containsExactly(1, 3, 4, 2, 2, 2, 2, 2)
    }
}