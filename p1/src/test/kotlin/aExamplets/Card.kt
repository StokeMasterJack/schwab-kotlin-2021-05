package aExamplets


data class Card(val value: Int, var suit: Int) {

    init {
        if (suit !in 1..4) throw IllegalArgumentException("Bad suit[$suit]. suit must in 1..4")
        if (value !in 1..13) throw IllegalArgumentException("Bad value[$value]. value must in 1..13")
    }

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

    fun computeSuitName() = when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException("Bad suit: $suit")
    }

    //uses about no memory
    //uses cpu every time it's called
    //this is less buggy
    val suitName1: String
        get() = when (suit) {
            1 -> "Spades"
            2 -> "Hearts"
            3 -> "Clubs"
            4 -> "Diamonds"
            else -> throw IllegalStateException("Bad suit: $suit")
        }


    //uses about 5 chars memory
    //only uses cpu once, when it is first assign it
    //this is more (maybe) buggy
    val suitName2: String = when (suit) {
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

