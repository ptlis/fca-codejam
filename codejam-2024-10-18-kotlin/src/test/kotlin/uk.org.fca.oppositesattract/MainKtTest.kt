package uk.org.fca.oppositesattract

import kotlin.test.assertEquals
import kotlin.test.Test

class MainKtTest {
    @Test
    fun testExample1Recursive() {
        val input = "aA"
        val expected = ""
        assertEquals(expected, recursiveReact(input))
    }

    @Test
    fun testExample2Recursive() {
        val input = "abBA"
        val expected = ""
        assertEquals(expected, recursiveReact(input))
    }

    @Test
    fun testExample3Recursive() {
        val input = "abAB"
        val expected = "abAB"
        assertEquals(expected, recursiveReact(input))
    }

    @Test
    fun testExample4Recursive() {
        val input = "aabAAB"
        val expected = "aabAAB"
        assertEquals(expected, recursiveReact(input))
    }

    @Test
    fun testExample5Recursive() {
        val input = "dabAcCaCBAcCcaDA"
        val expected = "dabCBAcaDA"
        assertEquals(expected, recursiveReact(input))
    }

    @Test
    fun testExample1InPlace() {
        val input = "aA"
        val expected = ""
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExample2InPlace() {
        val input = "abBA"
        val expected = ""
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExample3InPlace() {
        val input = "abAB"
        val expected = "abAB"
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExample4InPlace() {
        val input = "aabAAB"
        val expected = "aabAAB"
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExample5InPlace() {
        val input = "dabAcCaCBAcCcaDA"
        val expected = "dabCBAcaDA"
        assertEquals(expected, inPlaceReact(input))
    }
}