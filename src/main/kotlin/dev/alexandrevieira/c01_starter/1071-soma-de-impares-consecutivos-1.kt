package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    val x: Int = readLine()!!.toInt()
    val y: Int = readLine()!!.toInt()

    var result = 0

    val lesser = if (x > y) y else x
    val largest = if (x >= y) x else y

    for (a in lesser + 1 until largest)
        if (a % 2 != 0) result += a

    println(result)
}