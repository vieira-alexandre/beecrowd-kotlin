package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    var positives = 0
    var negatives = 0
    var odds = 0
    var evens = 0

    for (i in 1..5) {
        val x = readLine()!!.toInt()

        if (x % 2 == 0) evens++
        else odds++

        if (x > 0) positives++
        if (x < 0) negatives++
    }

    println("$evens valor(es) par(es)")
    println("$odds valor(es) impar(es)")
    println("$positives valor(es) positivo(s)")
    println("$negatives valor(es) negativo(s)")
}
