package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    val inputDays = readLine()!!.toInt()

    val years = inputDays / 365
    val months = (inputDays % 365) / 30
    val days = (inputDays % 365) % 30

    println("$years ano(s)\n$months mes(es)\n$days dia(s)")
}
