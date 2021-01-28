package com.epam.kotlinlang.coroutines.feature0

import kotlinx.coroutines.delay

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val image = loadImage()

    print("Image $image received!")
}

suspend fun loadImage(): String {
    println("Loading started")
    
    delay(2000)
    
    return "cat.png"
}