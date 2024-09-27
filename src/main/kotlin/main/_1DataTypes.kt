package main

fun main() {
    val instance = _1DataTypes()
    instance.dataTypeAndVariables()
    instance.operators()
}

class _1DataTypes {
    fun dataTypeAndVariables() {
        var name: String = "Vishal"
        val age: Int = 25
        val double: Double = 25.24
        val char: Char = 'C'

        println("$name, $age, $double, $char")
    }

    fun operators() {
        var i: Int = 10
        println(i++ + ++i) // it save value then update to 11 then same time updated value save
    }
}