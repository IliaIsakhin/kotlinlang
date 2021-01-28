package com.epam.kotlinlang.coroutines.feature3

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit.*
import kotlin.system.measureNanoTime

fun main() = runBlocking {
    println("We are going to eat!")

    val nanos = measureNanoTime {
        val fork = async { getFork() }
        val knife = async { getKnife() }

        println("I have ${fork.await()} and ${knife.await()}, yummy!")
    }

    print("We are ready in ${SECONDS.convert(nanos, NANOSECONDS)} seconds")
}

suspend fun getKnife(): String {
    println("Give me the knife!")
    delay(5000)
    return "Knife"
}

suspend fun getFork(): String {
    println("Give me the fork!")
    delay(3000)
    return "Fork"
}
