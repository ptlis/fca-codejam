package uk.org.fca.oppositesattract

import java.io.File
import java.util.ArrayDeque
import kotlin.math.max
import kotlin.time.measureTime

fun main () {
    val largeChemtrail = readChemtrail("data/chemtrail")

    var inPlaceResult: String
    val inPlaceExecutionTime = measureTime{
        inPlaceResult = inPlaceReact(largeChemtrail)
    }
    println("In-place algorithm")
    println(inPlaceResult)
    println(inPlaceResult.length)
    println("Execution Time ${inPlaceExecutionTime}")

    println("")

    var doubleDequeResult: String
    val doubleDequeExecutionTime = measureTime{
        doubleDequeResult = doubleDequeReact(largeChemtrail)
    }
    println("Double Deque algorithm")
    println(doubleDequeResult)
    println(doubleDequeResult.length)
    println("Execution Time ${doubleDequeExecutionTime}")
}

fun readChemtrail(fileName: String): String {
    return File(fileName)
        .useLines { it.toList() }
        .first()
}

fun inPlaceReact(input: String): String {
    if (input.length < 2) {
        return input
    }
    val inputList = input.toCharArray().toMutableList()
    var lPos = 0
    do {
        if (sameLatterDifferentCase(inputList[lPos], inputList[lPos + 1])) {
            inputList.removeAt(lPos)
            inputList.removeAt(lPos)
            lPos = max(lPos - 1, 0)
        } else {
            lPos++
        }
    } while (lPos + 1 < inputList.size)

    return inputList.joinToString("")
}

fun doubleDequeReact(input: String): String {
    if (input.length < 2) {
        return input
    }
    val inputList = ArrayDeque(input.toCharArray().toMutableList())
    val output = ArrayDeque<Char>()
    var lChar: Char
    var rChar: Char

    do {
        lChar = if (output.isNotEmpty()) output.removeLast() else inputList.remove()
        rChar = inputList.remove()

        if (!sameLatterDifferentCase(lChar, rChar)) {
            output.addLast(lChar)
            output.addLast(rChar)
        }

    } while ((inputList.size == 1 && output.size % 2 == 1) || inputList.size > 1)

    return inputList.joinToString("") + output.joinToString("")
}

fun sameLatterDifferentCase(char1: Char, char2: Char): Boolean =
    (char1.isUpperCase() && char2.isLowerCase() && char1.lowercaseChar() == char2)
    || (char1.isLowerCase() && char2.isUpperCase() && char1.uppercaseChar() == char2)