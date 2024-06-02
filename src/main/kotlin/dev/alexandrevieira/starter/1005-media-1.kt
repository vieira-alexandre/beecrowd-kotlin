package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val a = readLine()!!.toFloat()
    val b = readLine()!!.toFloat()

    val mean = a * 3.5 / 11 + (b * 7.5) / 11

    println(String.format("MEDIA = %.5f", mean))
}