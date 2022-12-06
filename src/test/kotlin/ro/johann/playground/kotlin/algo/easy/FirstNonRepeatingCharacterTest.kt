package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FirstNonRepeatingCharacterTest {

    @Test
    fun `first non repeating character when all repeat`() {
        assertThat(firstNonRepeatingCharacter("abccba")).isEqualTo(-1)
    }

    @Test
    fun `first non repeating character with algo export example`() {
        assertThat(firstNonRepeatingCharacter("abcdcaf")).isEqualTo(1)
    }
}