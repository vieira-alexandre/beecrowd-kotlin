package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val a = readLine()!!.toFloat()
    val b = readLine()!!.toFloat()
    val c = readLine()!!.toFloat()

    val mean = (a * 2) / 10 + (b * 3) / 10 + (c * 5) / 10

    println(String.format("MEDIA = %.1f", mean))
}