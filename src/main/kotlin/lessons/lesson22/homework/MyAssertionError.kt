package org.popkova.lessons.lesson22.homework

class MyAssertionError(message: String) : AssertionError(message)

fun main() {
    throw MyAssertionError("Алярм!!")
}