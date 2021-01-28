package com.epam.kotlinlang.coroutines.problems

import kotlinx.coroutines.*
import java.time.LocalTime

fun main(): Unit = runBlocking {
    launch { blockThread() }
    launch { blockThread() }
    launch { blockThread() }
}

fun blockThread() {
    Thread.sleep(2000)
    val now = LocalTime.now()
    println("Releasing lock on thread ${Thread.currentThread().name} in $now")
}

suspend fun suspendCoroutine() {
    delay(2000)
    val now = LocalTime.now()
    println("Releasing lock ${Thread.currentThread().name} in $now")
}
