package com.example.funtionsample

import java.util.Calendar

fun main() {
    println("What day is it today?")
    val dayOfWeek = DayOfWeek()
    dayOfWeek.currentDayOfWeek()
}

class DayOfWeek {
    fun currentDayOfWeek()
    {
        when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
        {
            1 -> println("Sunday")
            2 -> println("Monday")
            3 -> println("Tuesday")
            4 -> println("Wednesday")
            5 -> println("Thursday")
            6 -> println("Friday")
            7 -> println("Saturday")
        }
    }
}