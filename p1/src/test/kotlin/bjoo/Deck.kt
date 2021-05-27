package bjoo

import bjfp.generateInitialCards

class Deck(val shuffle: Boolean = true, val cards: List<Card> = generateInitialCards(shuffle)) {

    val size: Int get() = cards.size

    val first: Card get() = cards.first()

    val last: Card get() = cards.last()


}