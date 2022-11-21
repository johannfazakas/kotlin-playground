package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BranchSumsTest {

    @Test
    fun testBranchSumsWithSingleElementTree() {
        val tree = BinaryTree(26)

        val result = branchSums(tree)

        assertThat(result).isEqualTo(listOf(26))
    }

    @Test
    fun testBranchSumsWithSimpleTree() {
        val tree = BinaryTree(3, BinaryTree(5), BinaryTree(7))

        val result = branchSums(tree)

        assertThat(result).isEqualTo(listOf(8, 10))
    }

    @Test
    fun testBranchSumsForLeftSkewedTrees() {
        val tree = BinaryTree(-13, BinaryTree(72, BinaryTree(0, BinaryTree(18))))

        val result = branchSums(tree)

        assertThat(result).isEqualTo(listOf(77))
    }

    @Test
    fun testBranchSumsForRightSkewedTrees() {
        val tree = BinaryTree(-7, null, BinaryTree(-5, null, BinaryTree(-23)))

        val result = branchSums(tree)

        assertThat(result).isEqualTo(listOf(-35))
    }

    @Test
    fun testBranchSums() {
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
                    value = 5,
                    left = BinaryTree(10),
                    right = null
                )
            ),
            right = BinaryTree(
                value = 3,
                left = BinaryTree(6),
                right = BinaryTree(7)
            )
        )
        val expectedSums = listOf(15, 16, 18, 10, 11)

        val result = branchSums(tree)

        assertThat(result).isEqualTo(expectedSums)
    }
}