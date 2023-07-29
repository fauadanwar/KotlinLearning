package com.example.classesapplication.aquarium

import kotlin.math.PI

open class Aquarium(height: Int = 24, width: Int = 12, length: Int = 12) {
    var height: Int = 24
    var width: Int = 12
    var length: Int = 12
    open var volume: Int
        get() = height * width * length / 1000
        set(value) { println("new Volume = ${value} liters")
        }
    open var water = volume * 0.9
    constructor(numberOFFish: Int): this() {
        val water: Int = numberOFFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / length *width).toInt()
    }
}
class TowerTank: Aquarium() {
    override var volume: Int
        get() = (height * width * length / 1000 * PI).toInt()
        set(value) { println("new Volume = ${value} liters")
        }
    override var water = volume * 0.8
}
