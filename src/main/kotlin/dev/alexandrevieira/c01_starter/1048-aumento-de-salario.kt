package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val salary: Float = readLine()!!.toFloat()

    val raisePercentage: Int =
        if (salary < 0) throw IllegalArgumentException("Impossível Calcular")
        else if (salary in 0.0..400.0) 15
        else if (salary > 400 && salary <= 800) 12
        else if (salary > 800 && salary <= 1200) 10
        else if (salary > 1200 && salary <= 2000) 7
        else 4

    val raise: Float = salary * raisePercentage / 100
    val newSalary: Float = salary + raise

    println(
        "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%".format(newSalary, raise, raisePercentage)
    )
}
