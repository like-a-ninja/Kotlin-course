package org.popkova.lessons.lesson15

import kotlin.collections.mutableListOf

// Базовый класс фигур и задание 1
abstract class GeometricFigure(val name: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

// Многоугольник, наследник GeometricFigure
abstract class Polygon(name: String, var sidesCount: Int) : GeometricFigure(name)

// Треугольник, наследник Polygon
class Triangle(name: String, sidesCount: Int, val sideA: Double, val sideB: Double, val sideC: Double) : Polygon(name, sidesCount) {
    override fun area(): Double {
        // Тут пример формулы Герона
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun perimeter(): Double {
        return sideA + sideB + sideC
    }
}
//override fun в Kotlin — это ключевое слово, используемое для переопределения методов базового класса в наследующем классе.
//Когда вы создаёте класс, который наследует от другого класса или интерфейса, и хотите изменить или реализовать конкретную функцию, объявленную в базовом классе или интерфейсе, то используете override.

// Абстрактный класс Учебное Заведение задание 2
abstract class EducationalInstitution(val name: String)

// Школа - производный класс
class School(name: String, val gradeLevels: List<Int>) : EducationalInstitution(name) {
    fun getGrades() = gradeLevels
}

// Можно добавлять другие типы учебных заведений, например:
class University(name: String, val facultyCount: Int) : EducationalInstitution(name) {
    fun getFacultyCount() = facultyCount
}

// Абстрактный класс Мебель задание 3
abstract class Furniture(val brand: String, val material: String)

// Например, диван
class Sofa(brand: String, material: String, val cushionCount: Int) : Furniture(brand, material) {
    fun relax() = "Релакс на диване"
}

// Стул
class Chair(brand: String, material: String, val maxWeightKg: Int) : Furniture(brand, material) {
    fun sit() = "Вы сели на стул"
}

// Кровать
class Bed(brand: String, material: String, val size: String) : Furniture(brand, material) {
    fun sleep() = "Спите спокойно"
}


//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр этого класса, он нужен только для того, чтобы быть основой для подклассов.
//Создай подклассы этого контейнера, которые будут добавлять строку material (или коллекции или словари строк) в какое-то определённое место (места).
abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }
    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}
class first : Materials() {
   fun insert(itrm:String) {
       val materials = extractMaterials()
       addMaterial(item)
       materials.forEach {
           addMaterial(it)
       }
   }
}

class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = max(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}

class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}

class InsertMapMaterials : Materials() {

    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}
