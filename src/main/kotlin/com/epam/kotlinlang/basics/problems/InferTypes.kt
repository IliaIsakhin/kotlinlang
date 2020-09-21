package com.epam.kotlinlang.basics.problems

fun main() {
    val list = getList()
    val list2 = getList2()

    val result = list + list2
}

//fun getList() = listOf(1)
//fun getList2() = listOf(0.1)

fun getList() = listOf(BuilderA())
fun getList2() = listOf(BuilderB())

abstract class AbstractBuilder<out B : AbstractBuilder<B>>

class BuilderA : AbstractBuilder<BuilderA>()

class BuilderB : AbstractBuilder<BuilderB>()