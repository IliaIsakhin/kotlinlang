package com.epam.kotlinlang.basics.feature0

/**
 * Smart-casts, string interpolation and if expression
 */
fun main() {
    val maybeNumber = readNumber("123")

    if (maybeNumber is Int) {
        println("Это число и я могу вызывать методы Int ${maybeNumber.toDouble()}")
    } else {
        println("Я не смог распарсить, получилось $maybeNumber")
    }
}

fun readNumber(str: String) = try {
    Integer.parseInt(str)
} catch (ignored: NumberFormatException) {
    null
}
