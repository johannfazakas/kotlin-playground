package ro.johann.playground.kotlin.algo.easy

// Average: time O(n), space O(log n)
// Worst: time O(n), space O(n)
fun nodeDepths(root: BinaryTree): Int {
    return nodeDepthsV1(root, 0)
}

private fun nodeDepthsV1(node: BinaryTree?, level: Int): Int {
    return node
        ?.let { level + nodeDepthsV1(it.left, level + 1) + nodeDepthsV1(it.right, level + 1) }
        ?: 0
}
