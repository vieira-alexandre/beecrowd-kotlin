package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toFloat()

    println(String.format("%.3f km/l", x / y))
}