package bjfp

import kotlin.test.Test
import kotlin.test.assertEquals

//don't change the test
//Checkmark when you are done
class CardFunctionsTest {

    @Test
    fun testSuitName() {
        val suitName1: String = computeSuitName(1)
        val suitName2: String = computeSuitName(2)
        val suitName3: String = computeSuitName(3)
        val suitName4: String = computeSuitName(4)

        assertEquals("Spades", suitName1)
        assertEquals("Hearts", suitName2)
        assertEquals("Clubs", suitName3)
        assertEquals("Diamonds", suitName4)
    }

    @Test
    fun testValueName() {
        val valueName1 = computeValueName(1)
        val valueName2 = computeValueName(2)
        val valueName10 = computeValueName(10)
        val valueName11 = computeValueName(11)
        val valueName13 = computeValueName(13)

        assertEquals("Ace", valueName1)
        assertEquals("2", valueName2)
        assertEquals("10", valueName10)
        assertEquals("Jack", valueName11)
        assertEquals("King", valueName13)
    }


    @Test
    fun testCardName() {
        assertEquals("Ace of Spades", computeCardName(value = 1, suit = 1))
        assertEquals("2 of Clubs", computeCardName(value = 2, suit = 3))
        assertEquals("10 of Diamonds", computeCardName(value = 10, suit = 4))
        assertEquals("Jack of Diamonds", computeCardName(value = 11, suit = 4))
        assertEquals("King of Diamonds", computeCardName(value = 13, suit = 4))
    }


    @Test
    fun testPoints() {
        assertEquals(1, computePoints(value = 1))
        assertEquals(2, computePoints(value = 2))
        assertEquals(10, computePoints(value = 10))
        assertEquals(10, computePoints(value = 11))
        assertEquals(10, computePoints(value = 13))
    }

}