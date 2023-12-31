package com.example.classesapplication.spices
fun main() {
    val sampleSpices: List<Spice> = listOf(Spice("Chilly", "hot"))
    println("Spiciness = ${sampleSpices.first().spiciness}, heat = ${sampleSpices.first().heat}")
    val currySpice = Curry("Fish Curry", "hot")
    println("Name = ${currySpice.name}, Spiciness = ${currySpice.spiciness}")
    currySpice.grind()
    currySpice.prepareSpice()

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for (spiceContainer in spiceCabinet)
    {
        println(spiceContainer.label)
    }
}
