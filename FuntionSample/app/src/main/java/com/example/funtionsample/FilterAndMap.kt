package com.example.funtionsample

fun main() {
    val spices =
        listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val filterCE = spices.filter { it[0] == 'c' && it.last() == 'e' }
    val filterCE2 = spices.filter { it.startsWith('c')}.filter { it.endsWith("e") }
    val filterCSorted = spices.filter { it.contains("curry")}
    val sequence3C = spices.asSequence().take(3)
    val filter3C = spices.filter { it.startsWith('c')}

    println(filterCE)
    println(filterCE2)
    println(sequence3C.toList())
    println(filter3C)
    println(filterCSorted.sortedBy { it.length })
}