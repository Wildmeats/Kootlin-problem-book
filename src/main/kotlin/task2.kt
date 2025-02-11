package org.example

//Проверка пароля
//Дана строковая переменная пароль. Если она равна "qwerty", вывести "Доступ разрешен", иначе "Неверный пароль".

const val PASSWORD = "qwerty"

fun main() {

    println("Введите пароль")

    val userPassword = readln()

    if (userPassword == PASSWORD)
        println("Доступ разрешен")
    else
        println("Неверный пароль")
}