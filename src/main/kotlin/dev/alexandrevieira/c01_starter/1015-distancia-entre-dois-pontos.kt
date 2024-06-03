package dev.alexandrevieira.c01_starter

import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val o1: List<Double> = readLine()!!.split(" ").map { it.toDouble() }
    val o2: List<Double> = readLine()!!.split(" ").map { it.toDouble() }

    val x1: Double = o1[0]
    val y1: Double = o1[1]
    val x2: Double = o2[0]
    val y2: Double = o2[1]

    val distance: Double = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println(String.format("%.4f", distance))
}