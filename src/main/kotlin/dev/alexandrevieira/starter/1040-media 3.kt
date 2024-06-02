package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val line = readLine()!!.split(" ").map { it.toFloat() }

    val average: Float

    val n1: Float = line[0]
    val n2: Float = line[1]
    val n3: Float = line[2]
    val n4: Float = line[3]

    val media: Float = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10

    println(String.format("Media: %.1f", media))

    println(
        if (media >= 7.0) "Aluno aprovado."
        else if (media < 5.0) "Aluno reprovado."
        else "Aluno em exame."
    )

    if (media in 5.0 .. 6.9) {
        val exame: Float = readLine()!!.toFloat()
        println(String.format("Nota do exame: %.1f", exame))
        average = (media + exame) / 2

        println(
            if (average >= 5.0) "Aluno aprovado."
            else "Aluno reprovado."
        )

        println(String.format("Media final: %.1f", average))
    }
}
