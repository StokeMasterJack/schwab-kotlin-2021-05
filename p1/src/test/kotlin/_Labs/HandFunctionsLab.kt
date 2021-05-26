package _Labs

import bjoo.Card
import kotlin.test.Test
import kotlin.test.assertEquals


/*
Task: create the function computeCardCount such that testComputeCardCount compiles, runs and passes

Hint: use List's size function

 */
class HandFunctionsLab {

    private val c0 = Card(1, 1)              //1 point
    private val c1 = Card(13, 4)             //10 points
    private val cards: List<Card> = listOf(c0, c1)

    @Test
    fun testComputeHandPoints() {
        val hp = computeHandPoints(cards)
        assertEquals(expected = 11, actual = hp)
    }

    @Test
    fun testComputeCardCount() {
        val cc = computeCardCount(cards)
        assertEquals(expected = 2, actual = cc)
    }

    @Test
    fun testComputeIsBust() {
        val b = computeIsBust(cards)
        assertEquals(expected = false, actual = b)
    }

    @Test
    fun testComputeIs21() {
        val b = computeIsBlackjack(cards)
        assertEquals(expected = false, actual = b)
    }

    @Test
    fun testComputeStatus() {
        val s = computeStatus(cards)
        assertEquals(expected = "11 Points", actual = s)
    }
}


private fun computeHandPoints(cards: List<Card>): Int = cards.sumOf { it.points }

private fun computeCardCount(cards: List<Card>): Int = cards.size

