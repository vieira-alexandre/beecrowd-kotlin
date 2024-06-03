package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val a: Float = readLine()!!.toFloat()

    println(
        if (a in 0.0..25.0) "Intervalo [0,25]"
        else if (a > 25 && a <= 50) "Intervalo (25,50]"
        else if (a > 50 && a <= 75) "Intervalo (50,75]"
        else if (a > 75 && a <= 100) "Intervalo (75,100]"
        else "Fora de intervalo"
    )
}