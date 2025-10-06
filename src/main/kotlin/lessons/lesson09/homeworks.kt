package org.popkova.lessons.lesson09

//Работа с массивами Array
val intArray = arrayOf(1, 2, 3, 4, 5)

val stringArray = arrayOfNulls<String>(10)

val doubleArray = Array(5) { index -> (index * 2).toDouble() }

val intArray2 = IntArray(5)

for (i in intArray2.indices) {
    intArray2[i] = i * 3
}



val nullableStrings = arrayOfNulls<String?>(3)
nullableStrings[0] = null
nullableStrings[1] = "строка 1"
nullableStrings[2] = "строка 2"



val originalArray = intArrayOf(1, 2, 3, 4, 5)
val copiedArray = IntArray(originalArray.size)
for (i in originalArray.indices) {
    copiedArray[i] = originalArray[i]
}



val arrayA = intArrayOf(10, 20, 30)
val arrayB = intArrayOf(1, 2, 3)
val diffArray = IntArray(arrayA.size)

for (i in arrayA.indices) {
    diffArray[i] = arrayA[i] - arrayB[i]
}

println("Разности: ${diffArray.joinToString()}")


val numbers = intArrayOf(1, 3, 5, 7, 9)
var index = -1
var i = 0
while (i < numbers.size) {
    if (numbers[i] == 5) {
        index = i
        break
    }
    i++
}
println(index)



val nums = intArrayOf(2, 7, 4, 9, 10)
for (num in nums) {
    val parity = if (num % 2 == 0) "чётное" else "нечётное"
    println("$num - $parity")
}

fun findSubstringInArray(strings: Array<String>, searchStr: String) {
    for (str in strings) {
        if (str.contains(searchStr)) {
            println(str)
            return
        }
    }
    println("Не найдено подходящих элементов")
}

val arr = arrayOf("Котлин", "Лучший язык", "программирования")
findSubstringInArray(arr, "язык")



//Работа со списками List

//1. Создайте пустой неизменяемый список целых чисел:

val immutableIntList = listOf<Int>()

//2. Создайте неизменяемый список строк, содержащий три элемента:
val immutableStringList = listOf("Hello", "World", "Kotlin")

//3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5:
val mutableIntList = mutableListOf(1, 2, 3, 4, 5)

//4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8):
mutableIntList.addAll(listOf(6, 7, 8))

//5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World"):
val mutableStringList = mutableListOf("Hello", "World", "Kotlin")
mutableStringList.remove("World")


//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента:
val intList = listOf(1, 2, 3, 4, 5)

for (num in intList) {
    println(num)
}

//7. Создайте список строк и получите из него второй элемент, используя индекс:
val stringList = listOf("Apple", "Banana", "Cherry")
val secondElement = stringList[1] // Индексы с 0
println(secondElement)


//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение):

val mutableNums = mutableListOf(10, 20, 30, 40)
mutableNums[2] = 35
println(mutableNums)


//9. Создайте два списка строк и объедините их в новый список с помощью циклов:
val list1 = listOf("A", "B", "C")
val list2 = listOf("D", "E", "F")

val combinedList = mutableListOf<String>()

for (item in list1) {
    combinedList.add(item)
}
for (item in list2) {
    combinedList.add(item)
}

//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы, используя цикл:
val nums = listOf(3, 7, 2, 9, 4)
var min = nums[0]
var max = nums[0]

for (num in nums) {
    if (num < min) min = num
    if (num > max) max = num
}

println("Минимальное: $min, Максимальное: $max")

//11. Имея список целых чисел, создайте новый список, содержащий только четные числа, используя цикл:
val originalList = listOf(1, 2, 3, 4, 5, 6)
val evenNumbers = mutableListOf<Int>()

for (num in originalList) {
    if (num % 2 == 0) {
        evenNumbers.add(num)
    }
}

println(evenNumbers)



Работа с Множествами Set
//1. Создайте пустое неизменяемое множество целых чисел.
val emptyImmutableSet = setOf<Int>()

//2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3):
val immutableSet = setOf(1, 2, 3)

//3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala"):
val mutableStringSet = mutableSetOf("Kotlin", "Java", "Scala")

//4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go"):
mutableStringSet.addAll(listOf("Swift", "Go"))

//5. Имея изменяемое множество целых чисел, удалите из него определённый элемент (например, 2):
val mutableIntSet = mutableSetOf(1, 2, 3, 4)
mutableIntSet.remove(2)

//6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран:
val intSet = setOf(5, 10, 15)

for (num in intSet) {
    println(num)
}

//7. Создайте функцию, которая принимает множество строк (set) и строку, и проверяет через цикл, есть ли эта строка в множестве:
fun containsString(set: Set<String>, target: String): Boolean {
    for (str in set) {
        if (str == target) {
            return true
        }
    }
    return false
}

// Пример вызова:
val mySet = setOf("Apple", "Banana", "Cherry")
println(containsString(mySet, "Banana"))
println(containsString(mySet, "Grape"))

//8. Создайте множество строк и конвертируйте его в изменяемый список строк с помощью цикла:
val stringSet = setOf("Red", "Green", "Blue")
val listFromSet = mutableListOf<String>()

for (item in stringSet) {
    listFromSet.add(item)
}

println(listFromSet)