package _Labs

import kotlin.test.Test

fun slowCode() {
    println("slowCode - start")
    Thread.sleep(1000)
    println("slowCode - complete")
}

class LambdaProfile {

    @Test
    fun profileTheOldWay() {
        val t1 = System.currentTimeMillis()
        slowCode()
        val t2 = System.currentTimeMillis()
        println("Delta: " + (t2 - t1))
    }


    /**
     * Task: create a function called profile such that the test below compiles and runs
     *       and is functionally equivalent to  profileTheOldWay above
     */
    @Test
    fun profileWithLambdas() {
        profile{
            slowCode()
        }

    }

}