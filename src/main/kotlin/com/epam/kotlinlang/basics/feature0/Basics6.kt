package com.epam.kotlinlang.basics.feature0

/**
 * Inheritance
 */
interface Cat {
    val breed: String

    fun meow()
}

open class Sphinx : Cat {
    open val woolLength = 0

    override val breed: String
        get() = "Sphinx"

    override fun meow() {
        println("MEEEEEOOOOOWW")
    }
}

class ShaggySphinx : Sphinx() {
    override val woolLength = 42
}

fun main() {
    println(Sphinx().breed)


    println(ShaggySphinx().woolLength)
}