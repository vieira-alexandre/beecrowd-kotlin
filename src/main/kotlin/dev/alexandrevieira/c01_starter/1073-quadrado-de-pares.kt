package dev.alexandrevieira.c01_starter

import kotlin.math.pow


fun main(args: Array<String>) {
    var x: Int
    val n: Int = readLine()!!.toInt()

    for (i in 1..n) {
        if (i % 2 == 0) {
            x = i.toDouble().pow(2).toInt()
            println("$i^2 = $x")
        }
    }
}