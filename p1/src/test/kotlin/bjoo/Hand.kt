package bjoo

class Hand(val name: String) {

    var isStay  = false

    val cardCount get() = 0

    val points get() = 0

    val isBust get() = points > 21

    val isBlackjack get() = points == 21

    val status:String get() = "$points Points"


}