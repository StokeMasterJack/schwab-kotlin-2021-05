package bjfp

import bjoo.Card

fun computeHandPoints(cards: List<Card>): Int = cards.sumOf { it.points }

fun computeHandCardCount(cards: List<Card>): Int = cards.size

fun computeHandIsBust(cards: List<Card>): Boolean {
    val p = computeHandPoints(cards)
    return p > 21
}

fun computeHandIsBlackjack(cards: List<Card>): Boolean {
    val p = computeHandPoints(cards)
    return p == 21
}

fun computeHandStatus(cards: List<Card>): String {
    val p = computeHandPoints(cards)
    return when (p) {
        in 0..20 -> "$p Points"
        21 -> "Blackjack!"
        else -> "Bust!"
    }
}