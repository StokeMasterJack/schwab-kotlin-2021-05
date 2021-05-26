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

}


fun computeHandPoints(cards: List<Card>) = cards.sumOf { it.points }

//

