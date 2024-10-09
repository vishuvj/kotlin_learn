package org.example.main

fun main() {
    val name: String? = "Kotlin"
    name?.let {
        println("Hello, $it")  // Accessing the object as `it`
        it.length
        println(result) // Output: Hello, World!
    }
}

// with
val result = StringBuilder().run {
    append("Hello, ")
    append("World!")
    toString() // Returns "Hello, World!"
}

