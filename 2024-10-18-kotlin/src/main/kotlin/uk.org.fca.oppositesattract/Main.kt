package uk.org.fca.oppositesattract

import java.io.File
import kotlin.math.max
import kotlin.time.measureTime

fun main () {
    val largeChemtrail = readChemtrail("data/chemtrail")

    var result = ""
    val executionTime = measureTime{
        result = react(largeChemtrail)
    }

    println(result.length)
    println("Execution Time ${executionTime}")
}

fun readChemtrail(fileName: String): String {
    return File(fileName)
        .useLines { it.toList() }
        .first()
}

fun react(input: String): String {
    val mutableInput = input.toCharArray().toMutableList()
    var lPos = 0
    do {
        if (sameLatterDifferentCase(mutableInput[lPos], mutableInput[lPos + 1])) {
            mutableInput.removeAt(lPos)
            mutableInput.removeAt(lPos)
            lPos = max(lPos - 1, 0)
        } else {
            lPos++
        }
    } while (lPos + 1 < mutableInput.size)

    return mutableInput.joinToString("")
}

fun sameLatterDifferentCase(char1: Char, char2: Char): Boolean =
    (char1.isUpperCase() && char2.isLowerCase() && char1.lowercaseChar() == char2)
    || (char1.isLowerCase() && char2.isUpperCase() && char1.uppercaseChar() == char2)