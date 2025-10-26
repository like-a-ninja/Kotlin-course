package org.popkova.lessons.lesson14

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    // Добавление полки
    fun addShelf(shelf: Shelf): Boolean {
        if (!shelves.contains(shelf) && shelves.size < maxShelves) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    // Удаление полки и возвращение её предметов
    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val items = shelves[index].getItems()
        shelves.removeAt(index)
        return items
    }

    // Добавление предмета на первую подходящую полку
    fun addItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.canAccommodate(name)) {
                if (shelf.addItem(name)) return true
            }
        }
        return false
    }

    // Удаление предмета
    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(name)) {
                return shelf.removeItem(name)
            }
        }
        return false
    }

    // Проверка, есть ли предмет
    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    // Получение списка полок
    fun getShelves() = shelves.toList()

    // Печать содержимого
    fun printContents() {
        println("Содержимое стеллажа:")
        for (i in shelves.indices) {
            val shelf = shelves[i]
            val capacity = shelf.capacity
            val totalItemsLength = shelf.getItems().sumOf { it.length }
            val available = capacity - totalItemsLength
            println("Полка $i: вместимость = $capacity, доступно для длин и = $available")
            println("Предметы: ${shelf.getItems().joinToString()}")
            println()
        }
    }

    // Сложное удаление полки с перераспределением предметов
    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val removedItems = shelves[index].getItems().toMutableList()
        val otherShelves = shelves.filterIndexed { i, _ -> i != index }

        val notReplacedItems = mutableListOf<String>()

        for (item in removedItems) {
            val placed = otherShelves.any { shelf ->
                if (shelf.canAccommodate(item) && !shelf.containsItem(item)) {
                    shelf.addItem(item)
                    true
                } else {
                    false
                }
            }
            if (!placed) {
                notReplacedItems.add(item)
            }
        }

        shelves.removeAt(index)
        return notReplacedItems
    }
}