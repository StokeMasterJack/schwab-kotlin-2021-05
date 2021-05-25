package aExamplets

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class Ranges {

    @Test
    fun test1() {

        val suitRange = IntRange(1, 4)

        assertTrue(1 in suitRange)
        assertTrue(4 in suitRange)
        assertFalse(-1 in suitRange)
        assertFalse(5 in suitRange)


    }


    @Test
    fun test2() {

        val suitRange = 1..4

        assertTrue(1 in suitRange)
        assertTrue(4 in suitRange)
        assertFalse(-1 in suitRange)
        assertFalse(5 in suitRange)


    }
}