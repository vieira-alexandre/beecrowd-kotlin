package dev.alexandrevieira.c01_starter


fun main(args: Array<String>) {
    val line = readLine()!!.split(" ")

    val a: Float = line[0].toFloat()
    val b: Float = line[1].toFloat()
    val c: Float = line[2].toFloat()

    val triangle = a * c / 2
    val circle = c * c * 3.14159
    val trapezoid = (a + b) / 2 * c
    val square = b * b
    val rectangle = a * b

    println(String.format("TRIANGULO: %.3f", triangle))
    println(String.format("CIRCULO: %.3f", circle))
    println(String.format("TRAPEZIO: %.3f", trapezoid))
    println(String.format("QUADRADO: %.3f", square))
    println(String.format("RETANGULO: %.3f", rectangle))
}