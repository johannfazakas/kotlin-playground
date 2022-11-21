package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemoveDuplicatesFromLinkedListTest {

    @Test
    fun `remove linked list duplicates when there are none`() {
        val linkedList = LinkedList(1, LinkedList(2, LinkedList(6)))

        removeDuplicatesFromLinkedList(linkedList)

        assertThat(linkedList.value).isEqualTo(1)
        assertThat(linkedList.next?.value).isEqualTo(2)
        assertThat(linkedList.next?.next?.value).isEqualTo(6)
        assertThat(linkedList.next?.next?.next).isNull()
    }

    @Test
    fun `remove linked list duplicates when duplicates exist`() {
        val linkedList = LinkedList(1, LinkedList(1, LinkedList(3, LinkedList(4, LinkedList(4, LinkedList(4, LinkedList(5, LinkedList(6, LinkedList(6)))))))))

        removeDuplicatesFromLinkedList(linkedList)

        assertThat(linkedList.value).isEqualTo(1)
        assertThat(linkedList.next?.value).isEqualTo(3)
        assertThat(linkedList.next?.next?.value).isEqualTo(4)
        assertThat(linkedList.next?.next?.next?.value).isEqualTo(5)
        assertThat(linkedList.next?.next?.next?.next?.value).isEqualTo(6)
    }
}
