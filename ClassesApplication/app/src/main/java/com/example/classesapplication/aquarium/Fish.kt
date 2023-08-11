package com.example.classesapplication.aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(friendly = true, volumeNeeded = 9) {
        println("Running seconder constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("Contrcuted fish of size $volumeNeeded the actual size is ${this.size}")
    }
}


enum class Colour(val rgb: Int){
    Red(0XFF0000),
    Green(0X00FF00),
    Blue(0X0000FF),
    YELLOW(0xFFFF00)
}

sealed class Seal

class SeaLion: Seal()

class Walrus: Seal()

fun matchSeal(seal : Seal): String{
    return when(seal)
    {
        is Walrus -> "Walrus"
        is SeaLion -> "SeaLion"
    }
}