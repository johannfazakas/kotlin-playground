package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaesarCipherEncryptorTest {
    @Test
    fun `encrypt without alphabet start over`() {
        assertThat(caesarCipherEncryptor("abc", 1)).isEqualTo("bcd")
    }

    @Test
    fun `encrypt with alphabet start over`() {
        assertThat(caesarCipherEncryptor("xyz", 3)).isEqualTo("abc")
    }

    @Test
    fun `encrypt algo export example`() {
        assertThat(caesarCipherEncryptor("xyz", 2)).isEqualTo("zab")
    }
}