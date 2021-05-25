package aExamplets

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
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



        assertEquals("Spades", c1.computeSuitNameIfExpression())
        assertEquals("Hearts", c2.computeSuitNameIfExpression())
        assertEquals("Clubs", c3.computeSuitNameIfExpression())
        assertEquals("Diamonds", c4.computeSuitNameIfExpression())

        try {
          Card(value = 1, suit = 5)
//            assertEquals("ff", c5.computeSuitNameIfExpression())
            fail("We should never get here")
            //should never get hear
        } catch (e: IllegalArgumentException) {
            println(e.message)
            //success
        }

        assertEquals("Spades", c1.computeSuitName())
        assertEquals("Hearts", c2.computeSuitName())
        assertEquals("Clubs", c3.computeSuitName())
        assertEquals("Diamonds", c4.computeSuitName())

    }

    @Test
    fun testFM() {
        val c1 = Card(value = 1, suit = 1)  //ace of spades

        println(c1.suit)
        println(c1.suitName1)
        println(c1.suitName2)

        c1.suit = 2

        println(c1.suitName1)
        println(c1.suitName2)  //broke
        println(c1.suitName1)
        println(c1.suitName2)

    }
}