package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DepthFirstSearchTest {

    @Test
    fun `test with single node`() {
        val graph = Node("a")

        val nodes = graph.depthFirstSearch()

        assertThat(nodes).containsExactly("a")
    }

    @Test
    fun `test with simple graph`() {
        val graph = Node(
            "a", mutableListOf(
                Node("b"),
                Node("c")
            )
        )

        val nodes = graph.depthFirstSearch()

        assertThat(nodes).containsExactly("a", "b", "c")
    }

    @Test
    fun `test with complex graph`() {
        val graph = Node(
            "A", mutableListOf(
                Node("B", mutableListOf(
                    Node("E"),
                    Node("F", mutableListOf(
                        Node("I"),
                        Node("J")
                    ))
                )),
                Node("C"),
                Node("D", mutableListOf(
                    Node("G", mutableListOf(
                        Node("K")
                    )),
                    Node("H")
                )),
            )
        )

        val nodes = graph.depthFirstSearch()

        assertThat(nodes).containsExactly("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H")
    }
}