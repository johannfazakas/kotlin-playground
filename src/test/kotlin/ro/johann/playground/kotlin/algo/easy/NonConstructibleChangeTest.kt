package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class NonConstructibleChangeTest {

    @ParameterizedTest
    @MethodSource("testCoinSetProvider")
    fun testNonConstructibleChange(expectedResult: Int, coins: MutableList<Int>) {
        assertThat(nonConstructibleChange(coins)).isEqualTo(expectedResult)
    }

    companion object {
        @JvmStatic
        fun testCoinSetProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(4, mutableListOf(1, 2, 5)),
            Arguments.of(1, mutableListOf(2, 4)),
            Arguments.of(1, mutableListOf<Int>()),
            Arguments.of(20, mutableListOf(5, 7, 1, 1, 2, 3, 22)),
            Arguments.of(8, mutableListOf(1, 2, 4)),
            Arguments.of(16, mutableListOf(1, 2, 4, 8))
        )
    }
}