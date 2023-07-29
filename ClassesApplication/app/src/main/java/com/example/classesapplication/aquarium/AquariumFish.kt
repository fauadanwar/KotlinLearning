package com.example.classesapplication.aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish(), FishAction {
    override val color = "Gray"
    override fun eat(): String {
        return "eat alone"
    }
}

class Dolphin : AquariumFish(), FishAction {
    override val color = "Brown"
    override fun eat(): String {
        return "eat in group"
    }
}

interface FishAction {
    fun eat(): String
}

interface  FishColour {
    val color: String
}