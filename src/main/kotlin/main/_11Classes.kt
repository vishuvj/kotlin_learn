package org.example.main


fun main() {
    val myClass = _11Classes()
    myClass.sound()
}

open class Animal {
    fun sound() {
        println("Bark")
    }

}

class _11Classes : Animal() {

}