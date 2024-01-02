package com.example.classesapplication.decorations

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)
    val d2 = Decorations("slate")
    println(d2)
    val d3 = Decorations("slate")
    println(d3)

    println(d1 == d2)
    println(d3 == d2)

    val d4 = d3.copy()
    println(d3)
    println(d4)
    println(d4 == d3)

    d4.rocks = "stone"
    println(d3.rocks)
    println(d4.rocks)
    println(d4 == d3)

    val d5 = Decorations2("crystal", "wood", "diver")
    val (rocks, wood, diver) = d5
    println(rocks)
    println(wood)
    println(diver)
}