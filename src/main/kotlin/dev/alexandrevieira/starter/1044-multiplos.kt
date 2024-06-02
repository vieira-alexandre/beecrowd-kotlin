package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val values = readLine()!!.split(" ").map { it.toInt() }
    val a = values[0]
    val b = values[1]

    println(if (a % b == 0 || b % a == 0) "Sao Multiplos" else "Nao sao Multiplos")
}
