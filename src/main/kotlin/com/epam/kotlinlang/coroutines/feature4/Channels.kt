package com.epam.kotlinlang.coroutines.feature4

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val channel = Channel<Int>()
    
    val producer = launch(CoroutineName("Sender coroutine")) {
        for (e in 1..5) {
            println("Sending $e from ${Thread.currentThread().name}")
            delay(500)
            channel.send(e)
        }
        channel.close()
    }
    
    val consumer = launch(CoroutineName("Receiver coroutine")) { 
        for (i in channel) {
            println("$i from ${Thread.currentThread().name}")
        }
    }
    
    println("Waiting for channel")
    producer.join()
    consumer.join()
}