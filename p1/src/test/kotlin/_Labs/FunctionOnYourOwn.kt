package _Labs

import org.junit.Test
import kotlin.test.assertEquals

/*
Replace the insides of the computeSuitName function, so that it
uses a when expr to compute the correct suitName 9 (a String) for the suit (an Int)
 */
class FunctionOnYourOwn {

    @Test
    fun test() {

        val suitName1: String = computeSuitName(1)
        val suitName2: String = computeSuitName(2)
        val suitName3: String = computeSuitName(3)
        val suitName4: String = computeSuitName(4)


        println("suitName1: $suitName1")
        println("suitName2: $suitName2")
        println("suitName3: $suitName3")
        println("suitName4: $suitName4")

        assertEquals("Spades", suitName1)
        assertEquals("Hearts", suitName2)
        assertEquals("Clubs", suitName3)
        assertEquals("Diamonds", suitName4)

    }
}


fun computeSuitName(suit: Int): String {
    return when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException("Bad suit: $suit")
    }
}

