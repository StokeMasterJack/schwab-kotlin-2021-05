package bjoo

import kotlin.test.Test
import kotlin.test.assertEquals

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

}