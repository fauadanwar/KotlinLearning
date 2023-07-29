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