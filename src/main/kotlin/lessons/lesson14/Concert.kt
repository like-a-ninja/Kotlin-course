package org.popkova.lessons.lesson14

class Concert(val band:String, val place:String, val price: Double, val placeCapacity: Int) {
    private var sold:Int=0
    fun buyTicket():Int {
        if (sold < placeCapacity) {
            sold++
            return sold
        } else {
            println("Билеты закончились")
            return sold
        }
    }

fun details(){
    println("Концерт $band, в $place по цене $price. Продано $sold")
}
}