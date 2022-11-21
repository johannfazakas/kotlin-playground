package ro.johann.playground.kotlin.algo.easy

class Node(val name: String, val children: MutableList<Node> = mutableListOf()) {

    // time: O(n), space: O(n)
    fun depthFirstSearch(): List<String> {
        return depthFirstSearch(mutableListOf())
    }

    private fun depthFirstSearch(accumulator: MutableList<String>): List<String> {
        accumulator.add(name)
        children.forEach { it.depthFirstSearch(accumulator) }
        return accumulator
    }
}
