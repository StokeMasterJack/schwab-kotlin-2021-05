package _Labs

import bjoo.Card
import kotlin.test.Test
import kotlin.test.assertEquals


/*
Task: create the function computeHandPoints such that testComputeHandPoints compiles, runs and passes

Hint: use sumOf

 */
class HandPointsLab {


    @Test
    fun testComputeHandPoints() {
        val c0 = Card(1, 1)  //1 point
        val c1 = Card(13, 4) //10 points
        val cards: List<Card> = listOf(c0, c1)

        val hp = computeHandPoints(cards)

        assertEquals(expected = 11,actual = hp)




    }

}