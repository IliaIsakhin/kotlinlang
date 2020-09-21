package com.epam.kotlinlang.basics.feature8

/**
 * Objects and delegate lazy
 */
object BeeHouse {
    val luntik by lazy {
        Luntik()
    }
}

class Luntik {
    init {
        println("Я родился!")
    }

    fun sayHello() = println("Привет!")
}

fun main() {
    BeeHouse.luntik.sayHello()
    BeeHouse.luntik.sayHello()
    BeeHouse.luntik.sayHello()
}
