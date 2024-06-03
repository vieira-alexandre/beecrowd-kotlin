package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val distance: Int = readLine()!!.toInt()

    val duration: Int = (60 * distance) / 30

    println("$duration minutos")
}