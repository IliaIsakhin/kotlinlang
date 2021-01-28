package com.epam.kotlinlang.coroutines.feature2

import kotlinx.coroutines.*

fun main() = runBlocking {
    val result =  try {
        println("I want to eat!")
        withTimeout(5000) { makeBurger() }
    } catch (e: CancellationException) {
        "Hot dog"
    }

    println("Mmmm, yummy, $result")
}
