/** Write a Kotlin program to check if a given number is positive, negative, or zero. **/
fun main() {
    checkNumberIsPositiveOrNegative(5)
    checkNumberDivisibleBy7(24)
    checkVowel('A')
    checkStringCharacterVowel("Hello")
    printFirstTenNaturalNumber()
}

fun checkNumberIsPositiveOrNegative(number: Int) {
    if (number > 0) {
        println("$number is position")
    } else if (number < 0) {
        println("$number is negative")
    } else println("The number is constant")
}

/** Write a Kotlin program to check if a given number is divisible by 7. **/
fun checkNumberDivisibleBy7(number: Int) {
    if (number % 7 == 0) {
        println("$number is divisible by 7")
    } else {
        println("$number is not divisible by 7")
    }
}

/** Write a Kotlin program to check if a given character is a vowel or a consonant. **/
fun checkVowel(character: Char) {

    if (character.toLowerCase() in listOf('a', 'e', 'i', 'o', 'u'))
        println("$character is a Vowel")
    else println("$character is a Consonant")
}

fun checkStringCharacterVowel(str: String) {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    for (character in str.toLowerCase()) {
        if (character in vowels)
            println("$character is Vowel")
        else println("$character is Consonant")
    }
}

/** Write a Kotlin program to print the first 10 natural numbers. **/
fun printFirstTenNaturalNumber() {
    for (i in 1..10) {
        if (i == 10) print(i)
        else
            print("$i, ")
    }
}

/** Write a Kotlin program to print the Pascal's triangle of a given number of rows. **/
//fun printPascalTriangle(num: Int) {
//    var space = 1
//    var value = 1
//    for (i in 1 until num) {
//        for (j in 1 until (num - 1)) {
//            print(" ")
//            if (i == 1 && j == 1) {
//                value = 1
//            }
//            else{
//                value=
//            }
//
//        }
//    }
//}
