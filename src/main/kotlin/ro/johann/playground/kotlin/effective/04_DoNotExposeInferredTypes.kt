package ro.johann.playground.kotlin.effective

open class Animal
class Zebra: Animal()

fun main() {
//    var animal = Zebra()
    var animal: Animal = Zebra()
    animal = Animal()
}