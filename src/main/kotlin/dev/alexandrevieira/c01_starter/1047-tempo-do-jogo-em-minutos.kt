package dev.alexandrevieira.c01_starter

fun main(args: Array<String>) {
    val values = readLine()!!.split(" ").map { it.toInt() }

    val totalStartMinutes = values[0] * 60 + values[1]
    val totalEndMinutes = values[2] * 60 + values[3]

    val totalDurationMinutes = when {
        totalEndMinutes > totalStartMinutes -> totalEndMinutes - totalStartMinutes
        totalEndMinutes < totalStartMinutes -> 24 * 60 - totalStartMinutes + totalEndMinutes
        else -> 24 * 60
    }

    println("O JOGO DUROU ${totalDurationMinutes / 60} HORA(S) E ${totalDurationMinutes % 60} MINUTO(S)")
}
