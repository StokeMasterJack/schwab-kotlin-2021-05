package aExamplets

import org.junit.Test

class ExprTest {

    fun fullName(firstName: String, middle: String, lastName: String): String {
        return "$firstName $middle $lastName"
    }

    @Test
    fun test() {

        val alcoholLevel: Double = 1.5
        val state: String = "WS"


        val x1: String = "dave"
        val x2: String = "dave" + " " + "Ford"
        val x3: String = x1
        val x4: String = x1 + x1
        val x5: String = fullName("Dave", "J", "Ford")
        val x6: String = if (alcoholLevel > 1.0) "Drunk" else "Sober"

        val x7: Any = when (state) {
            "WS" -> 14
            "MA" -> 16.0
            "FL" -> "fff"
            else -> 21
        }

        print4("dave")
        print4("dave" + " " + "Ford")
        print4(x1)

        print4("dd")





        print4("dd")

        print4(x5)


    }


    fun print4(s: String) {
        println(s)
        println(s)
        println(s)
        println(s)
    }
}