package org.example

/*fun main() {

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

}*/

/*fun main() {
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

/*fun main() {

    val words = arrayOf("яблоко", "банан", "апельсин", "груша")

    for (i in words.size - 1 downTo 0) {
        println(words[i])
    }

}

const val NUMBER1 = 5
const val NUMBER2 = 3
const val NUMBER3 = 0*/

/*
fun main() {

    val numbers = arrayOf(3, 10, 6, 15, 8, 7, 18, 11)

    for (i in numbers) {

        if (i > NUMBER1 && i % NUMBER2 != NUMBER3) {
            println(i)
        }

    }

}*/
/*
fun main(){

    val countdown = arrayOf(5, 4, 3, 2, 1)

    for (i in countdown) {
        println(i)
        Thread.sleep(1000)
    }
    println("Старт!")
    Thread.sleep(1000)
}*/
/*
fun main() {

    val numbers = arrayOf(3, 8, 1, 6, 10, 15, 2)
    var evenCount = 0
    var oddCount = 0
    for (i in numbers ) {
        if (i % 2 == 0) {
            evenCount++
        }

        if (i % 2 != 0) {
            oddCount++
        }

    }
    println("Четных чисел: $evenCount, Нечетных чисел: $oddCount")

}*/
/*
fun main() {

    val numbers = arrayOf(-5, -10, -3, 0, 7, 2, 8)

    for (i in numbers) {
        if(i > 0) {
            println("Первое положительное число: $i")
            break
        }
    }

}*/
/*
fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 2, 5, 2, 6)
    val x = 2
    var sameNumbers = 0

    for (i in numbers) {

        if (i == x) {
            sameNumbers++
        }
    }
    println("Число $x встречается $sameNumbers раза")
}*/

/*Задача 9: Проверка, есть ли число в массиве
Описание:
Дан массив чисел и число x. Нужно проверить, содержится ли x в массиве, и вывести соответствующее сообщение.

Подсказка:

Используй for и if.
Если число найдено, можешь сразу выйти из цикла с break.
Пример массива:

kotlin
Копировать
Редактировать
val numbers = arrayOf(10, 20, 30, 40, 50)
val x = 25
Ожидаемый вывод:

Копировать
Редактировать
Число 25 не найдено в массиве
или

Копировать
Редактировать
Число 25 найдено в массиве*/

/*
fun main() {

    val numbers = arrayOf(10, 20, 30, 40, 50)
    val x = 25
    var checkNumber = false
    for (i in numbers) {

        if (i == x) {
            checkNumber = true
        }
    }
        if (checkNumber) {
            println("Число $x найдено в массиве")
        } else {
            println("Число $x не найдено в массиве")
        }
}*/

/*
Задача 10: Замена отрицательных чисел на 0
Описание:
Дан массив чисел, содержащий как положительные, так и отрицательные значения.
Нужно заменить все отрицательные числа на 0 и вывести изменённый массив.

Подсказка:
Используй for и if с изменением элемента массива.

Пример массива:

val numbers = arrayOf(-3, 5, -7, 2, -1, 8)
Ожидаемый вывод:
0 5 0 2 0 8*/

/*
fun main() {

    val numbers = arrayOf(-3, 5, -7, 2, -1, 8)

    for (i in numbers.indices) {

        if (numbers[i] < 0) {
            numbers[i] = 0

        }

    }
    println(numbers.joinToString())
}*/
