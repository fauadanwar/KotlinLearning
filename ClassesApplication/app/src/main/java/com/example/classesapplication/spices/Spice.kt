package com.example.classesapplication.spices

import com.example.classesapplication.aquarium.Colour


abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()
}
interface Grinder {
    fun grind()
}
interface SpiceColor {
    val color: Colour
}

object YellowSpiceColor : SpiceColor {
    override val color = Colour.YELLOW
}
class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        println("Preparing Spice")
    }

    override fun grind() {
        println("Grinding Spice")
    }

}

data class SpiceContainer(val spice: Spice){
    val label: String = spice.name
}