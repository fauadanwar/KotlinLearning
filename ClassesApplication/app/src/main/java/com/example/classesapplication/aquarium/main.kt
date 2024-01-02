package com.example.classesapplication.aquarium

import com.example.classesapplication.spices.Spice

fun main() {
    buildAquarium()
    fishExample()
    makeFish()
    val book = EBook("pdf","Harry Potter")
    book.readPage()
    val sampleSpices: List<Spice> = listOf(Spice("Chilly", "hot"))
    println("Spiciness = ${sampleSpices.first().spiciness}, heat = ${sampleSpices.first().heat}")
    delegate()
}

fun buildAquarium()
{
    val aquarium = Aquarium()
    println("Length = ${aquarium.length} cm" + " Width = ${aquarium.width} cm" + " Height = ${aquarium.height} cm")
    aquarium.length = 40
    println("Length = ${aquarium.length} cm")
    println("Volume = ${aquarium.volume} liters")
    aquarium.volume = 15
    println("Volume = ${aquarium.volume} liters")

    val smallAquarium = Aquarium(12,12,12)
    println("Small Aquarium Volume = ${smallAquarium.volume} liters")
    val fishAquarium = Aquarium(9)
    println("Fish Aquarium Length = ${fishAquarium.length} cm" +
            " Width = ${fishAquarium.width} cm" +
            " Height = ${fishAquarium.height} cm" +
            " Volume = ${fishAquarium.volume} liters")

    val towerTankAquarium = TowerTank()
    println("Tower Tank Aquarium Aquarium Volume = ${towerTankAquarium.volume} liters")

}

fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needed voume = ${fish.size}")
}

fun makeFish() {
    val shark = Shark()
    val dolphin = Dolphin()
    println("Shark has ${shark.color} colour, they ${shark.eat()} and Dolphin has ${dolphin.color} colour, they ${dolphin.eat()}")
}

fun delegate() {
    var goldPlaco = Placo()
    var redPlaco = Placo(RedColour)
    println("goldPlaco has ${goldPlaco.color} colour, they ${goldPlaco.eat()}")
    println("redPlaco has ${redPlaco.color} colour, they ${redPlaco.eat()}")
}