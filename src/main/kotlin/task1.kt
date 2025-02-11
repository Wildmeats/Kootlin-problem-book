package org.example

//Приветствие по имени
//Даны две переменные: имя1 и имя2. Если они одинаковые, вывести "Привет, тезка!", иначе "Привет, [имя1]!".

fun main() {

    println("Привет введите свое имя первый пользователь")
    val userName1 = readln()
    println("Привет введите свое имя второй пользователь")

    val userName2 = readln()

    if (userName1 == userName2)
        println("Привет, тезка!")
    else
        println("Привет, $userName1")
}