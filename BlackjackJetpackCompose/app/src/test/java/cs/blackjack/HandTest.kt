package cs.blackjack

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
    private val c3 = Card(3, 4)              //3 points

    private val hand0: Hand = Hand(name = "Player", cards = emptyList(), isStay = false)
    private val hand: Hand = Hand(name = "Player", cards = listOf(c0, c1), isStay = false)
    private val hand21: Hand = Hand(name = "Player", cards = listOf(c0, c1, c2), isStay = false)
    private val hand24: Hand = Hand(name = "Player", cards = listOf(c0, c1, c2, c3), isStay = false)

    @Test
    fun testCopy() {
        val h1: Hand = Hand(name = "Player", cards = listOf(c0, c1), isStay = false)

        val h2:Hand = h1.copy()

        assertEquals(expected = "Player", actual = h2.name)
        assertEquals(expected = 2, actual = h2.size)
        assertEquals(expected = false, actual = h2.isStay)


        val h3:Hand = h2.copy(  cards = h2.cards + c2 )

        assertEquals(expected = "Player", actual = h3.name)
        assertEquals(expected = 3, actual = h3.size)
        assertEquals(expected = false, actual = h3.isStay)




    }

    @Test
    fun testAddCards() {
        val h1 = Hand()

        assertEquals(expected = "Player", actual = h1.name)
        assertEquals(expected = 0, actual = h1.size)
        assertEquals(expected = false, actual = h1.isStay)

        val h2:Hand = h1.addCards(listOf(c0,c1))

        assertEquals(expected = "Player", actual = h2.name)
        assertEquals(expected = 2, actual = h2.size)
        assertEquals(expected = false, actual = h2.isStay)

        val h3:Hand = h2.addCards(listOf(c2))

        assertEquals(expected = "Player", actual = h3.name)
        assertEquals(expected = 3, actual = h3.size)
        assertEquals(expected = false, actual = h3.isStay)

    }


    @Test
    fun testName() {
        val h1: Hand = Hand(name = "Player")
        val h2: Hand = Hand(name = "Dealer")
        assertEquals(expected = "Player", actual = h1.name)
        assertEquals(expected = "Dealer", actual = h2.name)

    }

    @Test
    fun testPoints() {
//        assertEquals(expected = 11, actual = computeHandPoints(cards))
//        assertEquals(expected = 21, actual = computeHandPoints(cards21))
//        assertEquals(expected = 24, actual = computeHandPoints(cards24))


        assertEquals(expected = 0, actual = hand0.points)
        assertEquals(expected = 11, actual = hand.points)
        assertEquals(expected = 21, actual = hand21.points)
        assertEquals(expected = 24, actual = hand24.points)
    }

    @Test
    fun testSize() {
//        assertEquals(expected = 2, actual = computeHandCardCount(cards))
//        assertEquals(expected = 3, actual = computeHandCardCount(cards21))
//        assertEquals(expected = 4, actual = computeHandCardCount(cards24))

        assertEquals(expected = 0, actual = hand0.size)
        assertEquals(expected = 2, actual = hand.size)
        assertEquals(expected = 3, actual = hand21.size)
        assertEquals(expected = 4, actual = hand24.size)
    }

    @Test
    fun testIsBust() {
//        assertEquals(expected = false, actual = computeHandIsBust(cards))
//        assertEquals(expected = false, actual = computeHandIsBust(cards21))
//        assertEquals(expected = true, actual = computeHandIsBust(cards24))

        assertEquals(expected = false, actual = hand0.isBust)
        assertEquals(expected = false, actual = hand.isBust)
        assertEquals(expected = false, actual = hand21.isBust)
        assertEquals(expected = true, actual = hand24.isBust)
    }

    @Test
    fun testIs21() {
//        assertEquals(expected = false, actual = computeHandIsBlackjack(cards))
//        assertEquals(expected = true, actual = computeHandIsBlackjack(cards21))
//        assertEquals(expected = false, actual = computeHandIsBlackjack(cards24))

        assertEquals(expected = false, actual = hand0.isBlackjack)
        assertEquals(expected = false, actual = hand.isBlackjack)
        assertEquals(expected = true, actual = hand21.isBlackjack)
        assertEquals(expected = false, actual = hand24.isBlackjack)
    }

    @Test
    fun testStatus() {
        assertEquals(expected = "0 Points", actual = hand0.status)
        assertEquals(expected = "11 Points", actual = hand.status)
        assertEquals(expected = "Blackjack!", actual = hand21.status)
        assertEquals(expected = "Bust!", actual = hand24.status)
    }


}