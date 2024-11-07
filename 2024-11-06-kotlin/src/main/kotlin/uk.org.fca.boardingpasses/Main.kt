package uk.org.fca.boardingpasses

import java.io.File
import kotlin.time.measureTime

data class BoardingPass(val row: Int, val col: Int) {
    val seatId get() = (row * 8) + col

    companion object {
        private const val COL_MASK = 0b0000000111

        fun parse(rawBoardingPass: String): BoardingPass {
            val number = Integer.parseInt(
                rawBoardingPass
                    .replace('F', '0')
                    .replace('B', '1')
                    .replace('L', '0')
                    .replace('R', '1'),
                2
            )
            return BoardingPass(number shr 3, number and COL_MASK)
        }
    }
}

fun main () {
    var result: Int
    val executionTime = measureTime{
        result = readPasses("data/boardingcodes")
            .map { BoardingPass.parse(it) }
            .maxBy { it.seatId }
            .seatId
    }
    println(result)
    println("Execution Time $executionTime")
}

fun readPasses(fileName: String): List<String> {
    return File(fileName)
        .useLines { it.toList() }
}
