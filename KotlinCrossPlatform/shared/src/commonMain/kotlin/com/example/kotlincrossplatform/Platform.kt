package com.example.kotlincrossplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform