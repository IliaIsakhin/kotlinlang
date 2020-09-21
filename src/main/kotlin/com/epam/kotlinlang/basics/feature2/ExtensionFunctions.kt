package com.epam.kotlinlang.basics.feature2

/**
 * Operator overloading + extension function
 */
fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.getEven())

    println(list * 3)
}

fun List<Int>.getEven() = this.filter { it % 2 == 0 }

operator fun <T> Iterable<T>.times(i: Int): List<T> {
    val result = this.toMutableList()

    repeat(i - 1) { result += this }

    return result
}
