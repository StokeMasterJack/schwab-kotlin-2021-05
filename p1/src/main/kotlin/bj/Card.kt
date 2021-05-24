package bj


data class Card(val value: Int, val suit: Int) {

    fun computeSuitName(): String{
        if (suit == 1) return "Spades"
        else if (suit == 2) return "Hearts"
        else if (suit == 3) return "Clubs"
        else if (suit == 4) return "Diamonds"
        else throw IllegalStateException("Bad suit: $suit")
    }


}


