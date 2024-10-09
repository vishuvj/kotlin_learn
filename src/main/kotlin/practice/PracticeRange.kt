package org.example.practice

fun main() {
    val practiceRange = PracticeRange()
//    practiceRange.findEvenNumberStartToEnd(1, 20)
//    println(practiceRange.checkNumberIsInRange(11))
//    practiceRange.printOddNumberInReverse(1, 20)
//    practiceRange.countMultiples(1, 20, 3)
//    println(practiceRange.checkIsAlphabet('1'))
//    println(practiceRange.sumOfRange(2, 57))
//    practiceRange.findVowels('a', 'l')
}

class PracticeRange {
    /** Write a function that takes two integers, start and end, and prints all even numbers in the range [start, end].**/
    fun findEvenNumberStartToEnd(start: Int, end: Int) {
        for (i in start..end) {
            if (i % 2 == 0) {
                println("even number : $i")
            }
        }
    }

    /** Write a function that checks if a given integer x falls within the range [10, 20]. **/
    fun checkNumberIsInRange(num1: Int): Boolean {
        return num1 in 10..20
    }

    /** 3. Reverse a Range and Print Odd Numbers **/
    fun printOddNumberInReverse(start: Int, end: Int) {
        for (i in end downTo start) {
            if (i % 2 != 0) {
                println(i)
            }
        }
    }

    /** Write a function that counts how many numbers in a given range [start, end] are divisible by a given divisor. **/
    fun countMultiples(start: Int, end: Int, divisor: Int) {
        var count = 0
        for (i in start..end) {
            if (i % divisor == 0) {
                println("$i is divisible by: $divisor")
                count++
            }
        }
        println("Total $count numbers are divisible by $divisor")
    }

    /** 5. Check if a Character is in Alphabet Range **/
    fun checkIsAlphabet(char: Char): Boolean {
        val charTolowerCase = char.toLowerCase()
        return (charTolowerCase in 'a'..'z')
    }

    /** Write a function that calculates and returns the sum of all numbers within a range [start, end]. **/
    fun sumOfRange(start: Int, end: Int): Int {
        var sum = 0
        for (i in start..end) {
            sum += i
        }
        return sum
    }

    /** Write a function that counts how many vowels (a, e, i, o, u) are present in a given character range **/
    fun findVowels(startChar: Char, endChar: Char) {
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        for (i in startChar..endChar) {
            if (i in vowels) {
                println(i)
            }
        }
    }

//    fun filterAndFindPrimeNumber(start: Int, end: Int) {
//        for(i in start..end){
//            if (i)
//        }
//    }
}