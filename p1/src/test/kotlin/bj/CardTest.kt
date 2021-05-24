package bj

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class CardTest {

    @Test
    fun test1() {
        val c1 = Card(value = 1, suit = 1)  //ace of spades

        assertEquals(1, c1.suit)
        assertEquals(1, c1.value)

        val c2 = c1.copy(suit = 4)

        assertEquals(4, c2.suit)
        assertEquals(1, c2.value)

    }

    @Test
    fun testSuitName() {

        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 1, suit = 2)
        val c3 = Card(value = 1, suit = 3)
        val c4 = Card(value = 1, suit = 4)

        val c5 = Card(value = 1, suit = 5)

        assertEquals("Spades", c1.computeSuitNameIfExpression())
        assertEquals("Hearts", c2.computeSuitNameIfExpression())
        assertEquals("Clubs", c3.computeSuitNameIfExpression())
        assertEquals("Diamonds", c4.computeSuitNameIfExpression())

        try {
            assertEquals("ff", c5.computeSuitNameIfExpression())
            fail("We should never get here")
            //should never get hear
        } catch (e: IllegalStateException) {
            println(e.message)
            //success
        }

        assertEquals("Spades", c1.computeSuitNameWhenExpression())
        assertEquals("Hearts", c2.computeSuitNameWhenExpression())
        assertEquals("Clubs", c3.computeSuitNameWhenExpression())
        assertEquals("Diamonds", c4.computeSuitNameWhenExpression())

    }
}