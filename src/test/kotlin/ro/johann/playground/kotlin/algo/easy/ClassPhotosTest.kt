package ro.johann.playground.kotlin.algo.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassPhotosTest {
    @Test
    fun `should allow class photos when single value lists and reds are taller`() {
        val redShirtHeights = mutableListOf(3)
        val blueShirtHeights = mutableListOf(2)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isTrue
    }

    @Test
    fun `should allow class photos when single value lists and blues are taller`() {
        val redShirtHeights = mutableListOf(2)
        val blueShirtHeights = mutableListOf(3)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isTrue
    }

    @Test
    fun `should not allow class photos when single value lists and blues equal with reds`() {
        val redShirtHeights = mutableListOf(3)
        val blueShirtHeights = mutableListOf(3)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isFalse
    }

    @Test
    fun `should allow class photos when blues taller than reds without sorting`() {
        val redShirtHeights = mutableListOf(5, 8, 1, 3, 4)
        val blueShirtHeights = mutableListOf(6, 9, 2, 4, 5)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isTrue
    }

    @Test
    fun `should allow class photos when blues taller than reds`() {
        val redShirtHeights = mutableListOf(1, 3, 8, 4, 5)
        val blueShirtHeights = mutableListOf(9, 2, 4, 5, 6)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isTrue
    }

    @Test
    fun `should allow class photos when reds taller than blues`() {
        val redShirtHeights = mutableListOf(9, 2, 4, 5, 6, 98)
        val blueShirtHeights = mutableListOf(1, 3, 8, 4, 5, 3)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isTrue
    }

    @Test
    fun `should not allow class photos when rule does not apply`() {
        val redShirtHeights = mutableListOf(5, 8, 7, 3, 4)
        val blueShirtHeights = mutableListOf(6, 9, 2, 4, 5)
        val classPhotos = classPhotos(redShirtHeights, blueShirtHeights)

        assertThat(classPhotos).isFalse
    }
}