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

fun recursiveReact(input: CharArray): CharArray {
    val replaceableInput: MutableList<Char> = input.toMutableList()
    var lPos = 0
    do {
        if (sameLatterDifferentCase(replaceableInput[lPos], replaceableInput[lPos + 1])) {
            replaceableInput.removeAt(lPos)
            replaceableInput.removeAt(lPos)
            lPos--;
        } else {
            lPos++
        }
    } while (lPos + 1 < replaceableInput.size)

    if (input.size != replaceableInput.size && replaceableInput.size > 0) {
        return recursiveReact(replaceableInput.toCharArray())
    }

    return replaceableInput.toCharArray()
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