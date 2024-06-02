package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val amount = readLine()!!.toInt()
    var remainingAmount = amount

    println(amount)

    println("${remainingAmount / 100} nota(s) de R$ 100,00")
    remainingAmount %= 100

    println("${remainingAmount / 50} nota(s) de R$ 50,00")
    remainingAmount %= 50

    println("${remainingAmount / 20} nota(s) de R$ 20,00")
    remainingAmount %= 20

    println("${remainingAmount / 10} nota(s) de R$ 10,00")
    remainingAmount %= 10

    println("${remainingAmount / 5} nota(s) de R$ 5,00")
    remainingAmount %= 5

    println("${remainingAmount / 2} nota(s) de R$ 2,00")

    println("${remainingAmount % 2} nota(s) de R$ 1,00")
}
