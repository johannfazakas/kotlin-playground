package ro.johann.playground.kotlin.algo.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MonotonicArrayTest {

    @Test
    fun `empty array is monotonic`() {
        assertThat(isMonotonic(emptyList())).isTrue
    }

    @Test
    fun `1 element array is monotonic`() {
        assertThat(isMonotonic(listOf(42))).isTrue
    }

    @Test
    fun `2 equal element array is monotonic`() {
        assertThat(isMonotonic(listOf(2, 2))).isTrue
    }

    @Test
    fun `2 different element array is monotonic`() {
        assertThat(isMonotonic(listOf(2, 267))).isTrue
    }

    @Test
    fun `3 element array is not monotonic`() {
        assertThat(isMonotonic(listOf(2, 5, 3))).isFalse
    }

    @Test
    fun `3 non-increasing element array is monotonic`() {
        assertThat(isMonotonic(listOf(3, 2, 2))).isTrue
    }

    @Test
    fun `3 non-decreasing element array is monotonic`() {
        assertThat(isMonotonic(listOf(2, 2, 8))).isTrue
    }

    @Test
    fun `5 increasing than decreasing array is not monotonic`() {
        assertThat(isMonotonic(listOf(2, 3, 8, 8, 7))).isFalse
    }

    @Test
    fun `algo expert example is monotonic`() {
        assertThat(isMonotonic(listOf(-1, -5, -10, -1100, -1100, -1101, -1102, -9001)))
    }
}