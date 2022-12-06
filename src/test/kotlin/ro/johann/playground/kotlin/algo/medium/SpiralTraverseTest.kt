package ro.johann.playground.kotlin.algo.medium

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpiralTraverseTest {

    @Test
    fun `test with single element`() {
        val matrix = listOf(
            listOf(1)
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo(listOf(1))
    }

    @Test
    fun `test with horizontal line`() {
        val matrix = listOf(
            listOf(1, 2, 3, 4, 5)
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..5).toList())
    }


    @Test
    fun `test with vertical line`() {
        val matrix = listOf(
            listOf(1),
            listOf(2),
            listOf(3),
            listOf(4)
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..4).toList())
    }

    @Test
    fun `test horizontal with odd rows`() {
        val matrix = listOf(
            listOf(1, 2, 3, 4, 5, 6, 7),
            listOf(16, 17, 18, 19, 20, 21, 8),
            listOf(15, 14, 13, 12, 11, 10, 9),
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..21).toList())
    }

    @Test
    fun `test horizontal with even rows`() {
        val matrix = listOf(
            listOf(1, 2, 3, 4, 5, 6),
            listOf(16, 17, 18, 19, 20, 7),
            listOf(15, 24, 23, 22, 21, 8),
            listOf(14, 13, 12, 11, 10, 9),
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..24).toList())
    }

    @Test
    fun `test vertical with odd columns`() {
        val matrix = listOf(
            listOf(1, 2, 3),
            listOf(14, 15, 4),
            listOf(13, 16, 5),
            listOf(12, 17, 6),
            listOf(11, 18, 7),
            listOf(10, 9, 8),
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..18).toList())
    }

    @Test
    fun `test vertical with even columns`() {
        val matrix = listOf(
            listOf(1, 2, 3, 4),
            listOf(20, 21, 22, 5),
            listOf(19, 32, 23, 6),
            listOf(18, 31, 24, 7),
            listOf(17, 30, 25, 8),
            listOf(16, 29, 26, 9),
            listOf(15, 28, 27, 10),
            listOf(14, 13, 12, 11),
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..32).toList())
    }

    @Test
    fun `test square with odd depth`() {
        val matrix = listOf(
            listOf(1, 2, 3, 4, 5),
            listOf(16, 17, 18, 19, 6),
            listOf(15, 24, 25, 20, 7),
            listOf(14, 23, 22, 21, 8),
            listOf(13, 12, 11, 10, 9),
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..25).toList())
    }

    @Test
    fun `test square with even depth`() {
        val matrix = listOf(
            listOf(1, 2, 3, 4),
            listOf(12, 13, 14, 5),
            listOf(11, 16, 15, 6),
            listOf(10, 9, 8, 7)
        )

        val output = spiralTraverse(matrix)

        assertThat(output).isEqualTo((1..16).toList())
    }
}