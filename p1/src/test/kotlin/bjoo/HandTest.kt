package bjoo

import kotlin.test.Test
import kotlin.test.assertEquals

class HandTest {

    /*

    Create the Hand class such that this compiles and passes
    Don't change the test
    Checkmark when you are done
     */

    @Test
    fun test() {
        val h1 = Hand(name = "Player")                  //name must be either Player of Dealer

        assertEquals(0,h1.cardCount)
        assertEquals("0 Points",h1.status)
        assertEquals(0,h1.points)
        assertEquals("Player",h1.name)
        assertEquals(false,h1.isBust)
        assertEquals(false,h1.isBlackjack)
        assertEquals(false,h1.isStay)



    }
}