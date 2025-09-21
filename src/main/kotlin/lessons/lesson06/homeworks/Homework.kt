package org.popkova.lessons.lesson06.homeworks

fun task1(arg: Int) {
    when (arg) {
        1 -> println("Январь")
        2 -> println("Февраль")
        3 -> println("Март")
        4 -> println("Апрель")
        5 -> println("Май")
        6 -> println("Июнь")
        7 -> println("Июль")
        8 -> println("Август")
        9 -> println("Сентябрь")
        10 -> println("Октябрь")
        11 -> println("Ноябрь")
        12 -> println("Декабрь")
        else -> println("Некорректный номер месяца")
    }
}

fun main() {
    task1(3)  // Вывод: Март
}