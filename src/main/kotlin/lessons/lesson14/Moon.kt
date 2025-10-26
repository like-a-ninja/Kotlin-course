package org.popkova.lessons.lesson14

class Luna {
    object Moon {
        val isVisible: Boolean = true
        val phase: String = "New Moon"
        fun showPhase() {
            if (isVisible) {
                println("Луна видна и текущая фаза луны $phase")
            } else {
                println("Луна не видна")
            }
        }
    }
}
