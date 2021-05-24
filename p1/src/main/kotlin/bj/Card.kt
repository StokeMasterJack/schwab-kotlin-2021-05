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

    fun f1() {


        val xxx = if (suit == 1) "Spades"
        else if (suit == 2) "Hearts"
        else if (suit == 3) "Clubs"
        else if (suit == 4) "Diamonds"
        else "Error"
    }

    fun f2(): String = if (suit == 1) "Spades"
    else if (suit == 2) "Hearts"
    else if (suit == 3) "Clubs"
    else if (suit == 4) "Diamonds"
    else "Error"


}


