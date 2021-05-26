package aExamplets

//val l1: (a: Int) -> Unit = { a: Int ->
//    println(a)
//    println(a)
//    println(a)
//}

fun useL(ll: (a: Int) -> Unit) {

    ll(3)


}

fun main() {


    useL { a: Int ->
        println(a)
        println(a)
        println(a)
    }


    useL {
        println(it)
        println(it)
        println(it)
    }
}