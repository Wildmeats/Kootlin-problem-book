package org.example

/*Задача 1: Подсчет четных и нечетных чисел
Описание:
У тебя есть массив чисел. Нужно посчитать, сколько в нем четных и сколько нечетных чисел, и вывести результат.

Подсказка:
Используй for для перебора элементов массива и оператор % для проверки четности.*/

fun main() {

    val numbers = arrayOf(3, 8, 1, 6, 10, 15, 2)

    var evenNumber = 0
    var oddNumber = 0

    for (i in numbers) {
        if (i % 2 == 0) {
            evenNumber++
        } else {
            oddNumber++
        }
    }
    println("Четных чисел: $evenNumber\nНечетных чисел: $oddNumber")

}

/*
Задача 2: Поиск максимального и минимального элементов
Описание:
Дан массив чисел. Нужно найти в нем максимальное и минимальное число.

Подсказка:

Используй переменные для хранения текущего максимального и минимального значений.
Перебирай массив с помощью for.*/
/*
fun main() {
    val numbers = arrayOf(7, 2, 9, -1, 5, 12, 0)

    var maxNumber = numbers [0]
    var minNumbers = numbers [0]

    for(i in numbers) {
        if (i > maxNumber) {
            maxNumber = i
        } else {
            minNumbers = i
        }
        println("$maxNumber, $minNumbers")
    }
}*/
