package _Labs

import org.junit.Test
import kotlin.test.assertEquals

class FunctionOnYourOwn {

    @Test
    fun test() {
        var suit: Int = 1   //try with 1, 2,3 and 4

        //replace the when expr that returns a string with a function that returns a string
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


fun computeSuitName(suit:Int):String{
    return "Spades"
}