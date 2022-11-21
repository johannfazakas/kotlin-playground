package ro.johann.playground.kotlin.algo.easy

data class BST(var value: Int, var left: BST? = null, var right: BST? = null)

fun findClosestValueInBst(tree: BST, target: Int): Int =
    findClosestValueInBst(tree, target, tree.value)

private fun findClosestValueInBst(tree: BST, target: Int, closest: Int): Int =
    findNext(target, tree)
        ?.let { findClosestValueInBst(it, target, findClosest(target, closest, it.value)) }
        ?: closest

private fun findNext(target: Int, tree: BST) =
    if (target < tree.value) tree.left else tree.right

private fun findClosest(target: Int, candidateA: Int, candidateB: Int): Int =
    if (Math.abs(target - candidateA) < Math.abs(target - candidateB)) candidateA else candidateB
