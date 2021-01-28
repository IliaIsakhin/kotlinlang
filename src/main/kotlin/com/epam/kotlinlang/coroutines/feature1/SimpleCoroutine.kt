package com.epam.kotlinlang.coroutines.feature1

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    println("Starting coroutine")
    
    val a = launch { 
        sendRequestAsync() 
    } 
    
    println ("Thread is free") 
    
    a.join ()
}

suspend fun sendRequestAsync() = coroutineScope {
    delay(3000)

    println("Request successful")
}
