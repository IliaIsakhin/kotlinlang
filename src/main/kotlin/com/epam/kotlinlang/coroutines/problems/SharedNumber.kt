package com.epam.kotlinlang.coroutines.problems

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var number = 0

fun main(): Unit = runBlocking {
    val c1 = launch { incrementNumber() }
    val c2 = launch { incrementNumber() }
    val c3 = launch { incrementNumber() }

    c1.join(); c2.join(); c3.join()
    
    println(number)
}

suspend fun incrementNumber() {
    for (i in 1..1000) {
        delay(1)
        number++
    }
}
