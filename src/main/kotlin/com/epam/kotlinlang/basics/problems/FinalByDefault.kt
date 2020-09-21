package com.epam.kotlinlang.basics.problems

import org.mockito.Matchers.anyInt
import org.mockito.Matchers.anyString
import org.mockito.Mockito

val service = LoggableService()

val mock: LoggableService = Mockito.mock(LoggableService::class.java)

fun main() {
    service.transaction("Вася", "Петя", 100)

    Mockito.`when`(mock.transaction(anyString(), anyString(), anyInt()))
        .thenAnswer {
            println("Хацкер украл ${it?.getArgumentAt(2, Integer::class.java)} рублей!")
        }

    mock.transaction("Вася", "Петя", 100)
}

open class LoggableService {

    open fun transaction(from: String, to: String, amount: Int) = println("$from перевел пользователю $to $amount рублей")
}
