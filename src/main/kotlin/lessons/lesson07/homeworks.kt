package org.popkova.lessons.lesson07

import org.popkova.lessons.lesson06.homeworks.task1
import org.popkova.lessons.lesson06.homeworks.task4
import org.popkova.lessons.lesson06.homeworks.task5
import org.popkova.lessons.lesson06.homeworks.task6
import org.popkova.lessons.lesson06.homeworks.task7
import org.popkova.lessons.lesson06.homeworks.task8

fun task1() {

    for (i in 1..5) {
        println(i)
    }
}


fun task2() {

    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }
}

fun task3() {

    for (i in 5 downTo  1) {
        println(i)
    }
}

fun task4() {

    for (i in 10 downTo 1) {
        println(i-2)
    }
}
fun task5() {

    for (i in 1..9 step 2) {
        println(i)
    }
}

fun task6() {

    for (i in 1..20 step 3) {
        println(i)
    }
}

fun task7() {
    val size = 10
    for (i in 3 until size step 2) {
        println(i)
    }
    println("задание 8")
}

fun task8() {
    var i = 0
    while (i++ <5){
        println(i *i)
    }
    println("задание 9")
}

fun task9() {
    var i = 10
    while (i >=5){
        println(i--)
    }
    println("задание 10")
}

fun task10() {
    var i: Int = 1
    do {
        println(i++)

    }
    while (i <= 5)
    println("задание 11")
}

fun task11() {
    var i: Int = 5
    do {
        println(i++)

    }
    while (i <= 10)
    println("задание 12")
}

fun task12() {

    for (i in 1..10) {
        if(i==6) break
        println(i)
    }
    println("задание 13")
}

fun task13() {
    var i = 1
    while (true){
        if (i==10) {
            break
        }
        println(i)
        i++
    }
    println("задание 14")
}

fun task14() {

    for (i in 1..10) {
        if(i % 2 ==0 ) continue
        println(i)
    }
    println("задание 15")
}


fun task15() {

    for (i in 1..10) {
        if(i % 3 ==0 ) continue
        println(i)
    }

}















fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
    task9()
    task10()
    task11()
    task12()
    task13()
    task14()
    task15()



}

