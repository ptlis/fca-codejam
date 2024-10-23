package uk.org.fca.santaselves

import kotlin.test.assertEquals
import kotlin.test.Test

class MainKtTest {
    @Test
    fun testPaperExample1() {
        val expected = 58
        assertEquals(expected, calculatePaperRequired(listOf(2, 3, 4)))
    }

    @Test
    fun testPaperExample2() {
        val expected = 43
        assertEquals(expected, calculatePaperRequired(listOf(1, 1, 10)))
    }

    @Test
    fun testRibbonExample1() {
        val expected = 34
        assertEquals(expected, calculateRibbonRequired(listOf(2, 3, 4)))
    }

    @Test
    fun testRibbonExample2() {
        val expected = 14
        assertEquals(expected, calculateRibbonRequired(listOf(1, 1, 10)))
    }
}