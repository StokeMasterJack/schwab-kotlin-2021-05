package bj

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

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



        assertEquals("Spades", c1.suitName)
        assertEquals("Hearts", c2.suitName)
        assertEquals("Clubs", c3.suitName)
        assertEquals("Diamonds", c4.suitName)


        assertFailsWith<IllegalArgumentException> {
            Card(value = 1, suit = 5)  //here
        }


        assertFailsWith<IllegalArgumentException> {
            Card(value = 16, suit = 4)  //here
        }

    }

    @Test
    fun testValueName() {

        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 2, suit = 2)
        val c10 = Card(value = 10, suit = 3)
        val c11 = Card(value = 11, suit = 4)
        val c13 = Card(value = 13, suit = 4)


        assertEquals("Ace", c1.valueName)
        assertEquals("2", c2.valueName)
        assertEquals("10", c10.valueName)
        assertEquals("Jack", c11.valueName)
        assertEquals("King", c13.valueName)


    }


}