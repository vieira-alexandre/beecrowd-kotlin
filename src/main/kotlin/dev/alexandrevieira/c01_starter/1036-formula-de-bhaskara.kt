package dev.alexandrevieira.c01_starter

import kotlin.math.pow
import kotlin.math.sqrt


fun main(args: Array<String>) {
    val line = readLine()!!.split(" ").map { it.toDouble() }

    val a: Double = line[0]
    val b: Double = line[1]
    val c: Double = line[2]

    val delta = b.pow(2) - (4 * a * c)
    if (delta <= 0 || a <= 0) {
        println("Impossivel calcular")
        return
    }

    val r1 = (-b + sqrt(delta)) / (2 * a)
    val r2 = (-b - sqrt(delta)) / (2 * a)

    print(String.format("R1 = %.5f\nR2 = %.5f\n", r1, r2))
}