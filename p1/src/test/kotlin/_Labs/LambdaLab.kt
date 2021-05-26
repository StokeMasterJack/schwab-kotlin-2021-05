package _Labs

import kotlin.test.Test
import kotlin.test.assertEquals


fun fDouble(x: Int) = x + x

val lDouble: (Int) -> Int = { it + it }

fun fSquare(x:Int) = x * x

//val lSquare


//don't change the test
//Task: create a lambda function called lSquare
//lSquare is functionally equivalent to fSquare
//You are done when you have created lSquare and lSquareTest compiles and passes
class LambdaLab {

    @Test
    fun fDoubleTest() {
        val d1 = fDouble(10)
        val d2 = fDouble(20)

        assertEquals( expected =  20 ,actual = d1)
        assertEquals( expected =  40 ,actual = d2)
    }

    @Test
    fun lDoubleTest() {
        val d1 = lDouble(10)
        val d2 = lDouble(20)

        assertEquals( expected =  20 ,actual = d1)
        assertEquals( expected =  40 ,actual = d2)
    }

    @Test
    fun fSquareTest() {
        val s1 = fSquare(2)
        val s2 = fSquare(5)

        assertEquals( expected =  4 ,actual = s1)
        assertEquals( expected =  25 ,actual = s2)
    }

    @Test
    fun lSquareTest() {
        val s1 = lSquare(2)
        val s2 = lSquare(5)

        assertEquals( expected =  4 ,actual = s1)
        assertEquals( expected =  25 ,actual = s2)
    }
}