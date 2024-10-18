package uk.org.fca.santaselves

import java.io.File

fun main() {
    val edges = readEdges("data/presents")
    val paperRequired = edges.sumOf { calculatePaperRequired(it) }
    val ribbonRequired = edges.sumOf { calculateRibbonRequired(it) }

    println("Total paper required: ${java.text.NumberFormat.getIntegerInstance().format(paperRequired)} light-nanoseconds")
    println("Total ribbon required: ${java.text.NumberFormat.getIntegerInstance().format(ribbonRequired)} light-nanoseconds")
}

fun readEdges(fileName: String): List<List<Int>> {
    return File(fileName)
        .useLines { it.toList() }
        .map { rawEdges -> rawEdges
            .split('x')
            .map { rawEdge -> rawEdge.toInt()}
        }
}

fun calculatePaperRequired(edges: List<Int>): Int {
    val sides = listOf(edges[0] * edges[1], edges[1] * edges[2], edges[2] * edges[0])

    return sides.sumOf { it * 2 } + sides.min()
}

fun calculateRibbonRequired(edges: List<Int>): Int {
    return edges.sorted()
        .slice(0..1)
        .sumOf { it * 2 } + (edges[0] * edges[1] * edges[2])
}