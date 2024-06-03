package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    val line = readLine()!!.split(" ").map { it.toInt() }
    val code: Int = line[0]
    val amount: Int = line[1]

    val total: Double = when (code) {
        1 -> amount * 4.00
        2 -> amount * 4.50
        3 -> amount * 5.00
        4 -> amount * 2.00
        5 -> amount * 1.50
        else -> throw IllegalArgumentException("invalid code")
    }

    println(String.format("Total: R$ %.2f", total))
}