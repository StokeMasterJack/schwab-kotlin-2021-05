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


    fun testDo3Times(){

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

}

