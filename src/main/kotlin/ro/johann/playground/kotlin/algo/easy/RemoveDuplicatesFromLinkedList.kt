package ro.johann.playground.kotlin.algo.easy

open class LinkedList(val value: Int, var next: LinkedList? = null)

fun removeDuplicatesFromLinkedList(linkedList: LinkedList): LinkedList {
    var node: LinkedList? = linkedList
    while (node != null) {
        if (node.value == node.next?.value) {
            node.next = node.next?.next
        } else {
            node = node.next
        }
    }
    return linkedList
}
