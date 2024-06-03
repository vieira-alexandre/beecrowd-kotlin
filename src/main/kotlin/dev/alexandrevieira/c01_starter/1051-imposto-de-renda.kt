package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val salary = readLine()!!.toFloat()
    var incomeTax = 0.0

    if (salary > 2000) incomeTax += minOf(salary - 2000, 1000f) * 8 / 100.0
    if (salary > 3000) incomeTax += minOf(salary - 3000, 1500f) * 18 / 100.0
    if (salary > 4500) incomeTax += (salary - 4500) * 28 / 100.0

    println(if (incomeTax == 0.0) "Isento" else "R$ %.2f".format(incomeTax))
}
