package com.epam.kotlinlang.basics.feature5

fun main() {
    val printAndSquare: (Int) -> Int = { println("map $it"); it * it }
    val printAndFilterEven: (Int) -> Boolean = { println("filter $it"); it % 2 == 0 }
    val moreThanSeven: (Int) -> Boolean = { it > 7 }

    val list = listOf(1, 2, 3, 4, 5)

    val result = list
        .map(printAndSquare)
        .filter(printAndFilterEven)
        .find(moreThanSeven)

    println(result)

    println("--------------------------")

    val resultSequence = list
        .asSequence()
        .map(printAndSquare)
        .filter(printAndFilterEven)
        .find(moreThanSeven)

    println(resultSequence)
}