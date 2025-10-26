package org.popkova.lessons.lesson14

fun main() {
    val party = Party()
        party.details()
    val emotion =Emotion("Грусть",10)
    emotion.express()
    val moon = Luna()
    Luna.Moon.showPhase()
    val melon = Product("дыня", 0.5, 10)
    println(melon)
    val concert =Concert("Котики", "Орбита",56.5, 1000)
    concert.details()
    concert.buyTicket()
    concert.details()

}