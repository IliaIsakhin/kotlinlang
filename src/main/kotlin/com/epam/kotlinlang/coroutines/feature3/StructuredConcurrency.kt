@file:Suppress("UNREACHABLE_CODE")

package com.epam.kotlinlang.coroutines.feature3

import com.epam.kotlinlang.coroutines.util.Account
import com.epam.kotlinlang.coroutines.util.Service
import com.epam.kotlinlang.coroutines.util.User
import kotlinx.coroutines.*
import java.lang.Exception
import java.net.SocketTimeoutException

val service = Service()

fun main(): Unit = runBlocking { 
    try {
        processSuperComplexUserOperation()
    } catch (e: Exception) {
        println("Something went wrong: ${e.message}")
        delay(2000)
    }
}

suspend fun processSuperComplexUserOperation() = coroutineScope {
    val userDeferred = async { service.findUser(2) }

    val permissionsFuture = async { service.findPermissions(userDeferred.await().id) }
    val accountFuture = async { service.findAccount(userDeferred.await().id) }
    
    processUserOperation(
        user = userDeferred.await(),
        account = accountFuture.await(),
        permissions = permissionsFuture.await(),
    )
}

fun processUserOperation(user: User, account: Account, permissions: List<String>) { 
    if (permissions.isEmpty()) throw IllegalAccessException()
    
    println("User $user with $account operation was successful")
}
