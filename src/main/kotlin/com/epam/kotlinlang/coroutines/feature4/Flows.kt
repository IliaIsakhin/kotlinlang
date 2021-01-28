package com.epam.kotlinlang.coroutines.feature4

import com.epam.kotlinlang.coroutines.util.User
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        for (k in 1..5) {
            println("I'm not blocked $k")
            delay(600)
        }
    }
    
    findUsersAsync().collect { 
        println(it.name)
    }
}

suspend fun findUsersAsync(): Flow<User> = flow {
    delay(1000)
    emit(User("Sasha"))

    delay(1000)
    emit(User("Masha"))

    delay(1000)
    emit(User("Mickey"))
}
