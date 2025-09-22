package org.popkova.lessons.lesson06.homeworks

fun task1(arg: Int) {
    when (arg) {
        in 3..5 -> println ("Vesna")
        in 6..8 -> println ("Leto")
        in 9.. 11 -> println ("Osen")
        12, 1, 2 -> println("Zima")
        else -> println("Incorrect")
    }
}





fun task2 (dogAge: Double) {
    val humanYears = if (dogAge <= 2.0) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }
    println (humanYears)
}


fun task3(distanceKm: Int) {
    if (distanceKm <= 1) {
        println("Foot")
    } else if (distanceKm <= 5) {
        println("Cicle")
    } else {
        println("Auto")
    }
}

fun task4(purchaseAmount: Int) {
    val hundreds = purchaseAmount / 100  // целочисленное количество сотен рублей
    val bonus = if (purchaseAmount <= 1000) {
        hundreds * 2
    } else {
        hundreds * 3
    }
    println(bonus)
}

fun task5(extension: String) {
    if (extension == "txt"  extension == "doc"  extension == "docx"  extension == "rtf") {
        println("text document")
    } else if (extension == "jpg"  extension == "jpeg"  extension == "png"  extension == "gif"  extension == "bmp") {
        println("image")
    } else if (extension == "xls"  extension == "xlsx" || extension == "csv") {
        println("table")
    } else {
        println("unknown type")
    }
}



fun task6(value: Double, unit: String) {
    if (unit == "C") {
        val f = value * 9 / 5 + 32
        print(f)
        print("F")
    } else if (unit == "F") {
        val c = (value - 32) * 5 / 9
        print(c)
        print("C")
    } else {
        print("Incorrect unit")
    }
    println() // переход на новую строку после вывода результата
}



fun task7(temperature: Int) {
    if (temperature < -30 || temperature > 35) {
        println("Do not leave the home")
    } else if (temperature < 10) {
        println("Jacket and cap")
    } else if (temperature in 10..18) {
        println("Windy jacket")
    } else {
        println("Polo and shorts")
    }
}


fun task8(age: Int) {
    if (age in 0..9) {
        println("children")
    } else if (age in 10..18) {
        println("teenagers")
    } else if (age > 18) {
        println("18+")
    } else {
        println("forbidden age")
    }
}


fun main() {
    task1(3)  // Вывод: Март
    task2 (dogAge = 0.5)  // Пример: возраст собаки 1.5 года
    task2 (dogAge = 5.0)  // Пример: возраст собаки 5 лет
    task3 (distanceKm = 2)
    task4 (purchaseAmount = 800)
    task5("xls")
    task6 (36.0, "C")
    task7 (temperature = 17)
    task8 (age = 17)

}