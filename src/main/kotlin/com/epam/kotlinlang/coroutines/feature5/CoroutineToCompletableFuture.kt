package com.epam.kotlinlang.coroutines.feature5

import kotlinx.coroutines.*
import kotlinx.coroutines.future.asDeferred
import kotlinx.coroutines.future.await
import kotlinx.coroutines.future.future

fun main() = runBlocking {
    val completableFuture = future {
        delay(1000)
        
        "Hello world from completed future"
    }
    
    launch {
        for (i in 1..4) {
            println("Future is completed: ${completableFuture.isDone}")
            println("Coroutine is completed: ${completableFuture.asDeferred().isCompleted}")
            delay(300)
        }
    }
    
    println(completableFuture.await())
}
