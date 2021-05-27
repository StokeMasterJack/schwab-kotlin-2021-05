package bjoo

data class Hand(val name: String = "Player", val cards: List<Card> = emptyList(), val isStay: Boolean = false) {

    fun addCards(a: List<Card>): Hand = copy(cards = this.cards + a)



    val size: Int get() = cards.size

    /**
     * The points for a Hand is simply the sum of the points for the cards
     */
    val points: Int get() = cards.sumOf { it.points }

    val isBust: Boolean get() = points > 21

    val isBlackjack: Boolean get() = points == 21

    val status: String
        get() = when (points) {
            in 0..20 -> "$points Points"
            21 -> "Blackjack!"
            else -> "Bust!"
        }

}