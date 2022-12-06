package ro.johann.playground.kotlin.effective

fun main() {
    sleep(timeMillis = 100) // helps in readability and safeness
    sleep(Millis(100)) // types are even better
    sleep(100.ms) // this is also on option
    sleep(Millis(100), message = "Boo") // it is best to name default args
}

private fun sleep(timeMillis: Int) {

}

private fun sleep(time: Millis, message: String = "hello") {

}

private val Int.ms
    get() = Millis(this)

@JvmInline
value class Millis(val timeMillis: Int)
