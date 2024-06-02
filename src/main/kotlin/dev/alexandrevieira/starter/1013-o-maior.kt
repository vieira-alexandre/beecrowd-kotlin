package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val line = readLine()!!.split(" ")

    val a: Int = line[0].toInt()
    val b: Int = line[1].toInt()
    val c: Int = line[2].toInt()

    println("${maxOf(maxOf(a, b), c)} eh o maior")
}