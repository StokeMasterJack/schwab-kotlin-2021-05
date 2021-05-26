package aExamplets

data class Card1(val value: Int, val suit: Int) {
    val points: Int
        get() = when (value) {
            in 1..9 -> value
            in 10..13 -> 10
            else -> throw IllegalStateException("Bad value: $value")

        }
}

fun main() {
//    listDemo1()
//    listTotal1()
//    listTotal2()
    listTotal3()
}

fun listDemo1() {
    val numbers = listOf(1, 7, 9, 43)
    println(numbers)
}

fun listTotal1() {
    val numbers = listOf(1, 7, 9, 43)
    var total = 0
    for (num in numbers) {
        total += num
    }
    println(numbers)
    println("total = $total")
}

fun listTotal2() {
    val numbers: List<Int> = listOf(1, 7, 9, 43)
    val total = numbers.sum()
    println(numbers)
    println("total = $total")
}

fun listTotal3() {
    val c0 = Card1(1, 1)
    val c1 = Card1(13, 4)

    val cards: List<Card1> = listOf(c0, c1)


    val pointTotal: Int = cards.sumOf { it.points }

    println(cards)
    println("pointTotal = $pointTotal")
}

//Function
fun selector1(card: Card1): Int {
    return card.points
}

//Function
fun selector2(card: Card1): Int = card.points

//Lambda Function
val selector3 = { card: Card1 -> card.points }
