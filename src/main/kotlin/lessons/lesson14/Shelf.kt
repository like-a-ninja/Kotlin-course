package org.popkova.lessons.lesson14

class Shelf(val capacity:Int) {
    val items= mutableListOf<String>()
    fun addItem(name:String):Boolean{
        if (canAccommodate(name)&& !items.contains(name)) {
            items.add(name)
            return true
        }else{
            return false
        }
            }
    fun removeItem(name:String):Boolean{
            items.remove(name)
    }
    fun canAccommodate(name:String):Boolean{
        return items.size < capacity
    }
    fun containsItem (name:String):Boolean{
        return items.contains(name)
    }
    fun getItems(): List<String> {
        return items.toList() // возвращает неизменяемый список
    }
}