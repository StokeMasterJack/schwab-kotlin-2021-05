package bjfp

import bjoo.Card
import org.junit.Test
import kotlin.test.assertEquals

class HandFunctionsTest {

    private val c0 = Card(1, 1)              //1 point
    private val c1 = Card(13, 4)             //10 points
    private val c2 = Card(11, 1)             //10 points
    private val c3 = Card(3, 4)              //10 points

    private val cards: List<Card> = listOf(c0, c1)
    private val cards21: List<Card> = listOf(c0, c1, c2)
    private val cards24: List<Card> = listOf(c0, c1, c2, c3)

    @Test
    fun testComputeHandPoints() {
        assertEquals(expected = 11, actual = computeHandPoints(cards))
        assertEquals(expected = 21, actual = computeHandPoints(cards21))
        assertEquals(expected = 24, actual = computeHandPoints(cards24))
    }

    @Test
    fun testComputeHandCardCount() {
        assertEquals(expected = 2, actual = computeHandCardCount(cards))
        assertEquals(expected = 3, actual = computeHandCardCount(cards21))
        assertEquals(expected = 4, actual = computeHandCardCount(cards24))
    }

    @Test
    fun testComputeHandIsBust() {
        assertEquals(expected = false, actual = computeHandIsBust(cards))
        assertEquals(expected = false, actual = computeHandIsBust(cards21))
        assertEquals(expected = true, actual = computeHandIsBust(cards24))
    }

    @Test
    fun testComputeHandIs21() {
        assertEquals(expected = false, actual = computeHandIsBlackjack(cards))
        assertEquals(expected = true, actual = computeHandIsBlackjack(cards21))
        assertEquals(expected = false, actual = computeHandIsBlackjack(cards24))
    }

    @Test
    fun testComputeHandStatus() {
        assertEquals(expected = "11 Points", actual = computeHandStatus(cards))
        assertEquals(expected = "Blackjack!", actual = computeHandStatus(cards21))
        assertEquals(expected = "Bust!", actual = computeHandStatus(cards24))
    }
}