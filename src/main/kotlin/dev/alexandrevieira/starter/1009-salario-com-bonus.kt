package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    readLine()!!
    val a: Float = readLine()!!.toFloat()
    val b: Float = readLine()!!.toFloat()

    val total = a + (b * 0.15)

    println(String.format("TOTAL = R$ %.2f", total))
}