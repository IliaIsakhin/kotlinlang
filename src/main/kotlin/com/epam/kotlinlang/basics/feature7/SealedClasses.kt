package com.epam.kotlinlang.basics.feature7

fun main() {
    handleResponse(Ok("Hello, World!"))
}

fun handleResponse(response: Response) = when (response) {
    is ServerError -> println("Это не учебная тревога! Код ${response.errorCode}!")
    is Ok -> println("Ответ принял, внутри было сообщение: ${response.body}")
    is Redirect -> println("Редиректимся прямо к ${response.address}")
}

sealed class Response

data class ServerError(val errorCode: Int) : Response()

data class Ok(val body: String) : Response()

data class Redirect(val address: String) : Response()