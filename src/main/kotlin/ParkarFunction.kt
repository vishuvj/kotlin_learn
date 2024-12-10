package org.example

import java.util.*

fun main() {
    val parkar = ParkarFunction()
    println(parkar.getDurationHint("hourly"))
    val hour = "HOURLY"
    println(hour.lowercase().capitalize())
//    println(hour.)
}

class ParkarFunction {
    fun getDurationHint(maxDur: String): String = when (maxDur) {
        "hourly" -> "Select Hours"
        "daily" -> "Select Days"
        "weekly" -> "Select Weeks"
        "monthly" -> "Select Months"
        else -> "Select"
    }

    fun capitalizeFirstLetter(input: String): String {
        return input.replaceFirstChar { it.uppercase() }
    }

}

fun String.capitalizeFirstLetter(): String =
    replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
