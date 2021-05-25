package _Labs

import kotlin.test.Test
import kotlin.test.assertEquals


fun computePoints(value: Int): Int {
    require(value in 1..13) { "Bad value[$value]. value must in 1..13" }

    return when (value) {
        in 1..9 -> value
        in 10..13 -> 10
        else -> throw IllegalStateException("Bad value: $value")
    }
}


//don't change the test
//Checkmark when you are done
class PointsDoOnYourOwnSimple {

    @Test
    fun testPoints() {
        assertEquals(1, computePoints(value = 1))
        assertEquals(2, computePoints(value = 2))
        assertEquals(10, computePoints(value = 10))
        assertEquals(10, computePoints(value = 11))
        assertEquals(10, computePoints(value = 13))
    }

}