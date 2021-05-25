package _Labs

import kotlin.test.Test
import kotlin.test.assertEquals


//also, have a look at:
//   _notes/string-templates-and-multi-line.txt

fun computeCardName(valueName:String,suitName:String):String{


    return "Ace of Spades"

}

//don't change the test
//modify computeCardName function above to make the test pass
//Checkmark when you are done
class StringBuildingLab {


    @Test
    fun test() {
        val cardName11:String = computeCardName("Ace","Spades")
        val cardName44:String = computeCardName("4","Hearts")

        assertEquals("Ace of Spades",cardName11)
        assertEquals("4 of Hearts",cardName44)
    }

}