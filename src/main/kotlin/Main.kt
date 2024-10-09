package org.example

fun main() {
//    println("Hello World!")
//    val string1 = "vishal"
//    val string2 = "Vishal"
//    println(string1.compareTo(string2))
    continueAndBreak()
}

private fun learnArray() {
    val arr = arrayOf("BMW", "VOLVO", "Mercedes")
    println(arr.size)

}

private fun continueAndBreak() {
    var i = 0
    while (i < 10) {
        if (i == 4) {
            break
        }
        println(i)
        i++
    }

}