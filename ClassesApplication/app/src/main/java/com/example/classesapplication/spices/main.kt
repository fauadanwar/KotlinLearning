package com.example.classesapplication.spices
fun main() {
    val sampleSpices: List<Spice> = listOf(Spice("Chilly", "hot"))
    println("Spiciness = ${sampleSpices.first().spiciness}, heat = ${sampleSpices.first().heat}")
}