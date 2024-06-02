package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toFloat()

    val salary = b * c

    println("NUMBER = $a")
    println(String.format("SALARY = U$ %.2f", salary))
}