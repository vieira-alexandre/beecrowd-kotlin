package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val x = readLine()!!.toInt()

    for (i in 1..x step 2) println(i)
}
