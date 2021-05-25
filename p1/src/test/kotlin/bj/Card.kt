package bj

/**
 * @param value 1 to 13 (1 = Ace and 13 = King)
 * @param suit 1 to 4 (1 = Spades and 4 = Diamonds)
 */
data class Card(val value: Int, var suit: Int) {

    init {
        require(suit in 1..4) { "Bad suit[$suit]. suit must in 1..4"  }
        require(value in 1..13) {  "Bad value[$value]. value must in 1..13"  }
    }

//    init {
//        if (suit !in 1..4) throw IllegalArgumentException("Bad suit[$suit]. suit must in 1..4")
//        if (value !in 1..13) throw IllegalArgumentException("Bad value[$value]. value must in 1..13")
//    }

    val suitName: String
        get() = when (suit) {
            1 -> "Spades"
            2 -> "Hearts"
            3 -> "Clubs"
            4 -> "Diamonds"
            else -> throw IllegalStateException("Bad suit: $suit")
        }


}