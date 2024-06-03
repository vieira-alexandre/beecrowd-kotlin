package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    var count = 0

    for (i in 1..5) readLine()!!.toInt().takeIf { it % 2 == 0 }?.also { count++ }

    println("$count valores pares")
}
