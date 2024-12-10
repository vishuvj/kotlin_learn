package org.example.main

fun main() {
    val car = Car("Ford", "Petrol", 5, 4)
    val p1 = Person("Vishal", "Haryana")


}

class Animal() { // this default constructor

}

// its a primary constructor
class Car(val name: String, val type: String, val seatCount: Int, val tyre: Int) {
    init {
        println("$name is created")
    }
}

class Person(val name: String, val age: Int, val city: String, val state: String) {

    init {
        println("$name person data is inserted")
    }

    /** // this is a secondary constructor in this when you create class object you don't have to define age or city   **/
    // whenever you create secondary constructor you have to call primary constructor
    constructor(nameParam: String, stateParam: String) : this(nameParam, 25, "gurgaon", stateParam)

}


//class Car(val name: String, val type: String, val seatCount: Int, tyre: Int) { //here tyre is a parameter or other is a property or you can not change parameter value after like property
//
//}