package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    var count = 0
    var mean = 0.0

    for (i in 1..6) readLine()!!.toDouble().takeIf { it > 0 }?.also { count++ }?.also { mean += it }

    println("%d valores positivos\n%.1f".format(count, mean / count))
}
