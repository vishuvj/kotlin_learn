package practice

fun main() {
    val practiceObj = Practice()
    practiceObj.fizzBuzz(100)

}

class Practice {
    /*Write a function that prints numbers from 1 to 100. For multiples of 3, print "Fizz", for multiples of 5 print "Buzz"
    and for multiples of both 3 and 5, print "FizzBuzz".
 */
    fun fizzBuzz(number: Int) {
        for (i in 1..number) {
            if (i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            } else if (i % 3 == 0) {
                println("Fizz")
            } else if (i % 5 == 0) {
                println("Buzz")
            } else {
                println(i)
            }
        }
    }

    /** Number Patter**/
    fun numberPatter() {

    }

}