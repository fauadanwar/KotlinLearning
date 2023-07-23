package com.example.classesapplication.aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium()
{
    val aquarium = Aquarium()
    println("Length = ${aquarium.length}" + " Width = ${aquarium.width}" + " Height = ${aquarium.height}")
}