package org.example

//Проверка баллов на экзамене
//Пользователь вводит свой балл за тест (от 0 до 100).
//
//Если балл от 90 до 100 – вывести "Отлично"
//Если от 70 до 89 – "Хорошо"
//Если от 50 до 69 – "Удовлетворительно"
//Если меньше 50 – "Неудовлетворительно"
const val GREAT_POINTS_DOWN = 90
const val GREAT_POINTS_UP = 100
const val GOOD_POINTS_DOWN = 70
const val GOOD_POINTS_UP = 89
const val SATISFACTORY_POINTS_DOWN = 50
const val SATISFACTORY_POINTS_UP = 69
const val POINTS_DOWN = 0
fun main() {

    println(
        "Вас приветствует программа, где вы можете узнать свою оценку по результатам баллов." +
                "\nВведите свое количество полученных баллов: "
    )

    val userPoints = readln().toInt()

    if (userPoints < POINTS_DOWN || userPoints > GREAT_POINTS_UP)
        println("ОШИБКА!\nВы ввели неправильное число, введите от $POINTS_DOWN до $GREAT_POINTS_UP.")
    else if (userPoints in GREAT_POINTS_DOWN..GREAT_POINTS_UP)
        println("Отлично!")
    else if (userPoints in GOOD_POINTS_DOWN..GOOD_POINTS_UP)
        println("Хорошо")
    else if (userPoints in SATISFACTORY_POINTS_DOWN..SATISFACTORY_POINTS_UP)
        println("Удовлетворительно")
    else
        println("Неудовлетворительно")

}