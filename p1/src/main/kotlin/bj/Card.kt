package bj


data class Card(val value: Int, val suit: Int) {

    fun computeSuitNameIfStatement(): String {
        if (suit == 1) return "Spades"
        else if (suit == 2) return "Hearts"
        else if (suit == 3) return "Clubs"
        else if (suit == 4) return "Diamonds"
        else throw IllegalStateException("Bad suit: $suit")
    }

    fun computeSuitNameIfExpression(): String {
        return if (suit == 1) "Spades"
        else if (suit == 2) "Hearts"
        else if (suit == 3) "Clubs"
        else if (suit == 4) "Diamonds"
        else throw IllegalStateException("Bad suit: $suit")
    }

    fun computeSuitNameWhenExpression(suit: Int) = when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException("Bad suit: $suit")
    }

}

fun computeSuitName1(suit: Int): String {
    return when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException("Bad suit: $suit")
    }
}

fun computeSuitName2(suit: Int) = when (suit) {
    1 -> "Spades"
    2 -> "Hearts"
    3 -> "Clubs"
    4 -> "Diamonds"
    else -> throw IllegalStateException("Bad suit: $suit")
}

