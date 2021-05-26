package _Labs

import java.sql.Connection
import javax.sql.DataSource
import kotlin.test.Test


fun f1() {
    //open db connection
    //start tx

    //custom


    //commit tx
    //close db connection
}

fun slowCode() {
    println("slowCode - start")
    Thread.sleep(1000)
    println("slowCode - complete")
}

fun profile(l: () -> Unit) {
    val t1 = System.currentTimeMillis()
    l()
    val t2 = System.currentTimeMillis()
    println("Delta: " + (t2 - t1))
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
        profile {
            slowCode()
        }
    }

}

