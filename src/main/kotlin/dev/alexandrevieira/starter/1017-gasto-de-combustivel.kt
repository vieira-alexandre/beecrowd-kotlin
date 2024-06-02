package dev.alexandrevieira.starter


fun main(args: Array<String>) {
    val duration: Int = readLine()!!.toInt()
    val speed: Int = readLine()!!.toInt()

    val fuelEfficiency = 12f
    val fuel: Float = (duration * speed) / fuelEfficiency
    print(String.format("%.3f\n", fuel))
}