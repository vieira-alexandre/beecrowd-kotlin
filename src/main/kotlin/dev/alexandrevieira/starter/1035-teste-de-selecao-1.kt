package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    val line = readLine()!!.split(" ").map { it.toInt() }

    val a: Int = line[0]
    val b: Int = line[1]
    val c: Int = line[2]
    val d: Int = line[3]


    println(
        if (b > c && d > a && c + d > a + b && c >= 0 && d >= 0 && a % 2 == 0) "Valores aceitos"
        else "Valores nao aceitos"
    )
}