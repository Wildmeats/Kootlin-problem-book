package org.example

//4. Конвертер валют
//Пользователь вводит сумму в рублях и выбирает валюту ("usd", "eur" или "cny").
//Курс:
//
//1 руб = 0.011 USD
//1 руб = 0.01 EUR
//1 руб = 0.078 CNY
//Вывести сумму в выбранной валюте.
const val USD = 0.011
const val EUR = 0.01
const val CNY = 0.078

fun main() {

    val currency = setOf("usd", "eur", "cny")

    println("Добрый день! Вас приветствует программа которая ковертирует валюту.\nВведите сумму в рублях:")

    val userRubles = readln().toDoubleOrNull()
    if (userRubles == null) {
        println("Ошибка! Введите корректное число в рублях.")
        return
    }

    println(
        "Теперь введите в какую валюту вы хотите конвертировать свои деньги.\n" +
                "На данный момент вы можете ковертировать в данную валюту - (USD, EUR, CNY):"
    )

    val userCurrency = readln().trim().lowercase()

    if (userCurrency !in currency) {
        println("Ошибка! Введите корректную валюту - (USD, EUR, CNY)")
    } else {
        when (userCurrency) {
            "usd" -> println("Вы можете получить такую сумму в долларах: %.2f".format(userRubles * USD))
            "eur" -> println("Вы можете получить такую сумму в евро: %.2f".format(userRubles * EUR))
            "cny" -> println("Вы можете получить такую сумму в юанях: %.2f".format(userRubles * CNY))
        }
    }

}