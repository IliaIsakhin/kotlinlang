package com.epam.kotlinlang.basics.feature7

fun main() {
    println(decide(null))
}

fun decide(num: Number?) = when (num) {
    null -> "It`s null!"
    1, 2, 3 -> "small number"
    in 4..20 -> "big boy"
    is Double -> "double precision"
    else -> throw IllegalArgumentException()
}