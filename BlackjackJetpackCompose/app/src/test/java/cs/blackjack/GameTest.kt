package cs.blackjack

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

//fun <T : Any> T.simpleName(): String {
//    return this::class.simpleName()
//}

class GameTest {


    @Test
    fun testEmptyGame() {

        val g1 = Game()

        assertEquals(expected = 52, actual = g1.deck.size)
        assertEquals(expected = 0, actual = g1.ph.size)
        assertEquals(expected = 0, actual = g1.dh.size)

        assertEquals(expected = "Player", actual = g1.ph.name)
        assertEquals(expected = "Dealer", actual = g1.dh.name)
    }


    @Test
    fun testInitialDeal() {

        //take 4 cards from deck
        //add 2 cards to the ph
        //add 2 cards to the dh

        val g1: Game = Game()

        val g2: Game = g1.deal()



        assertEquals(expected = 48, actual = g2.deck.size)
        assertEquals(expected = 2, actual = g2.ph.size)
        assertEquals(expected = 2, actual = g2.dh.size)


    }

    @Test
    fun testHit() {

        val g1: Game = Game()
        assertEquals(expected = 52, actual = g1.deck.size)
        assertEquals(expected = 0, actual = g1.ph.size)
        assertEquals(expected = 0, actual = g1.dh.size)

        val g2: Game = g1.deal()
        assertEquals(expected = 48, actual = g2.deck.size)
        assertEquals(expected = 2, actual = g2.ph.size)
        assertEquals(expected = 2, actual = g2.dh.size)

        val g3: Game = g2.hit()
        assertEquals(expected = 47, actual = g3.deck.size)
        assertEquals(expected = 3, actual = g3.ph.size)
        assertEquals(expected = 2, actual = g3.dh.size)
    }


    fun String.ff(): String {
        return "$this fff"
    }

    @Test
    fun test1() {
//        val thingWithAgiantFooBarAttheEnd = JFrame()
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size
//        thingWithAgiantFooBarAttheEnd.size



    }

    @Test
    fun test() {


        Game().apply {
            assertEquals(expected = 52, actual = deck.size)
            assertEquals(expected = 0, actual = ph.size)
            assertEquals(expected = 0, actual = ph.points)
            assertFalse(ph.isBlackjack)

            assertEquals(expected = 0, actual = dh.size)
            assertEquals(expected = 0, actual = dh.points)

//            assertTrue(isGameOver)

        }.deal().apply {
            assertEquals(expected = 48, actual = deck.size)

            assertEquals(expected = 2, actual = ph.size)       //1 2
            assertEquals(expected = 3, actual = ph.points)
            assertFalse(ph.isBlackjack)

            assertEquals(expected = 2, actual = dh.size)        //3 4
            assertEquals(expected = 7, actual = dh.points)

            assertFalse(isGameOver)

        }.hit().apply {
            assertEquals(expected = 47, actual = deck.size)

            assertEquals(expected = 3, actual = ph.size)
            assertEquals(expected = 8, actual = ph.points)    //1 2 5
            assertFalse(ph.isBlackjack)

            assertEquals(expected = 2, actual = dh.size)
            assertEquals(expected = 7, actual = dh.points)  //3 4

            assertFalse(isGameOver)
        }.hit().apply {
            assertEquals(expected = 46, actual = deck.size)

            assertEquals(expected = 4, actual = ph.size)
            assertEquals(expected = 14, actual = ph.points)       //1 2 5 6

            assertEquals(expected = 2, actual = dh.size)
            assertEquals(expected = 7, actual = dh.points)          //3 4

            assertFalse(isGameOver)
        }.hit().apply {
            assertEquals(expected = 45, actual = deck.size)

            assertEquals(expected = 5, actual = ph.size)
            assertEquals(expected = 21, actual = ph.points)         //1 2 5 6 7
            assertTrue(ph.isBlackjack)

            assertEquals(expected = 2, actual = dh.size)
            assertEquals(expected = 7, actual = dh.points)      //3 4

            assertTrue(isGameOver)
        }.deal().apply {
            assertEquals(expected = 41, actual = deck.size)

            assertEquals(expected = 2, actual = ph.size)
            assertEquals(expected = 17, actual = ph.points)     //8 9
            assertFalse(ph.isBlackjack)

            assertEquals(expected = 2, actual = dh.size)        //10 11
            assertEquals(expected = 20, actual = dh.points)

            assertFalse(isGameOver)
        }

    }


    @Test
    fun testHit2() {

        val g1: Game = Game()
        assertEquals(expected = 52, actual = g1.deck.size)
        assertEquals(expected = 0, actual = g1.ph.size)
        assertEquals(expected = 0, actual = g1.dh.size)

        val g2: Game = g1.deal()
        assertEquals(expected = 48, actual = g2.deck.size)
        assertEquals(expected = 2, actual = g2.ph.size)
        assertEquals(expected = 2, actual = g2.dh.size)

        val g3: Game = g2.hit()
        assertEquals(expected = 47, actual = g3.deck.size)
        assertEquals(expected = 3, actual = g3.ph.size)
        assertEquals(expected = 2, actual = g3.dh.size)
    }

}


