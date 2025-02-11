package org.example

//Выбор языка
//Дана переменная язык. Если она "ru", вывести "Привет!",
// если "en", вывести "Hello!", если "fr", вывести "Bonjour!", иначе "Неизвестный язык".
const val RU = "ru"
const val EN = "en"
const val FR = "fr"

fun main() {

    println("Выберете язык. (ru, en, fr):")

    val language = readln().trim().lowercase()

    when (language) {
        RU -> println("Привет!")
        EN -> println("Hello!")
        FR -> println("Bonjour!")
        else -> println("Неизвестный язык")
    }
}