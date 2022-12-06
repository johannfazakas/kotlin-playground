package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunLengthEncodingTest {

    @Test
    fun `run length for input not requiring compression`() {
        assertThat(runLengthEncoding("ABC")).isEqualTo("1A1B1C")
    }

    @Test
    fun `run length for input requiring compression`() {
        assertThat(runLengthEncoding("AAABBC")).isEqualTo("3A2B1C")
    }

    @Test
    fun `run length for input requiring long compression`() {
        assertThat(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD")).isEqualTo("9A4A2B4C2D")
    }
}