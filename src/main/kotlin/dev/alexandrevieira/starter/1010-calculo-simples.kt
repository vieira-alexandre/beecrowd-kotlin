package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    val line1 = readLine()!!.split(" ")
    val line2 = readLine()!!.split(" ")

    val q1: Int = line1[1].toInt()
    val p1: Float = line1[2].toFloat()

    val q2: Int = line2[1].toInt()
    val p2: Float = line2[2].toFloat()

    val total = q1 * p1 + (q2 * p2)
    println(String.format("VALOR A PAGAR: R$ %.2f", total))
}