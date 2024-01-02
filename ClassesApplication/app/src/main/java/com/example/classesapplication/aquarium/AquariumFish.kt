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

class Placo(fishColour: FishColour = GoldColour) :
    FishAction by PrintingFishAction("Pair"),
    FishColour by fishColour

//Singleton declaration
object GoldColour: FishColour {
    override val color = "Gold"
}
object RedColour: FishColour {
    override val color = "Red"
}

class PrintingFishAction(private val eatType: String) : FishAction {
    override fun eat(): String {
        return "eat in $eatType"
    }
}