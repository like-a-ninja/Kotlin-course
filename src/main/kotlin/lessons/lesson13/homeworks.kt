package org.popkova.lessons.lesson13

fun main() {
// 1.Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val suit = mapOf("first" to 10, "second" to 20, "third" to 30)
    println(suit.values.average())

// 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val autosuit = mapOf("smoke" to "data1", "MAT" to "data2", "AT" to "data3")
    println(autosuit.entries)

//    3.В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val autosuitmutable = autosuit.toMutableMap()
    autosuitmutable["regression"] = "data 4"
    println(autosuitmutable.entries)

// 4.Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val suitResult = mapOf("smoke" to "passed", "MAT" to "failed", "AT" to "skipped")
    println(suitResult.count { it.value == "passed" })

    // 5.Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val suitBugs = mutableMapOf("first" to "fixed", "second" to "in process", "third" to "backog")
    suitBugs.entries.removeIf { it.value == "fixed" }
    println(suitBugs.entries)

    // 6.   Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val websuit = mapOf("google.com" to 200, "yandex.com" to 400, "vk.com" to 500)
    websuit.forEach { (url, status) ->
        println("Страница: $url, Статус: $status")
    }
// 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val filtereswebsuit = websuit.filterValues { it > 200 }
    println(filtereswebsuit)
    // 8.В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val suit1 = mapOf("google.com" to "200", "yandex.com" to "400", "vk.com" to "500")


    val status = suit1.getOrDefault("kotlin", "не был протестирован")

    println(status)

    //9.Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val suit2 = mapOf("a1" to "test1", "a2" to "test2", "a3" to "test3")
    val browserType = suit2.getOrElse("browserType") { "не определён" }

    println("Тип браузера: $browserType")

// 10.Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val suit3 = mapOf("ver1" to "test1", "ver2" to "test2", "ver3" to "test3")
    val suit4 = suit3 + mapOf("ver4" to "test4")
    println(suit4.entries)

//11.Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val suit5 = mapOf("ipadAir" to "test1", "SamsungGalaxy" to "test2", "RedmiNote" to "test3")
    val status1 = suit5.getOrDefault("Fold", "default")

    println(status1)

// 12.Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val suit6 = mapOf(100 to "test1", 200 to "test2", 300 to "test3")
    val status2 = suit6.containsKey(400)

    println(status2)

    //13.Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val suit7 = mapOf("TestID1_Version" to "Passed", "TestID2_Version" to "Failed", "TestID3_Version" to "Skipped")
    val filteredsuit7 = suit7.filterKeys { it == "TestID1_Version" }
    println(filteredsuit7)

    // 14.  У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val suit8 = mutableMapOf("auth" to "Passed", "reg" to "Failed", "bet" to "Skipped")
    val isduit8failed = suit8.any({ it.value == "Failed" })

    // 15.Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val suit9 = mutableMapOf("ipadAir" to "test1", "SamsungGalaxy" to "test2", "RedmiNote" to "test3")
    val suit10 = mutableMapOf<String, String>()
    suit10.putAll(suit9)
    println(suit10)

    //16.    Объедините два неизменяемых словаря с данными о багах.
    val suit11 = suit8 + suit7
    println(suit11)

    //17.Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val suit12 = mutableMapOf("1" to "passed", "2" to "failed", "3" to "passed")
    suit12.clear()
    println(suit12)
    //18.Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.

    suit8.entries.removeIf { it.value == "skipped" }

    //19.   Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val suit13 = suit8 - "auth"

//20.   Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val suit14 = suit8.map { (id, result) -> "$id: $result" }
    println(suit14)
//21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val suit15 = suit8.toMap()
    //22.    Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val suit16 = mapOf(1 to "passed", 2 to "failed", 3 to "passed")
    val suit17 = suit16.mapKeys { it.key.toString() }
    //23.    Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val suit18 = mutableMapOf("версия1" to 1, "версия2" to 2, "версия3" to 3)
    val suit19 = suit18.mapValues {
        "%.2f".format(it.value * 1.1)
    }
    println(suit19)
    //24.    Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val suit20 = mapOf<String, String>()

    val isEmpty = suit20.isEmpty()

    println("Словарь пуст: $isEmpty")
    //25.   Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val isNotEmpty = suit20.isNotEmpty()

    println("Словарь не пуст: $isNotEmpty")
    //26.   Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    println(suit16.all { it.value == "passed" })
//27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    println(suit16.any { it.value == "failed" })
    //28.Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    println(suit12.filter { it.key.contains("optional") && it.value != "passed" })

}