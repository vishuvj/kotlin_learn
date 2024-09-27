package main

fun main() {
    val p1 = PersonLateinit("Vishal", 25)
    println("${p1.name} ,${p1.age}")
    p1.age = -12
    println(p1.age)
}

class PersonLateinit(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
            return field.toUpperCase()
        }
    var age: Int = ageParam // for setter just write below variable
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age should be greater than 0")
            }
        }

}