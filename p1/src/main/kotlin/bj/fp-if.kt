// value: int between 1 and 13
//1: Ace
//2: 2
//10: 10
//11: J
//12: Q
//13: K

fun isAceIfStatement(value: Int): Boolean {

    if (value == 1) {
        return true
    } else {
        return false
    }


}


fun isAceIfExpr1(value: Int): Boolean {

    return if (value == 1) {
        true
    } else {
        false
    }

}

fun isAceIfExpr2(value: Int) = if (value == 1) true else false

//fun isAceIfExpr3(value: Int) = value == 1


fun sum1(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y


fun drinkingAge1(state: String): Int {
    val da = if (state == "WS") 14 else 21
    return da
}

