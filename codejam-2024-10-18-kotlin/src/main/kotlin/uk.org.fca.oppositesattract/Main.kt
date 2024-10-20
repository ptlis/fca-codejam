package uk.org.fca.oppositesattract

import java.io.File
import kotlin.math.max

fun main () {
    val largeChemtrail = readChemtrail("data/chemtrail")
    println(largeChemtrail)
    println(react(largeChemtrail))
}

fun readChemtrail(fileName: String): String {
    return File(fileName)
        .useLines { it.toList() }
        .first()
}


fun react(input: String): String {
    return recursiveReact(input.toCharArray()).joinToString("")
}

fun recursiveReact(input: CharArray, position: Int = 0): CharArray {
    for (i in position..(input.size - 2)) {
        if (sameLatterDifferentCase(input[i], input[i + 1])) {
            return recursiveReact(
                input.filterIndexed { j, _ -> j != i && j != i + 1 }.toCharArray(),
                max(i - 1, 0)
            )
        }
    }

    return input
}

fun sameLatterDifferentCase(char1: Char, char2: Char): Boolean =
    (char1.isUpperCase() && char2.isLowerCase() && char1.lowercaseChar() == char2)
    || (char1.isLowerCase() && char2.isUpperCase() && char1.uppercaseChar() == char2)