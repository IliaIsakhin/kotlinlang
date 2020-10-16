package com.epam.kotlinlang.basics.feature1

import com.epam.kotlinlang.basics.*

fun main() {
    val dead = getKosheysDeath().chest?.hare?.duck?.egg?.spine?.isDead == true
    val isDead = if (dead) "умер!" else "живой"

    println("Кощей $isDead")
}

fun getKosheysDeath() = Oak(Chest(Hare(Duck(Egg(Spine(true))))))
