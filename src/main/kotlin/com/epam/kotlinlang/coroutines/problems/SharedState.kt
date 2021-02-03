package com.epam.kotlinlang.coroutines.problems

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

fun main(): Unit = runBlocking {
    launch { executeSharedCode() }
    launch { executeSharedCode() }
}

private val mutex = Mutex()

@Synchronized
suspend fun executeSharedCode() {
    mutex.withLock {
        println("In")
        delay(10)
        println("Out")
    }
}