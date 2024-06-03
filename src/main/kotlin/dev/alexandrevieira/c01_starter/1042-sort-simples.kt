package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val values = readLine()!!.split(" ").map { it.toInt() }

    values.sorted().forEach { println(it) }
    println()
    values.forEach { println(it) }
}
