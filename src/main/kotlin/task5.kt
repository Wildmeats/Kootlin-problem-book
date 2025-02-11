package org.example

//1. Калькулятор скидки
//Пользователь вводит сумму покупки. Если сумма больше 10 000, применяется скидка 10%.
//Если больше 5 000, скидка 5%. В остальных случаях скидка не дается. Вывести сумму к оплате.
const val AMOUNT_OF_MONEY = 10_000
const val AMOUNT_OF_MONEY2 = 5_000
const val DISCOUNT = 10
const val DISCOUNT2 = 5
const val PERCENTS = 100

fun main() {

    println("Введите сумму покупки:")

    val productPrice = readln().toInt()

    if (productPrice >= AMOUNT_OF_MONEY) {
        val userFinalPrice = productPrice / PERCENTS
        val userFinalFinalPrice = userFinalPrice * DISCOUNT
        val userLastPrice = productPrice - userFinalFinalPrice
        println("Скидка составила $DISCOUNT%, к оплате: $userLastPrice")
    } else if (productPrice >= AMOUNT_OF_MONEY2) {
        val userFinalPrice2 = productPrice / PERCENTS
        val userFinalFinalPrice2 = userFinalPrice2 * DISCOUNT2
        val userLastPrice2 = productPrice - userFinalFinalPrice2
        println("Скидка составила $DISCOUNT2%, к оплате: $userLastPrice2")
    } else
        println("Что-бы получить скидку цена должна составить выше $AMOUNT_OF_MONEY2 рублей.\nК оплате: $productPrice")
}