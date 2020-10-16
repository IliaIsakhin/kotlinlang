package com.epam.kotlinlang.basics.feature7

fun main() {
    println(decide(100))
}

fun decide(num: Number?) = when (num) {
    null -> "It`s null!"
    0 -> "It`s a zero!"
    in 1..10 -> "small number"
    in 11..Int.MAX_VALUE -> "big boy"
    is Double -> "double precision"
    else -> throw IllegalArgumentException()
}