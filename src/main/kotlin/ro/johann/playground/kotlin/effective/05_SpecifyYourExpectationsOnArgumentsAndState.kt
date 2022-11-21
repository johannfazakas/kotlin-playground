package ro.johann.playground.kotlin.effective

class Something(var blocked: Boolean) {

    fun doSomething(num: Int = 1) {
        require(num <= 3) { "Error for invalid arguments!" }
        check(!blocked) { "Error for invalid state" }
    }
}

fun main() {
    Something(false).doSomething(4)
}
