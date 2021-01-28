package com.epam.kotlinlang.coroutines.util

import kotlinx.coroutines.*

fun main() = runBlocking {
    val user = findUser()                    // suspending point
    val account = findAccount(user.accId) // suspending point
    
    transferMoney(account.balance)
}

suspend fun findUser(): User {
    delay(1000)
    val user = User("Vasya")
    println("User with name ${user.name} was found")
    return user
}

suspend fun findAccount(accId: Long): Account = Account(accId, 42.0).apply { delay(1000) }

fun transferMoney(amount: Double) = println("${amount.toInt()}$ was transferred")
