package com.example.classesapplication.aquarium

open class Book(val title: String, val author: String) {
    var currentPage: Int = 0
    open fun readPage() {
        currentPage += 1
        println("Current Page = $currentPage")
    }
}

class EBook(title: String, author: String, val format: String = "text"): Book(title, author) {
    private var wordCount = 0
    override fun readPage() {
        wordCount += 250
        println("Word Count = $wordCount")
        println("Current Page = $currentPage")
    }
}