package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NodeDepthsTest {

    @Test
    fun testNodeDepthsWithSingleNodeTree() {
        val tree = BinaryTree(1)

        val result = nodeDepths(tree)

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun testNodeDepthsWithSingleChildNode() {
        val tree = BinaryTree(1, BinaryTree(2))

        val result = nodeDepths(tree)

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun testNodeDepthsWithRightSkewedTree() {
        val tree = BinaryTree(1, null, BinaryTree(2, null, BinaryTree(3)));

        val result = nodeDepths(tree)

        assertThat(result).isEqualTo(3)
    }

    @Test
    fun testNodeDepthsWithComplexTree() {
        val tree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 4,
                    left = BinaryTree(8),
                    right = BinaryTree(9)
                ),
                right = BinaryTree(
                    value = 5
                )
            ),
            right = BinaryTree(
                value = 3,
                left = BinaryTree(6),
                right = BinaryTree(7)
            )
        )

        val result = nodeDepths(tree)

        assertThat(result).isEqualTo(16)
    }

}