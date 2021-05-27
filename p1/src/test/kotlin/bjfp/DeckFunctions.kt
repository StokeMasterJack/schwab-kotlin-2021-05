package bjfp

import bjoo.Card

fun generateInitialCards(shuffle: Boolean = true): List<Card> {
    val a: MutableList<Card> = mutableListOf()

    (1..4).forEach { s ->
        (1..13).forEach { v ->
            val c = Card(value = v, suit = s)
            a.add(c)
        }
    }
    return if (shuffle) a.shuffled() else a
}

fun renderDeck(cards: List<Card>) {
    cards.forEach {
        println(it)
    }
}