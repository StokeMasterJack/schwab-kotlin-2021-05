package _Labs

import org.junit.Test

class ExprOnYourOwn {


    @Test
    fun test() {
        var suit: Int = 1   //try with 1, 2,3 and 4

        //replace "Spades" String literal with a when expr that returns a string
        val suitName: String = when (suit) {
            1 -> "Spades"
            2 -> "Hearts"
            3 -> "Clubs"
            4 -> "Diamonds"
            else -> throw IllegalStateException("Bad suit: $suit")
        }


        println("suit: $suit   suitName: $suitName")

//        assertEquals("Spades", suitName)

    }
}