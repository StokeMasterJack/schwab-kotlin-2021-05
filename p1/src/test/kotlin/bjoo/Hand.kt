package bjoo

class Hand(val name: String) {

    var isStay: Boolean = false

    val cardCount: Int get() = 0

    /**
     * The points for a Hand is simply the sum of the points for the cards
     */
    val points: Int get() = 21

    val isBust: Boolean get() = points > 21

    val isBlackjack: Boolean get() = points == 21

    val status: String get() = "$points Points"

//    fun isBlackjack2(): Boolean {
//        return points == 21
//    }

}