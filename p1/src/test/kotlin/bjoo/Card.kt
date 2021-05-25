package bjoo

/**
 * @param value 1 to 13 (1 = Ace and 13 = King)
 * @param suit 1 to 4 (1 = Spades and 4 = Diamonds)
 */
data class Card(val value: Int, val suit: Int) {

    init {
        require(suit in 1..4) { "Bad suit[$suit]. suit must in 1..4" }
        require(value in 1..13) { "Bad value[$value]. value must in 1..13" }
    }


    val suitName: String
        get() = when (suit) {
            1 -> "Spades"
            2 -> "Hearts"
            3 -> "Clubs"
            4 -> "Diamonds"
            else -> throw IllegalStateException("Bad suit: $suit")
        }

    val valueName: String
        get() = when (value) {
            1 -> "Ace"
            in 2..10 -> value.toString()
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> throw IllegalStateException("Bad value: $value")
        }


    val points: Int
        get() = when (value) {
            in 1..9 -> value
            in 10..13 -> 10
            else -> throw IllegalStateException("Bad value: $value")

        }

    val name: String get() = "$valueName of $suitName"

    override fun toString() = name
}