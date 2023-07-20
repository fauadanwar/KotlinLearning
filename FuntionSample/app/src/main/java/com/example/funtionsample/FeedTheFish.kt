package com.example.funtionsample

import java.util.Random

fun main() {
    FeedTheFish()
    val rollDice = { Random().nextInt(12) + 1}
    val rollDice0 = { sides: Int ->
        Random().nextInt(sides) + 1
    }
    val rollDice1 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    gamePlay(rollDice2(4))

}
fun gamePlay(diceRoll: Int){
    // do something with the dice roll
    println(diceRoll)
}

fun FeedTheFish() {
    val day = randomDay()
    println("Today is ${day} and the fish eats ${fishFood(day)}")
    println("should change water = ${if (shouldChangeWater(day)) "YES" else "NO"}")
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean
{
    var availableTankSize = tankSize
    if (hasDecorations)
    {
        availableTankSize = tankSize * 0.8
    }
    return currentFish.sum() + fishSize <= availableTankSize
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean
{
    return when{
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}
fun fishFood(day: String): String {
    return when (day) {
        "Sunday" -> "Flakes"
        "Monday" -> "Pellets"
        "Tuesday" -> "Redworm"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "Nothing"
    }
}

fun randomDay(): String {
    val days = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return days[Random().nextInt(7)]
}
