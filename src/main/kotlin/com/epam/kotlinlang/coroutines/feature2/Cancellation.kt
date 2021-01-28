package com.epam.kotlinlang.coroutines.feature2

import kotlinx.coroutines.*

fun main() = runBlocking {
    val burgerCoroutine = launch { makeBurger() }

    launch {
        repeat(5) {
            delay(500)
            println("How is it going?")
        }
        
        burgerCoroutine.cancel()
    }.join()
    
    println("I`m tired to wait!")
}

suspend fun makeBurger(): String {
    println("Started making a burger")
    repeat(10) {
        delay(1000)
        println("We`re making a burger...")
    }

    return "Burger"
}