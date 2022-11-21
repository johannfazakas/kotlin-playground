package ro.johann.playground.kotlin.algo.sort

fun mergeSort(input: MutableList<Int>) {
    mergeSort(input, 0, input.size - 1)
}

private fun mergeSort(input: MutableList<Int>, left: Int, right: Int) {
    if (left >= right) {
        return
    }
    val middle = (left + right) / 2
    mergeSort(input, left, middle)
    mergeSort(input, middle + 1, right)
    combine(input, left, middle, right)
}

private fun combine(input: MutableList<Int>, left: Int, middle: Int, right: Int) {
    val leftPart = input.subList(left, middle + 1).toMutableList()
    val rightPart = input.subList(middle + 1, right + 1).toMutableList()

    var leftIndex = 0
    var rightIndex = 0
    var index = left

    while (leftIndex < leftPart.size && rightIndex < rightPart.size) {
        if (leftPart[leftIndex] < rightPart[rightIndex]) {
            input[index] = leftPart[leftIndex]
            leftIndex++
        } else {
            input[index] = rightPart[rightIndex]
            rightIndex++
        }
        index++
    }

    while (leftIndex < leftPart.size) {
        input[index] = leftPart[leftIndex]
        leftIndex++
        index++
    }

    while (rightIndex < rightPart.size) {
        input[index] = rightPart[rightIndex]
        rightIndex++
        index++
    }
}
