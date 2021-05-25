package _Labs

import kotlin.test.Test
import kotlin.test.assertEquals


fun computeSuitName1(suit: Int): String {
    require(suit in 1..4) { "Bad suit[$suit]. suit must in 1..4" }
    return when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException("Bad suit: $suit")
    }
}

fun computeValueName1(value: Int): String {
    require(value in 1..13) { "Bad value[$value]. value must in 1..13" }
    return when (value) {
        1 -> "Ace"
        in 2..10 -> value.toString()
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
        else -> throw IllegalStateException("Bad value: $value")
    }
}


fun computeCardName(value: Int, suit: Int): String {
    require(value in 1..13) { "Bad value[$value]. value must in 1..13" }
    require(suit in 1..4) { "Bad suit[$suit]. suit must in 1..4" }



    return "Ace of Spades"
}


//don't change the test
//Checkmark when you are done
class CardNameLab {

    @Test
    fun testSuitName1() {
        val suitName1: String = computeSuitName1(1)
        val suitName2: String = computeSuitName1(2)
        val suitName3: String = computeSuitName1(3)
        val suitName4: String = computeSuitName1(4)

        assertEquals("Spades", suitName1)
        assertEquals("Hearts", suitName2)
        assertEquals("Clubs", suitName3)
        assertEquals("Diamonds", suitName4)
    }

    @Test
    fun testValueName1() {
        val valueName1 = computeValueName1(1)
        val valueName2 = computeValueName1(2)
        val valueName10 = computeValueName1(10)
        val valueName11 = computeValueName1(11)
        val valueName13 = computeValueName1(13)

        assertEquals("Ace", valueName1)
        assertEquals("2", valueName2)
        assertEquals("10", valueName10)
        assertEquals("Jack", valueName11)
        assertEquals("King", valueName13)
    }



    @Test
    fun testCardName2() {
        assertEquals("Ace of Spades", computeCardName(value = 1, suit = 1))
        assertEquals("2 of Clubs", computeCardName(value = 2, suit = 3))
        assertEquals("10 of Diamonds", computeCardName(value = 10, suit = 4))
        assertEquals("Jack of Diamonds", computeCardName(value = 11, suit = 4))
        assertEquals("King of Diamonds", computeCardName(value = 13, suit = 4))
    }

}