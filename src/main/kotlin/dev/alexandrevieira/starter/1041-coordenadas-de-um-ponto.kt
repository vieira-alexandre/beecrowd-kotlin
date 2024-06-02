package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val line = readLine()!!.split(" ").map { it.toFloat() }

    val x: Float = line[0]
    val y: Float = line[1]

    println(
        when {
            x == 0f && y == 0f -> "Origem"
            x == 0f -> "Eixo Y"
            y == 0f -> "Eixo X"
            x > 0 && y > 0 -> "Q1"
            x < 0 && y > 0 -> "Q2"
            x < 0 && y < 0 -> "Q3"
            x > 0 && y < 0 -> "Q4"
            else -> throw IllegalArgumentException("invalid input")
        }
    )
}
