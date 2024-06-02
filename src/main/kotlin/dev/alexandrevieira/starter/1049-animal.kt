package dev.alexandrevieira.starter

fun main(args: Array<String>) {
    val animals = mapOf<String, Map<String, Map<String, String>>>(
        "vertebrado" to mapOf(
            "ave" to mapOf(
                "carnivoro" to "aguia",
                "onivoro" to "pomba"
            ),
            "mamifero" to mapOf(
                "onivoro" to "homem",
                "herbivoro" to "vaca"
            )
        ),
        "invertebrado" to mapOf(
            "inseto" to mapOf(
                "hematofago" to "pulga",
                "herbivoro" to "lagarta"
            ),
            "anelideo" to mapOf(
                "hematofago" to "sanguessuga",
                "onivoro" to "minhoca"
            )
        )
    )

    val a1: String = readLine()!!
    val a2: String = readLine()!!
    val a3: String = readLine()!!

    println(animals[a1]!![a2]!![a3])
}
