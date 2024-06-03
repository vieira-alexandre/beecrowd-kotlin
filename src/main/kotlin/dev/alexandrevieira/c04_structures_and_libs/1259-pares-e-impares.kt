package dev.alexandrevieira.c04_structures_and_libs

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val evens = LinkedList<Int>()
    val odds = LinkedList<Int>()

    for (i in 1..n) {
        val x = readLine()!!.toInt()
        if (x % 2 == 0) evens.add(x)
        else odds.add(x)
    }

    val sb = StringBuilder()

    evens.sorted().forEach { sb.append("$it\n") }
    odds.sortedDescending().forEach { sb.append("$it\n") }

    print(sb)
}