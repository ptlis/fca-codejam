package uk.org.fca.oppositesattract

import kotlin.test.assertEquals
import kotlin.test.Test

class MainKtTest {
    @Test
    fun testExample1() {
        val input = "aA"
        val expected = ""
        assertEquals(expected, react(input))
    }

    @Test
    fun testExample2() {
        val input = "abBA"
        val expected = ""
        assertEquals(expected, react(input))
    }

    @Test
    fun testExample3() {
        val input = "abAB"
        val expected = "abAB"
        assertEquals(expected, react(input))
    }

    @Test
    fun testExample4() {
        val input = "aabAAB"
        val expected = "aabAAB"
        assertEquals(expected, react(input))
    }

    @Test
    fun testExample5() {
        val input = "dabAcCaCBAcCcaDA"
        val expected = "dabCBAcaDA"
        assertEquals(expected, react(input))
    }

    @Test
    fun testExample6() {
        val input = "aAB"
        val expected = "B"
        assertEquals(expected, react(input))
    }
}