package com.epam.kotlinlang.basics.feature3

fun main() {
    var a = 0

    listOf(1, 2, 3).forEach {
        a += it
    }

    println(a)

    val isThree = { i: Int -> i == 3 }

    println(isThree(5))
}