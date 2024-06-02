package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    val difference = (a * b) - (c * d)

    println("DIFERENCA = $difference")
}