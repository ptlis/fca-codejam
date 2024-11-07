package uk.org.fca.boardingpasses

import kotlin.test.assertEquals
import kotlin.test.Test

class MainKtTest {
    @Test
    fun testExample1() {
        val input = "FBFBBFFRLR"
        val expectedObj = BoardingPass(44, 5)
        val expectedSeatId = 357
        assertEquals(expectedObj, BoardingPass.parse(input))
        assertEquals(expectedSeatId, BoardingPass.parse(input).seatId)
    }

    @Test
    fun testExample2() {
        val input = "BFFFBBFRRR"
        val expectedObj = BoardingPass(70, 7)
        val expectedSeatId = 567
        assertEquals(expectedObj, BoardingPass.parse(input))
        assertEquals(expectedSeatId, BoardingPass.parse(input).seatId)
    }

    @Test
    fun testExample3() {
        val input = "FFFBBBFRRR"
        val expectedObj = BoardingPass(14, 7)
        val expectedSeatId = 119
        assertEquals(expectedObj, BoardingPass.parse(input))
        assertEquals(expectedSeatId, BoardingPass.parse(input).seatId)
    }

    @Test
    fun testExample4() {
        val input = "BBFFBBFRLL"
        val expectedObj = BoardingPass(102, 4)
        val expectedSeatId = 820
        assertEquals(expectedObj, BoardingPass.parse(input))
        assertEquals(expectedSeatId, BoardingPass.parse(input).seatId)
    }
}
