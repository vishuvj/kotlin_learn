package org.example.main

fun main() {
    val x = 10;
    val y = 10;
    // normal if
    if (x > y) {
        println("x is greater than y")
    } else if (x < y) {
        println("x is less than y")
    } else {
        println("x is equal to y")
    }

    // if as an expression
    val result = if (x > y) {
        "x is greater than y"
    } else if (x < y) {
        "x is less than y"
    } else {
        "x is equal to y"
    }
    println(result)

    val result2 = if (x < y) "x is greater than y " else "x is less than y"
    println(result2)

    // when
    val animal = "Dog"
    val resultAnimal = when (animal) {
        "Horse" -> println("Horse")
        "Cat" -> println("Cat")
        "Dog" -> println("Dog")
        else -> println("animal not found")
    }
    println(resultAnimal)
}