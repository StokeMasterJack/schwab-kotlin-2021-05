package bjoo

import kotlin.test.Test
import kotlin.test.assertEquals


/*
Task: update the bjoo.Hand class such that HandTest compiles, runs and passes all tests

HandTest is frozen
All your changes will be in the Hand class

Note: don't reinvent the business logic, grab the business logic from bjfp.HandFunctions

 */
class HandTest {

    private val c0 = Card(1, 1)              //1 point
    private val c1 = Card(13, 4)             //10 points
    private val c2 = Card(11, 1)             //10 points
    private val c3 = Card(3, 4)              //10 points

    val hand: Hand = Hand(name = "Player", cards = listOf(c0, c1), isStay = false)
    val hand21: Hand = Hand(name = "Player", cards = listOf(c0, c1, c2), isStay = false)
    val hand24: Hand = Hand(name = "Player", cards = listOf(c0, c1, c2, c3), isStay = false)


    @Test
    fun testPoints() {
//        assertEquals(expected = 11, actual = computeHandPoints(cards))
//        assertEquals(expected = 21, actual = computeHandPoints(cards21))
//        assertEquals(expected = 24, actual = computeHandPoints(cards24))

        assertEquals(expected = 11, actual = hand.points)
        assertEquals(expected = 21, actual = hand21.points)
        assertEquals(expected = 24, actual = hand24.points)
    }

    @Test
    fun testComputeHandSize() {
//        assertEquals(expected = 2, actual = computeHandCardCount(cards))
//        assertEquals(expected = 3, actual = computeHandCardCount(cards21))
//        assertEquals(expected = 4, actual = computeHandCardCount(cards24))

        assertEquals(expected = 2, actual = hand.size)
        assertEquals(expected = 3, actual = hand21.size)
        assertEquals(expected = 4, actual = hand24.size)
    }

    @Test
    fun testComputeHandIsBust() {
//        assertEquals(expected = false, actual = computeHandIsBust(cards))
//        assertEquals(expected = false, actual = computeHandIsBust(cards21))
//        assertEquals(expected = true, actual = computeHandIsBust(cards24))

        assertEquals(expected = false, actual = hand.isBust)
        assertEquals(expected = false, actual = hand21.isBust)
        assertEquals(expected = true, actual = hand24.isBust)
    }

    @Test
    fun testComputeHandIs21() {
//        assertEquals(expected = false, actual = computeHandIsBlackjack(cards))
//        assertEquals(expected = true, actual = computeHandIsBlackjack(cards21))
//        assertEquals(expected = false, actual = computeHandIsBlackjack(cards24))

        assertEquals(expected = false, actual = hand.isBlackjack)
        assertEquals(expected = true, actual = hand21.isBlackjack)
        assertEquals(expected = false, actual = hand24.isBlackjack)
    }

    @Test
    fun testComputeHandStatus() {
        assertEquals(expected = "11 Points", actual = hand.status)
        assertEquals(expected = "Blackjack!", actual = hand21.status)
        assertEquals(expected = "Bust!", actual = hand24.status)
    }


}