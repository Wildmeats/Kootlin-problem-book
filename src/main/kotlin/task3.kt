package org.example

//Определение пользователя
//Дана переменная роль. Если значение "admin", вывести "Привет, администратор!"
// если "user", вывести "Привет, пользователь!", иначе "Неизвестная роль".
const val ADMIN = "admin"
const val USER = "user"

fun main() {

    println("Введите логин")

    val userLogin = readln().trim().lowercase()

    if (userLogin == ADMIN)
        println("Привет, администратор!")
    else if (userLogin == USER)
        println("Привет, пользователь!")
    else
        println("Неизвестная роль")
}