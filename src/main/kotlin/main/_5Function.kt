package main

fun main() {
    oddEven(13)
    println(sum(2, 4))
    printMessage(5)
    printMessage()
}

// normal function
fun oddEven(num: Int) {
    val result = if (num % 2 == 0) "even" else "odd"
    println(result)
}

// one liner function
fun sum(num1: Int, num2: Int) = num1 + num2

//fun printMessage(count: Int) {
//
fun printMessage(count: Int = 2) { // this means if you pass nothing even i will print two times
    for (i in 1..count) {
        println("hello printMessage")
    }
}
