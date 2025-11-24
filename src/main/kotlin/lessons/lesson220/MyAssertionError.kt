package org.popkova.lessons.lesson220

class MyAssertionError(message: String) : AssertionError(message)

fun main() {
    throw MyAssertionError("Алярм!!")
}