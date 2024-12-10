package org.example.main

fun main() {
    val array13 = _13Arrays()
//    array13.sortArrayWithMethod()
    val numbersArray = arrayOf(2, 3, 4, 9, 8, 1)
    array13.bubbleSortAscending(numbersArray)
    println(numbersArray.contentToString())  // Output: [1, 2, 3, 5, 8]
}


class _13Arrays {
    fun printArrayElement() {
        val array1 = arrayOf(4, 5, 6, 3, 2, 29)
        val numbers = Array(6) { it * 2 }
        val defaultValueArray = Array(5) { 0 }  // Creates [0, 0, 0, 0, 0]
        val arr1 = listOf(1, 3, 5, 6).toIntArray()
        val list1 = listOf(5, 4, 7, 2, 1, 9, 10)


        /**Print Array and list values **/
        array1.forEach { print("$it ") } // for array
        println(list1)
        println(numbers.contentToString())
        // using for loop
        for (i in array1) {
            print("$i ")
        }

        //using joinToString()
        println()
        println(numbers.joinToString(", "))
    }

    fun sortArrayElementWithMethod() {
        val numbers = arrayOf(5, 2, 10, 12, 56, 1, 9)
        println("array minimum number is : ${numbers.minOrNull()}")
        println("array maximum number is : ${numbers.maxOrNull()}")
        println()
        // another way to get min or max
        val sortedArray = numbers.sortedArray()
        println("Sorted array first element: ${sortedArray.first()}")
        println("Sorted array last element: ${sortedArray.last()}")
        println()
    }

    fun sortArrayElementWithoutMethod() {
        val numbers = arrayOf(5, 2, 10, 12, 56, 1, 9)
        var smallest = numbers[0]
        var largest = numbers[0]
        for (num in numbers) {
            if (num > largest) {
                largest = num
            }
            if (num < smallest) {
                smallest = num
            }
        }
        println("Smallest value is: $smallest \nLargest value is : $largest")
    }

    fun sortArrayWithMethod() {
        val numbers = arrayOf(5, 2, 10, 12, 56, 1, 9)
        numbers.sort()
        println("Ascending Order \n${numbers.contentToString()}")
        numbers.sortDescending()
        println("Descending Order \n${numbers.contentToString()}")
    }

    fun bubbleSortAscending(arr: Array<Int>) {
        val n = arr.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }

}
