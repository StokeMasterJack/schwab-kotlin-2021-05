package bjfp

fun computePoints(value: Int): Int {
    require(value in 1..13) { "Bad value[$value]. value must in 1..13" }

    return when (value) {
        in 1..9 -> value
        in 10..13 -> 10
        else -> throw IllegalStateException("Bad value: $value")
    }
}

fun computeSuitName(suit: Int): String {
    require(suit in 1..4) { "Bad suit[$suit]. suit must in 1..4" }
    return when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException("Bad suit: $suit")
    }
}

fun computeValueName(value: Int): String {
    require(value in 1..13) { "Bad value[$value]. value must in 1..13" }
    return when (value) {
        1 -> "Ace"
        in 2..10 -> value.toString()
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
        else -> throw IllegalStateException("Bad value: $value")
    }
}

fun computeCardName(value: Int, suit: Int): String {
    require(value in 1..13) { "Bad value[$value]. value must in 1..13" }
    require(suit in 1..4) { "Bad suit[$suit]. suit must in 1..4" }
    val valueName = computeValueName(value)
    val suitName = computeSuitName(suit)
    return "$valueName of $suitName"
}


