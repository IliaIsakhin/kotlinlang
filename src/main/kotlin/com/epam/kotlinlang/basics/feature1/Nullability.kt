package com.epam.kotlinlang.basics.feature1

import com.epam.kotlinlang.basics.*

fun main() {
    val kosheysDeath = getKosheysDeath()

    val isDead = if (kosheysDeath.chest?.hare?.duck?.egg?.spine?.isDead == true) "умер!" else "живой"

    println("Кощей $isDead")

    val listOf1 = mutableListOf(1, 2, 3)
}

fun getKosheysDeath() = Oak(Chest(Hare(null)))
