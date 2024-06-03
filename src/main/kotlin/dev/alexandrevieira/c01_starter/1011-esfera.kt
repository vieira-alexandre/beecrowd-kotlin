package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    val r: Int = readLine()!!.toInt()
    val v: Double = 3.14159 * r * r * r * 4 / 3
    println(String.format("VOLUME = %.3f", v))
}