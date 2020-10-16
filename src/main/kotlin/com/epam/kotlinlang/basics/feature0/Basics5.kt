package com.epam.kotlinlang.basics.feature0

/**
 * Parameters by default
 */
fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.joinToString())

    println(list.joinToString("; ", "[", "]"))

    println(list.joinToString(separator = "; ", prefix = "[", postfix = "]", transform = { it.times(2).toString() }))
}
