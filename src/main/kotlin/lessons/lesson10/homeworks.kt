package org.popkova.lessons.lesson10

import org.popkova.lessons.lesson07.task7

//1.Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
fun main() {
    val task1 = mapOf<Int, Int>()

//2.Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val task2 = mapOf<Float, Double>(1.1f to 5.5, 2.2f to 55.5)

//3.Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val task3 = mutableMapOf<Int, String>()

//4.Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    val task4 = mutableMapOf<Int, String>()
    task4[14] = "Возраст"
//5.Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    task4["Возраст"]
    val resultTask4 = task4["Возраст"]
    if (resultTask4 != null) {
        println(resultTask4)
    } else {
        println("Ключ не найжден")
    }

//6.Удалите определенный элемент из изменяемого словаря по его ключу.
    task4.remove(14)
//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val task7 = mutableMapOf<Double, Int>(1.1 to 1, 2.2 to 2, 3.3 to 3)
    for ((double, int) in task7){
        if (int == 0) println ("бесконечность")
        else println(double/int)
    }



//8,Измените значение для существующего ключа в изменяемом словаре.
    task4[14] = 16
    println(task4)

//9,Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val map1 = mapOf(1 to 'a', 2 to 'b')
    val map2 = mapOf(1 to 'z', 2 to 'y')
    val map3 = mutableMapOf<Int , Char>()
    for ((key, value) in map1){
        map3[key]=value
    }
    for ((key, value) in map2){
        map3[key] = value
    }
//10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val task10 = mutableMapOf<String, List <Int>>()
    task10["первый"] = listOf(1,2,3)
    println(task10)
//11.Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
val task11 = mutableMapOf<Int, MutableSet<String>>()
    task11[1]= mutableSetOf("один")
    task11[2]= mutableSetOf("два")
    task11[3] = mutableSetOf("три")
    val set = task11[2]
    set?.add("добавляем строку")
    println(set.toString())
    println(task11)
//12.Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
val task12 = mapOf(
    Pair(1,2) to 1,
    Pair(3,4) to 2,
    Pair(5,6) to 3,
    Pair(55,3) to 5,
)
    for ((pair, value) in task12){
        if (pair.first == 5 || pair.second == 5) println ("key $pair -> value $value")
    }

//1.Словарь библиотека: Ключи - автор книги, значения - список книг
    val library = mutableMapOf<String, MutableList<String>>()

//2.Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants = mapOf<String, MutableList<String>>()
//3,Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val quarterFinal = mapOf<String, MutableList<String>>()
//4.Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val therapy = mapOf(
        "1 сентября" to listOf("Лекарство1"),
        "2 сентября" to listOf("Лекарство1")
    )
//5.Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val traveller = mutableMapOf<String, MutableMap<String, List<String>>>()

    traveller["Беларусь"] = mutableMapOf("Минск" to listOf("Парк Победы", "Национальная библиотека"))
    traveller["Беларусь"] ?.put("Брест", listOf("Беловежская пуща"))
}