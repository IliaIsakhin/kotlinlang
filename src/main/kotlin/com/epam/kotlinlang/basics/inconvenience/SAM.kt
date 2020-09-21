package com.epam.kotlinlang.basics.inconvenience

import java.util.function.Consumer

fun main() {
    val consumer: Consumer<Int>
            = Consumer { i: Int -> println("Число $i") }

    consumer.accept(5)
}