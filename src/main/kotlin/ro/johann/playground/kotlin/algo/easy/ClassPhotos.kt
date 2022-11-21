package ro.johann.playground.kotlin.algo.easy

// time O(n log(n))
// space O(1)
fun classPhotos(redShirtHeights: MutableList<Int>, blueShirtHeights: MutableList<Int>): Boolean {
    require(redShirtHeights.size == blueShirtHeights.size) { "Somebody has the wrong shirt." }
    require(redShirtHeights.size > 0 && blueShirtHeights.size > 0) { "Nobody in the class." }

    redShirtHeights.sort()
    blueShirtHeights.sort()
    val (tallerGroup, smallerGroup) = if (redShirtHeights[0] > blueShirtHeights[0])
        redShirtHeights to blueShirtHeights
    else
        blueShirtHeights to redShirtHeights
    return redShirtHeights.indices.all { tallerGroup[it] > smallerGroup[it] }
}
