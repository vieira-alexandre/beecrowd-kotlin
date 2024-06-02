package dev.alexandrevieira.starter

import java.time.Month
import java.time.format.TextStyle
import java.util.*

fun main(args: Array<String>) {
    val input = readLine()!!.toInt()

    val month = Month.of(input)

    println(month.getDisplayName(TextStyle.FULL, Locale.US))
}
