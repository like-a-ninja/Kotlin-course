package org.popkova.lessons.lesson08


fun task1(arg: String) {
    val result1 = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
            arg.startsWith("Я не уверен")
        -> "$arg ..., но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        arg.contains("") -> "Иногда $arg, но не всегда"
        else -> arg
    }
    println(result1)
}

fun task2() {
    val logLine = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    // Разделяем строку по " -> "
    val parts = logLine.split(" -> ")

    // Правая часть - это дата и время
    val dateTime = parts.getOrNull(1) ?: ""

    // Проверка, есть ли такая часть
    if (dateTime.isNotEmpty()) {
        // Разделяем дату и время по пробелу
        val datetimeParts = dateTime.split(" ")
        val date = datetimeParts.getOrNull(0) ?: ""
        val time = datetimeParts.getOrNull(1) ?: ""

        println(date)
        println(time)
    } else {
        println("Не удалось найти дату и время в строке.")
    }
}

fun task3() {
    val cardNumber = "4539 1488 0343 6467"
       val lastFour = cardNumber.substring(15)
    val maskedPart = "*".repeat( 12)
    println(maskedPart + lastFour)
}

fun task4() {
val email = "username@example.com"
    val replaced = email.replace("username@example.com",  "username [at] example [dot] com")
println(replaced)

}

fun task5(path: String): String {
    val fileName = path.substringAfterLast('/')
    println(fileName)
    return fileName
}

fun task6(phrase: String): String {
    val words = phrase.split(" ")
    var abbreviation = ""

    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0].uppercase()
        }
    }
    println(abbreviation)
    return abbreviation
}




fun main(){
    task1("Удача")
    task2()
    task3()
    task4()
    task5("C:/Пользователи/Документы/report.txt")
    task6("Котлин лучший язык программирования")



}