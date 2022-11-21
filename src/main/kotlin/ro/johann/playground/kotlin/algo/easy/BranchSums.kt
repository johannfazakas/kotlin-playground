package ro.johann.playground.kotlin.algo.easy

// time 0(n) space O(n)
fun branchSums(root: BinaryTree): List<Int> {
    val sums = mutableListOf<Int>()
    accumulateBranchSums(sums, root, 0)
    return sums
}

private fun accumulateBranchSums(sums: MutableList<Int>, node: BinaryTree, previousSum: Int) {
    val currentSum = previousSum + node.value
    if (node.isLeaf()) {
        sums.add(currentSum)
    }
    node.left?.let { accumulateBranchSums(sums, it, currentSum) }
    node.right?.let { accumulateBranchSums(sums, it, currentSum) }
}

private fun BinaryTree.isLeaf(): Boolean = this.left == null && this.right == null
