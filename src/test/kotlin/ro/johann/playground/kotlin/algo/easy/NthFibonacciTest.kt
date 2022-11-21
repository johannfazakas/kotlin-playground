package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class NthFibonacciTest {
    @ParameterizedTest
    @MethodSource("fibonacciDataSource")
    fun `test nth fibonacci`(input: Int, expected: Int) {
        Assertions.assertThat(getNthFib(input)).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun fibonacciDataSource(): Stream<Arguments> = Stream.of(
            Arguments.of(1, 0),
            Arguments.of(2, 1),
            Arguments.of(3, 1),
            Arguments.of(4, 2),
            Arguments.of(5, 3),
            Arguments.of(6, 5),
            Arguments.of(7, 8),
            Arguments.of(8, 13),
            Arguments.of(9, 21),
            Arguments.of(10, 34),
        )
    }
}