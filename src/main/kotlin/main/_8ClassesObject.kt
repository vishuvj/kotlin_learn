package main

fun main() {
    val mustang = Car1("Mustang", "petrol", 550)
    val ford = Car1("ford", "diesel", 220)
    println("${mustang.name}, ${mustang.type}, ${mustang.kmRan}")
    mustang.driveCar()
}

class Car1(val name: String, val type: String, val kmRan: Int) {

    fun driveCar() {
        println("$name Car is driving")
    }

    fun applyBreaks() {
        println("Applied Breaks")
    }
}
