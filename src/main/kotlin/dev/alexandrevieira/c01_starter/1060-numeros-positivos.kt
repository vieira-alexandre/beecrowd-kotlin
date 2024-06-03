package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    var count = 0;

    for (i in 0..5) readLine()!!.toDouble().takeIf { it > 0 }?.let { count++ }

    println("$count valores positivos")
}
