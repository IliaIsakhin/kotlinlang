package com.epam.kotlinlang.coroutines.util

data class User(
    val id: Long,
    val name: String,
    val accId: Long
) {
    constructor(name: String): this(1, name, 1)
}

data class Account(
    val id: Long,
    val balance: Double
)

class Service {

    /**
     * id = 1 - with permissions
     * id = 2 - without permissions
     */
    fun findUser(id: Long): User {
        println("Receiving user info...")
        
        Thread.sleep(1000)
        
        return User(id, "Vasya", 2).apply { println("User with name $name was found") }
    }
    
    fun findPermissions(id: Long): List<String> {
        println("Receiving user permissions...")
        val permissions = if (id == 1L) listOf("ROOT") else throw Exception("Forbidden")
        
        Thread.sleep(1000)

        return permissions.apply { println("$size permission was found") }
    }

    fun findAccount(id: Long): Account {
        println("Receiving user account...")
        
        Thread.sleep(1000)
        
        return Account(id, 42.0).apply { println("Account was found. Balance: $balance rub") }
    }

    fun transferMoney(amount: Double, permissions: List<String>) {
        println("Initiating transaction... with permissions $permissions")
        
        Thread.sleep(1000)
        
        println("Money was transferred  $amount ")
    }
    
    fun rollback(e: Throwable) = System.err.println("Error! Rollback transaction due to ${e.message}")
}

fun printTime(startTime: Long) = println("${System.currentTimeMillis() - startTime} milliseconds")
