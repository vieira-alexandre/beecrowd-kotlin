package dev.alexandrevieira.c01_starter

import java.math.BigDecimal

fun main(args: Array<String>) {
    var amount = BigDecimal(readLine()).setScale(3)

    val notes = arrayOf(
        BigDecimal("100.00").setScale(3),
        BigDecimal("50.00").setScale(3),
        BigDecimal("20.00").setScale(3),
        BigDecimal("10.00").setScale(3),
        BigDecimal("5.00").setScale(3),
        BigDecimal("2.00").setScale(3)
    )
    val coins = arrayOf(
        BigDecimal("1.00").setScale(3),
        BigDecimal("0.50").setScale(3),
        BigDecimal("0.25").setScale(3),
        BigDecimal("0.10").setScale(3),
        BigDecimal("0.05").setScale(3),
        BigDecimal("0.01").setScale(3)
    )

    println("NOTAS:")
    for (note in notes) {
        val count = (amount / note).toInt()
        amount %= note
        println("$count nota(s) de R$ ${note.setScale(2)}")
    }

    println("MOEDAS:")
    for (coin in coins) {
        val count = (amount / coin).toInt()
        amount %= coin
        println("$count moeda(s) de R$ ${coin.setScale(2)}")
    }
}
