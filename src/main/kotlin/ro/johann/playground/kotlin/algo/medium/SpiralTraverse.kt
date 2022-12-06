package ro.johann.playground.kotlin.algo.medium

import kotlin.math.min

fun spiralTraverse(array: List<List<Int>>): List<Int> =
    (0 until array.maxDepth()).asSequence()
        .flatMap { depth -> array.spiralTraverse(depth) }
        .toList()

private fun <E> List<List<E>>.spiralTraverse(depth: Int): Sequence<E> = when {
    isPoint(depth) -> traversePoint(depth)
    isHorizontalLine(depth) -> traverseHorizontalLine(depth)
    isVerticalLine(depth) -> traverseVerticalLine(depth)
    else -> traverseSquare(depth)
}

private fun <E> List<List<E>>.traversePoint(depth: Int) = sequenceOf(this[depth][depth])

private fun <E> List<List<E>>.traverseHorizontalLine(depth: Int) =
    (depth..maxRow(depth)).asSequence().map { column -> this[depth][column] }

private fun <E> List<List<E>>.traverseVerticalLine(depth: Int) =
    (depth..maxColumn(depth)).asSequence().map { row -> this[row][depth] }

private fun <E> List<List<E>>.traverseSquare(depth: Int): Sequence<E> = let { matrix ->
    sequence {
        val maxColumn = matrix.maxColumn(depth)
        val maxRow = matrix.maxRow(depth)

        for (column in depth until maxColumn) yield(matrix[depth][column])
        for (row in depth until maxRow) yield(matrix[row][maxColumn])
        for (column in maxColumn downTo depth + 1) yield(matrix[maxRow][column])
        for (row in maxRow downTo depth + 1) yield(matrix[row][depth])
    }
}

private fun <E> List<List<E>>.maxDepth() = (min(this.size, this[0].size) + 1) / 2

private fun <E> List<List<E>>.isPoint(depth: Int) =
    depth == maxColumn(depth) && depth == maxRow(depth)

private fun <E> List<List<E>>.isVerticalLine(depth: Int) = depth == maxColumn(depth)

private fun <E> List<List<E>>.isHorizontalLine(depth: Int) = depth == maxRow(depth)

private fun <E> List<List<E>>.maxColumn(depth: Int) = this[0].size - 1 - depth

private fun <E> List<List<E>>.maxRow(depth: Int) = this.size - 1 - depth
