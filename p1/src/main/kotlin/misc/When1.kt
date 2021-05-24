package misc

import kotlin.math.roundToInt

/*
when is also an expression
 */
fun computeSuit(suit: Int) = when (suit) {
    1 -> "Spades"
    2 -> "Hearts"
    3 -> "Clubs"
    4 -> "Diamonds"
    else -> throw IllegalStateException("Bad suit: $suit")
}



abstract class Shape

class Rect(val width: Int, val length: Int) : Shape()
class Circle(val radius: Int) : Shape()

fun computeArea(s: Shape) = when (s) {
    is Rect -> s.width * s.length
    is Circle -> (Math.PI * s.radius * s.radius).roundToInt()
    else -> throw IllegalStateException("Bad shape: $s")
}

