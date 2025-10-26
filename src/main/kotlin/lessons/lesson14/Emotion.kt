package org.popkova.lessons.lesson14

class Emotion(val type: String, val intensity: Int) {
    fun express(){
        println("Описание эмоции: $type c уровнем $intensity")
    }
}