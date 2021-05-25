package aExamplets

import kotlin.math.roundToInt

// Simple When (used like switch)
fun computeSuit(suit: Int) = when (suit) {
    1 -> "Spades"
    2 -> "Hearts"
    3 -> "Clubs"
    4 -> "Diamonds"
    else -> throw IllegalStateException("Bad suit: $suit")
}



// When with IntRange
fun computeValueName(value: Int): String = when (value) {
    1 -> "Ace"
    in 2..10 -> value.toString()
    11 -> "Jack"
    12 -> "Queen"
    13 -> "King"
    else -> throw IllegalStateException("Bad value: $value")
}


abstract class Shape
class Rect(val width: Int, val length: Int) : Shape()
class Circle(val radius: Int) : Shape()

// When with is (type check)
fun computeArea(s: Shape) = when (s) {
    is Rect -> s.width * s.length
    is Circle -> (Math.PI * s.radius * s.radius).roundToInt()
    else -> throw IllegalStateException("Bad shape: $s")
}

