package org.example.practice

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main() {
    val obj = PracticeString()
    obj.findCharacterOccurrence("Vishallljaddoon")
    val totalDays1 = obj.calculateTotalDays("days", 1, 1)
    val totalDays2 = obj.calculateTotalDays("weeks", 1, 1)
    val totalDays3 = obj.calculateTotalDays("months", 1, 1)
    println("Total Days1: " + totalDays1)
    println("Total Days2: " + totalDays2)
    println("Total Days3: " + totalDays3)

}

class PracticeString {
    fun findCharacterOccurrence(string: String) {
        val strMap = mutableMapOf<Char, Int>()
        for (i in string.toLowerCase()) {
//            println("value of i is: $i")
            if (strMap.containsKey(i)) {
                strMap[i] = strMap[i]!! + 1
                println("contains")
            } else {
                strMap.put(i, 1)
                println("not contains")
            }
        }
        for ((key, value) in strMap) {
            println("$key occurrence is : $value")
        }
    }

    fun calculateTotalDays(maxDuration: String, quantity: Int, additionalDays: Int): Long {
        return when (maxDuration) {
            "hours" -> 0L
            "days" -> quantity + additionalDays.toLong()
            "weeks" -> quantity * 7 + additionalDays.toLong()
            "months" -> {
                val today = LocalDate.now()
                val futureDate = today.plusMonths(quantity.toLong())
                val daysInMonth = ChronoUnit.DAYS.between(today, futureDate) + 1
                daysInMonth + additionalDays // Add any additional days
            }

            else -> 0L
        }
    }

}