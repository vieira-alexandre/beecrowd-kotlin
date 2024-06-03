package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    var x = readLine()!!.toInt()

    var count = 0

    while (count < 6) {
        if (x % 2 == 1) {
            println(x)
            count++
        }
        x++
    }
}
