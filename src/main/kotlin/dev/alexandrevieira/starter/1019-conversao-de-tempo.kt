package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    val inputSeconds = readLine()!!.toInt()

    val h = inputSeconds / 3600
    val m = (inputSeconds % 3600) / 60
    val s = inputSeconds % 60

    println("$h:$m:$s")
}