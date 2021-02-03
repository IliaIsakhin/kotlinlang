package com.epam.kotlinlang.coroutines.feature3

import kotlinx.coroutines.*
import java.lang.Exception

fun main(): Unit = runBlocking { 
    try {
        processAllUserTransactions()
    } catch (e: Exception) {
        println("Something went wrong: ${e.message}")
    } finally {
        delay(2000) // wait in case other transactions
    }
}

suspend fun processAllUserTransactions() = coroutineScope {
    val transactionIds = (1..10).toList()

    transactionIds.forEach { 
        launch { processTransaction(it) }
    }
}

private suspend fun processTransaction(transactionId: Int) {
    if (transactionId == 3) {
        throw IllegalAccessException("User is not permitted to perform transaction")
    }
    delay(100)
    println("Transaction №$transactionId processed successfully")
}  
