import java.text.SimpleDateFormat
import java.util.Date
import kotlin.math.PI

fun main() {
//    helloWorld()
//    kotlinVersionFun()
//    displayCurrentDateTime()
//    userInputDisplay()
//    subAddMulDiv(6, 4)
//    checkOddEven()
//    findMinMaxWithFunction(5, 6)
    /// without
//    val numbers = listOf(4, 6, 8, 2, 3, 23, 67, 54)
//    val (min, max) = finMinMaxWithoutFunction(numbers)
//    println("minimum number is:$min, maximum number is: $max")

//    findFactorial(5)

//    checkLeapYear()
    calculateAreaParameter(5.6)

}


/** 1. Write a Kotlin program to print 'Hello' on screen and your name on a separate line.**/
fun helloWorld() {
    println("Hello\nVishal Thakur")
}

/** 2. Write a Kotlin program to find out what version of Kotlin you are using.**/
fun kotlinVersionFun() {
    println("kotlin Version: ${KotlinVersion.CURRENT}")
}

/** 3. Write a Kotlin program to display the current date and time.**/
fun displayCurrentDateTime() {
    val currentDate = Date()
    val dateFormat = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
    val formattedDate = dateFormat.format(currentDate)
    println("Current date & time : ${formattedDate}")
}

/** 4. Write a Kotlin program to take user input and display it. **/

fun userInputDisplay() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val age = readLine()!!.toInt()
//    val age = readLine()
//    val convertedAge = age!!.toInt()
    println("$name, $age")
}

/** 5. Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers. **/
fun subAddMulDiv(a: Int, b: Int) {
    val addition = a + b
    val subtraction = a - b
    val multiplication = a * b
    val division = a / b
    println("Addition of $a and $b is : $addition")
    println("Subtraction of $a and $b is : $subtraction")
    println("Multiplication of $a and $b is : $multiplication")
    println("Division of $a and $b is : $division")
}

/** 6. Write a Kotlin program to check if a given number is even or odd.**/
fun checkOddEven() {
    print("Enter a value to check odd or even: ")
    val a = readLine()!!.toInt()
    val result = if (a % 2 == 0) "Even" else "Odd"
    println("$a is $result mumber")
}

/** 7. Write a Kotlin program to find the maximum and minimum of three numbers.**/
// with function
fun findMinMaxWithFunction(a: Int, b: Int) {
    val min = minOf(a, b)
    val max = maxOf(a, b)
    println("minimum value is: $min \nmaximum value is: $max")
}

fun finMinMaxWithoutFunction(numbers: List<Int>): Pair<Int, Int> {
    var min = numbers[0]
    var max = numbers[0]

    for (num in numbers) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }
    return Pair(min, max)
}

/** 8. Write a Kotlin program to find the factorial of a given number.**/

fun findFactorial(value: Int) {
    var result = 1
    for (i in 1..value) {
        result *= i
    }
    println("Factorial of $value is: $result")
}

/** 9. Write a Kotlin program to check if a given year is a leap year.**/

//fun checkLeapYear() {
//    print("Enter a year: ")
//    val year = readLine()
//    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
//        println("$year is a leap year")
//    else
//        println("$year is not a leap year")
//}


/** 10. Write a Kotlin program to calculate the area and perimeter of a circle. **/
fun calculateAreaParameter(radius: Double?) {

    if (radius == null || radius <= 0) "Please enter a valid value"

    fun area(radius: Double): Double {
        return PI * radius * radius
    }

    fun perimeter(radius: Double): Double {
        return 2 * PI * radius
    }
    println("Area : ${area(radius!!)}")
    println("Perimeter : ${perimeter(radius)}")
}

/** 11. Write a Kotlin program to convert temperature from Celsius to Fahrenheit and vice versa.**/
