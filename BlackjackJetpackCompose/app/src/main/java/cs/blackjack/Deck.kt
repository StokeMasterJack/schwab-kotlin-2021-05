package cs.blackjack

data class Deck(val shuffle: Boolean = true, val cards: List<Card> = generateInitialCards(shuffle)) {

    val size: Int get() = cards.size

    val first: Card get() = cards.first()

    val last: Card get() = cards.last()


    fun take(n: Int): Pair<List<Card>, Deck> {

        val aa = if (size < 20) {
            generateInitialCards(shuffle)
        } else {
            this.cards
        }


        val a: List<Card> = aa.take(n)
        check(a.size == n)

        val b: List<Card> = aa.drop(n)
        check(b.size == size - n)

        val deck2 = this.copy(cards = b)

        return Pair(a, deck2)

    }

}

private fun generateInitialCards(shuffle: Boolean = true): List<Card> {
    val a: MutableList<Card> = mutableListOf()

    (1..4).forEach { s ->
        (1..13).forEach { v ->
            val c = Card(value = v, suit = s)
            a.add(c)
        }
    }
    return if (shuffle) a.shuffled() else a
}