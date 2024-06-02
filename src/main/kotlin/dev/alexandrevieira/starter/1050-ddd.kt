package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val areaCodes: Map<Int, String> = mapOf(
        61 to "Brasilia",
        71 to "Salvador",
        11 to "Sao Paulo",
        21 to "Rio de Janeiro",
        32 to "Juiz de Fora",
        19 to "Campinas",
        27 to "Vitoria",
        31 to "Belo Horizonte"
    )

    val code = readLine()!!.toInt()

    println(
        areaCodes[code] ?: "DDD nao cadastrado"
    )
}
