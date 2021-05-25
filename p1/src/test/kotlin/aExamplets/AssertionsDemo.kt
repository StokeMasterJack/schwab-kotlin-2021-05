package aExamplets

import kotlin.test.Test
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/*

assert:
    throws an AssertionError
    Errors - not catchable
    -ea command line arg: Enable Assertions
        enable them in dev mode
        assertions go away when compiling for prod


require(condition:Boolean):
    throws an IllegalArgumentException
    require does not get compiled in prod builds
    require has some cool msg features  (lambda)

check(condition:Boolean)
    throws an IllegalStateException
    require does not get compiled in prod builds
    require has some cool msg features (lambda)


kotlin.test.assertEquals
    only for unit tests



assert,require,check:
    part of kotlin and meant for non-test

assertEquals
    part the testing framework
    only to be used in unit tests



*/

data class Point1(val x: Int, var y: Int)

data class Point2(val x: Int, var y: Int) {
    init {
        require(x in 1..4)
        require(y in 1..4)
    }
}

class AssertionsDemo {

    @Test
    fun test() {
        assertFails {
            println(computeArea1(100, l = 5))
        }
    }


    @Test
    fun testPointDumb() {
        val p1 = Point1(x = 1, y = 44)

        assertTrue(p1.x in 1..4)
        assertFalse(p1.y in 1..4)
    }

    @Test
    fun testPointSmart() {
        val p1 = Point2(x = 1, y = 1)

        assertFails {
            Point2(x = 1, y = 55)
        }
    }


}


fun computeArea1(w: Int, l: Int): Int {
    assert(w in 1..10)



    return w * l
}

