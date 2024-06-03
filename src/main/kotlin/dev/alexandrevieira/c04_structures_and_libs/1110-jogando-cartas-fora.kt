package dev.alexandrevieira.c04_structures_and_libs

import java.util.*

fun main(args: Array<String>) {

    val sb = StringBuilder()

    while (true) {
        val n = readLine()!!.toInt()
        if(n == 0) break

        val list = LinkedList<Int>()

        for(i in 1..n) {
            list.addLast(i)
        }

        sb.append("Discarded cards: ")
        val discarded = mutableListOf<Int>()

        while (list.size > 1) {
            discarded.add(list.removeFirst())
            list.addLast(list.removeFirst())
        }

        sb.append(discarded.joinToString(", "))
        sb.append("\nRemaining card: ${list.first}\n")
    }

    print(sb)
}