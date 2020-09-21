package com.epam.kotlinlang.basics.inconvenience

fun processResponse(code: String?): String {
    if (code == null) return ""

    return if (code.startsWith("4")) "fail" else "success"
}