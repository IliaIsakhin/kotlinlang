package com.epam.kotlinlang.coroutines.feature0

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {
    runThreads()
//    runCoroutines()
}

fun runThreads() {
    repeat(100_000) {
        thread(start = true) { 
            Thread.sleep(1_000L)
            printInfo()
        }
    }
}

fun runCoroutines() = runBlocking {
    repeat(100_000) {
        launch {
            delay(1_000L)
            printInfo()
        }
    }
}

fun printInfo() = println("Hello from ${Thread.currentThread().name}")
