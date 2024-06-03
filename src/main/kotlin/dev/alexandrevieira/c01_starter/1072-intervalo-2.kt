package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    var countIn = 0
    var countOut = 0
    var x: Int

    val n: Int = readLine()!!.toInt()

    for (i in 0 until n) {
        x = readLine()!!.toInt()

        if (x in 10..20) countIn++
        else countOut++
    }

    println("$countIn in")
    println("$countOut out")
}