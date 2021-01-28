package com.epam.kotlinlang.coroutines.evolution2

import com.epam.kotlinlang.coroutines.util.Service
import kotlinx.coroutines.*

val service = Service()

fun main() = runBlocking(Dispatchers.Default) {
    val user = async { service.findUser(1) }

    coroutineScope { 
        
    }
    val account = async { service.findAccount(user.await().accId) } 
    val permissions = async { service.findPermissions(user.await().id) } 

    launch {
        try {
            service.transferMoney(account.await().balance, permissions.await())
        } catch (e: Exception) {
            service.rollback(e)
        }
    }.join()
}
