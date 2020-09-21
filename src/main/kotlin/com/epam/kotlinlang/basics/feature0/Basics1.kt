package com.epam.kotlinlang.basics.feature0

/**
 * Variables (nullable and safe)
 */
fun main() {
    var a: String = "Petya"

    a = a.toUpperCase()

    val b = 100

    var c: String? = "Nullable"

//    b = 1
    c = null

    println(a)
    println(b)
    println(c?.length)

    println(c ?: "Replacement for null-value")

    c!! //  NPE!
}
