package uk.org.fca.oppositesattract

import kotlin.test.assertEquals
import kotlin.test.Test

class MainKtTest {
    @Test
    fun testExampleInPlace1() {
        val input = "aA"
        val expected = ""
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExampleInPlace2() {
        val input = "abBA"
        val expected = ""
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExampleInPlace3() {
        val input = "abAB"
        val expected = "abAB"
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExampleInPlace4() {
        val input = "aabAAB"
        val expected = "aabAAB"
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExampleInPlace5() {
        val input = "dabAcCaCBAcCcaDA"
        val expected = "dabCBAcaDA"
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExampleInPlace6() {
        val input = "aAB"
        val expected = "B"
        assertEquals(expected, inPlaceReact(input))
    }

    @Test
    fun testExampleDoubleDeque1() {
        val input = "aA"
        val expected = ""
        assertEquals(expected, doubleDequeReact(input))
    }

    @Test
    fun testExampleDoubleDeque2() {
        val input = "abBA"
        val expected = ""
        assertEquals(expected, doubleDequeReact(input))
    }

    @Test
    fun testExampleDoubleDeque3() {
        val input = "abAB"
        val expected = "abAB"
        assertEquals(expected, doubleDequeReact(input))
    }

    @Test
    fun testExampleDoubleDeque4() {
        val input = "aabAAB"
        val expected = "aabAAB"
        assertEquals(expected, doubleDequeReact(input))
    }

    @Test
    fun testExampleDoubleDeque5() {
        val input = "dabAcCaCBAcCcaDA"
        val expected = "dabCBAcaDA"
        assertEquals(expected, doubleDequeReact(input))
    }

    @Test
    fun testExampleDoubleDeque6() {
        val input = "aAB"
        val expected = "B"
        assertEquals(expected, doubleDequeReact(input))
    }
}