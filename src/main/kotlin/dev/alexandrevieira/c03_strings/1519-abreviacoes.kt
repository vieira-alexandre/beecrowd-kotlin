package dev.alexandrevieira.c03_strings

data class WordInfo(
    private val size: Int
) {
    private var occurrences: Int = 1

    fun getSavedChar(): Int {
        val total = occurrences * size
        val abbreviated = occurrences * 2
        return total - abbreviated
    }

    fun registerOccurrence() {
        occurrences++
    }
}

fun main(args: Array<String>) {
    while (true) {
        val read = readLine()!!

        if (read == ".") break

        val split = read.split(" ")
        val substitutions = mutableMapOf<Char, String>()
        val sizes = mutableMapOf<String, WordInfo>()

        split.forEach { word ->
            sizes[word]?.registerOccurrence() ?: sizes.put(word, WordInfo(word.length))
        }

        split.forEach { word ->
            if (word.length > 2) {
                val firstLetter = word[0]
                val mappedValue = substitutions[firstLetter]

                if (mappedValue == null || sizes[word]!!.getSavedChar() > sizes[mappedValue]!!.getSavedChar()) {
                    substitutions[firstLetter] = word
                }
            }
        }

        val sb = StringBuilder()

        split.forEachIndexed { index, word ->
            val firstLetter = word[0]
            val mappedValue = substitutions[firstLetter]

            if (mappedValue == word) {
                sb.append("$firstLetter.")
            } else {
                sb.append(word)
            }

            if (index != split.lastIndex) {
                sb.append(" ")
            }
        }

        sb.append("\n${substitutions.size}\n")

        substitutions.toSortedMap().forEach { (key, value) ->
            sb.append("$key. = $value\n")
        }

        print(sb)
    }
}
