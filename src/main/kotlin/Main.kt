package org.example

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {
    val result = "fasljakjapjfajfaoijaioaVISHALajgaja"
    val target = "VISHAL"

    // Find the index of "VISHAL"
    val index = result.indexOf(target)

    // Check if "VISHAL" exists in the string
    if (index != -1) {
        // Print all characters before "VISHAL"
        println(result.substring(0, index))
    } else {
        println("Substring '$target' not found.")
    }
    val string = "vishal jadon"
    println(string)
    println(string.trim())
    val dateString = "12-11-2024"
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val userSelectedDate = LocalDate.parse(dateString, formatter)
    println("Hourly: " + calculateTotalDays(userSelectedDate, "hourly", 0, 1))
    println("Daily: " + calculateTotalDays(userSelectedDate, "daily", 0, 0))
    println("Weekly: " + calculateTotalDays(userSelectedDate, "weekly", 2, 2))
    println("Monthly: " + calculateTotalDays(userSelectedDate, "monthly", 2, 3))
    println("***********===============*************")
    println(calculatePrice(5, 15.0))
}

private fun calculatePrice(quantity: Int, price: Double): Double {
    return quantity * price
}

private fun calculateTotalDays(
    startDate: LocalDate,
    maxDuration: String,
    weekMonth: Int,
    dayHour: Int
): Long {
    return when (maxDuration) {
        "hourly", "daily" -> dayHour.toLong()
        "weekly" -> weekMonth * 7 + dayHour.toLong()
        "monthly" -> {
            val futureDate = startDate.plusMonths(weekMonth.toLong())
            val daysInMonth = ChronoUnit.DAYS.between(startDate, futureDate)
            daysInMonth + dayHour // Add any additional days
        }

        else -> 0L
    }
}
