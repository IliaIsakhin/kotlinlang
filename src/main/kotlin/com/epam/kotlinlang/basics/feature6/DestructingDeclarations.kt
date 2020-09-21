package com.epam.kotlinlang.basics.feature6

fun main() {
    val (red, green, blue) = getRedColor()

    println("Красный $red")
    println("Зеленый $green")
    println("Синий $blue")
}

fun getRedColor() = Triple(255, 0, 0)