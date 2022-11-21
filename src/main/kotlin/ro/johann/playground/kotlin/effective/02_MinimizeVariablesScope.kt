package ro.johann.playground.kotlin.effective

val primes: Sequence<Int> = sequence {
    var numbers = generateSequence(2) { it + 1 }
    while (true) {
        val prime = numbers.first()
        yield(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
}

fun main() {
    primes.take(25).forEach(::println)
}
