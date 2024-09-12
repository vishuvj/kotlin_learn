import kotlin.reflect.KFunction2

fun main() {
//    println(addition(5, 4))
//    println(addition(5.5, 4.5))
// Named parameter (if lots of parameter in a function then you can give value with that name )
//    println(addition(a = 5, b = 2))

    // store function in variable
    // Note: not store a overloaded function into variable in this case addition
    var fn: KFunction2<Int, Int, Int> = ::sum
    println(fn(4, 6))
}

// function overloading means same name with different parameters
fun addition(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun addition(a: Double, b: Double): Double {
    val result = a + b
    return result
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}
