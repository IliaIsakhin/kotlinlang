package com.epam.kotlinlang.coroutines.feature5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.reactor.asFlux
import kotlinx.coroutines.runBlocking
import java.time.LocalTime

fun main(): Unit = runBlocking {
    flow {
        emit("Hello + ${LocalTime.now().second}")

        delay(2000)
        
        emit("World + ${LocalTime.now().second}")
    }
        .asFlux()
        .doOnNext(::println)
        .collectList()
        .block()
}