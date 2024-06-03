package dev.alexandrevieira.starter

import java.time.Duration
import java.time.LocalDateTime


fun main(args: Array<String>) {

    val startDate: Int = readLine()!!.split(" ")[1].toInt()
    val startTime: List<Int> = readLine()!!.split(":").map { it.trim().toInt() }

    val endDate: Int = readLine()!!.split(" ")[1].toInt()
    val endTime: List<Int> = readLine()!!.split(":").map { it.trim().toInt() }

    val startDateTime = LocalDateTime.of(2024, 4, startDate, startTime[0], startTime[1], startTime[2])
    val endDateTime = LocalDateTime.of(2024, 4, endDate, endTime[0], endTime[1], endTime[2])

    val durationSeconds = Duration.between(startDateTime, endDateTime).toMillis() / 1000

    var remaingTime = durationSeconds

    val days = durationSeconds / 86400
    remaingTime %= 86400

    val hours = remaingTime / 3600
    remaingTime %= 3600

    val minutes = remaingTime / 60
    remaingTime %= 60

    val seconds = remaingTime

    println("$days dia(s)\n$hours hora(s)\n$minutes minuto(s)\n$seconds segundo(s)")
}
