package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val values = readLine()!!.split(" ").map { it.toFloat() }

    val a = values[0]
    val b = values[1]
    val c = values[2]

    println(
        if (a + b > c && a + c > b && b + c > a) String.format("Perimetro = %.1f", a + b + c)
        else String.format("Area = %.1f", ((a + b) / 2) * c)
    )
}
