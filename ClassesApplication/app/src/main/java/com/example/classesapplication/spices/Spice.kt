package com.example.classesapplication.spices


abstract class Spice(name: String, val spiciness: String = "mild") {
    abstract fun prepareSpice()
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

class Chilly: Spice {

}

class Curry(val spiciness: String): Spice {

}