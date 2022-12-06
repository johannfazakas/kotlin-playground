package ro.johann.playground.kotlin.algo.easy

// time O(n), space O(d), where d is the number of distinct input characters
fun generateDocument(characters: String, document: String): Boolean {
    val charsMap = characters.asSequence().fold(mutableMapOf<Char, Int>()) { accumulator, char ->
        accumulator.also {
            it[char] = it[char]?.let { count -> count + 1 } ?: 1
        }
    }

    for (char in document) {
        charsMap[char]
            ?.takeIf { it > 0 }
            ?.also { charsMap[char] = it - 1 }
            ?: return false
    }
    return true
}

// time O(n log n), space O(n)
fun generateDocumentV1(characters: String, document: String): Boolean {
    val sortedChars = characters.toList().sorted()
    val sortedDoc = document.toList().sorted()

    var (charsIndex, docIndex) = 0 to 0
    while (docIndex < sortedDoc.size) {
        while (charsIndex < sortedChars.size && sortedChars[charsIndex] < sortedDoc[docIndex]) charsIndex++
        if (charsIndex < sortedChars.size && sortedChars[charsIndex] == sortedDoc[docIndex]) {
            charsIndex++
            docIndex++
        } else {
            return false
        }
    }
    return true
}
