package com.example.classesapplication.aquarium

class Spice(name: String, val spiciness: String = "mild") {
    var heat: Int = 0
        get() {
            return when (spiciness) {
                "mild" -> 5
                "hot" -> 10
                else -> 0
            }
        }
    init {
        println("Spice name = $name and spiciness level = ${this.heat}")
    }
}