package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    val r: Double = readLine()!!.toDouble()

    println(String.format("A=%.4f", 3.14159 * (r * r)))
}