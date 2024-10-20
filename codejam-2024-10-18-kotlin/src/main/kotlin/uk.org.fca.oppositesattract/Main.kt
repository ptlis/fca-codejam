package uk.org.fca.oppositesattract

import java.io.File
import kotlin.math.max
import kotlin.time.measureTime

fun main () {
    val largeChemtrail = readChemtrail("data/chemtrail")
    println(largeChemtrail)

    var recursiveResult = ""
    val recursiveExecutionTime = measureTime{
        recursiveResult = recursiveReact(largeChemtrail)
    }

    println("Recursive algorithm")
    println(recursiveResult)
    println("Execution time $recursiveExecutionTime")

    var inPlaceResult = ""
    val inPlaceExecutionTime = measureTime{
        inPlaceResult = inPlaceReact(largeChemtrail)
    }

    println("In-place algorithm")
    println(inPlaceResult)
    println("Execution time $inPlaceExecutionTime")
}

fun readChemtrail(fileName: String): String {
    return File(fileName)
        .useLines { it.toList() }
        .first()
}

fun recursiveReact(input: String): String = recursiveReact(input.toCharArray()).joinToString("")

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

fun inPlaceReact(input: String): String {
    val mutableInput = input.toCharArray().toMutableList()
    var lPos = 0
    do {
        if (sameLatterDifferentCase(mutableInput[lPos], mutableInput[lPos + 1])) {
            mutableInput.removeAt(lPos)
            mutableInput.removeAt(lPos)
            lPos--
        } else {
            lPos++
        }
    } while (lPos + 1 < mutableInput.size)

    return mutableInput.joinToString("")
}

fun sameLatterDifferentCase(char1: Char, char2: Char): Boolean =
    (char1.isUpperCase() && char2.isLowerCase() && char1.lowercaseChar() == char2)
    || (char1.isLowerCase() && char2.isUpperCase() && char1.uppercaseChar() == char2)