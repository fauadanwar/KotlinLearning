package com.example.funtionsample

fun main() {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("happy", "Sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {
    return when {
        rainySad(mood, weather, temperature) -> "stay in bed"
        highTemp(temperature) -> "go swimming"
        happySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}

fun happySunny(mood: String, weather: String) = mood == "happy" && weather == "Sunny"
fun rainySad(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun highTemp(temp : Int) = temp > 35