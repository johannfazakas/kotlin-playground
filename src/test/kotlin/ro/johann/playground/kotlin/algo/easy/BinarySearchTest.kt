package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BinarySearchTest {
    @Test
    fun `test hit with single value list`() {
        val result = binarySearch(listOf(2), 2)

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `test miss with single value list`() {
        val result = binarySearch(listOf(2), 178)

        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun `test hit with in a few elements`() {
        val result = binarySearch(listOf(2, 6, 7), 6)

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `test hit with in a lot of elements`() {
        val result = binarySearch(listOf(1, 2, 5, 6, 7, 9, 12, 14, 52, 62, 78, 90), 62)

        assertThat(result).isEqualTo(9)
    }
}