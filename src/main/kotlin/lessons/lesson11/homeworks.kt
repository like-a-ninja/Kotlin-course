package org.popkova.lessons.lesson11
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//1.Не принимает аргументов и не возвращает значения.
fun  task1(){

}
//2.Принимает два целых числа и возвращает их сумму.
fun task2(a:Int, b:Int): Int{
    return a+b
}
//3.Принимает строку и ничего не возвращает.
fun task3(a:String){

}
//4.Принимает список целых чисел и возвращает среднее значение типа Double.
fun task4(a:List<Int>): Double{
    return a.average()
}

//5.Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun task5(a:String?): Int?{
    return a?.length
}
//6.Не принимает аргументов и возвращает nullable вещественное число.
fun task6(): String {
    return  "Строка"
}
//7,Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun task7(a:List<Int>?){

}
//8.Принимает целое число и возвращает nullable строку.
fun task8(a:Int):String?{
    return if (a > 0) {
        a.toString()
    } else {
        null
    }
}

//9.Не принимает аргументов и возвращает список nullable строк.
fun task9(): List<String?>{
return listOf("одмн", "два")
}
//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun task10(a:String?, b:Int?): Boolean? {
    if (a == null|| b == null) return null
    return a.length==b
}

//Напишите валидную сигнатуру метода а так же рабочий код для задач.
// 11.Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(x: Int): Int {
    return x * 2
}

// 12.Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
fun main() {
    println(isEven(4))  // true
    println(isEven(7))  // false
}

// 13.Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    if (n < 1) return

    for (i in 1..n) {
        println(i)
    }
}
// 14.Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

// 15.Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}

fun main() {
    val list1 = listOf("apple", "banana", null, "orange")
    processList(list1)
    // Выведет:
    // apple
    // banana
    // (прекратит выполнение при встрече null)

    val list2 = listOf("cat", "dog", "mouse")
    processList(list2)
    // Выведет:
    // cat
    // dog
    // mouse
}