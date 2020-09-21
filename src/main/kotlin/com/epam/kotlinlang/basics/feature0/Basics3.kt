package com.epam.kotlinlang.basics.feature0

/** Data classes, constructor, fields and companion object
 */
fun main() {
    val figure = Rectangle(1, 2)

    println(figure.isSquare())

    val figure2 = Rectangle(2)

    println(figure2.isSquare())

    println(figure == Rectangle(1, 2))
    println(figure)

    Rectangle.new(4, 5)
    Rectangle.PI
}

data class Rectangle(var a: Int, var b: Int) {

    constructor(a: Int) : this(a, a)

    fun isSquare() = a == b


    companion object {
        const val PI = Math.PI

        fun new(a: Int, b: Int) = Rectangle(a, b)
    }
}
