package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class ClosestValueInBstTest {

    @ParameterizedTest
    @MethodSource("testBstTreeProvider")
    fun testClosesValueInBstTree(expected: Int, target: Int, tree: BST) {
        assertThat(findClosestValueInBst(tree, target)).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun testBstTreeProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(13, 12, BST(10, BST(5, BST(2, BST(1)), BST(5)), BST(15, BST(13, null, BST(14)), BST(22)))),
            Arguments.of(100, 100, BST(100, BST(5), BST(150))),
            Arguments.of(-51, -70,
                BST(
                    value = 100,
                    left = BST(
                        value = 5,
                        left = BST(
                            value = 2,
                            left = BST(
                                value = 1,
                                left = BST(
                                    value = -51,
                                    left = BST(-403),
                                    right = null
                                ),
                                right = BST(1)
                            ),
                            right = null
                        ),
                        right = null
                    ),
                    right = null,
                )
            ),
        )
    }
}