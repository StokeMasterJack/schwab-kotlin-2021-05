package _Labs

import kotlin.test.Test

/*
don't change the test

Task:
    create a function called do3Times
    create that function above class LambdaLab2PassingLambdas where it says   //your code goes here
    You are done when you have created  the testDo3Times function and compiles and generate the Expected output

    Note: no lists required

*/


//your code goes here
fun do3Times(l: () -> Unit) {
    l()
    l()
    l()
}

/**
 * @param n  how many times to run the function (aka lambda)
 * @param l the function you want to run n times
 */
fun doNTimes(n: Int, l: (index:Int) -> Unit) {
    var i = 1
    while (i <= n) {
        l(i)
        i++
    }
}


class LambdaLab2PassingLambdas {


    @Test
    fun testDemo() {

        fun foo(a: () -> Unit) {
            a()
        }

        val l1 = { println("lambda 1") }
        val l2 = { println("lambda 2") }


        foo(a = l1)
        foo(a = l2)


        foo({ println("inline") })


        foo {
            println("inline")
            println("inline")
            println("inline")
            println("inline")
        }
    }


    @Test
    fun testDo3Times() {


        do3Times {
            println("Hello")
        }


        /*
        Expected output:
            Hello
            Hello
            Hello
         */


    }

    @Test
    fun testDoNTimes() {

        doNTimes(5) {
            println("Hello  $it")
        }



        /*
        Expected output:
            Hello 0
            Hello 1
            Hello 2
            Hello 3
            Hello 4
         */


    }

}

