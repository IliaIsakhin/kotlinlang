package com.epam.kotlinlang.basics.feature0

/**
 * Functions (+inline) and parameters
 */
fun main() {
    println(sum(2, 5))
    println(sum(1, 2, 3, 4, 5, 6))
}

fun sum(vararg a: Int): Int {
    return a.reduce(::sum)
}

fun sum(a: Int, b: Int) = a + b
