package aExamplets

// value: int between 1 and 13
//1: Ace
//2: 2
//....
//13: K



//if-statement
fun isAce1(value: Int): Boolean {
    if (value == 1) {
        return true
    } else {
        return false
    }


}

//if-expr
fun isAce2(value: Int): Boolean {
    return if (value == 1) {
        true
    } else {
        false
    }

}

//function whose body is nothing more than: return some-expr
//can be shortened
//if-expr with
fun isAce3(value: Int) = if (value == 1) true else false

fun boozyState(alcoholLevel: Int): String = if (alcoholLevel > 1.0) "Drunk" else "Sober"



fun drinkingAge(state: String): Int = if (state == "WS") 14 else 21

fun sum1(x: Int, y: Int): Int {
    if(y < 1) throw IllegalArgumentException("Bad y")
    return x + y
}

fun sum2(x: Int, y: Int) = x + y


fun drinkingAge1(state: String): Int {
    val da = if (state == "WS") 14 else 21
    return da
}

