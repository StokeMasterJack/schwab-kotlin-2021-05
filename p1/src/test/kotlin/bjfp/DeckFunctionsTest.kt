package bjfp

import bjoo.Card
import kotlin.test.Test
import kotlin.test.assertEquals

/*

Prefer Pure Functions
- Random
- Today's date

fun geOrder(today:Date = Date.now())

 */
class DeckFunctionsTest {

    @Test
    fun test_generateInitialCards() {
        val cards: List<Card> = generateInitialCards(shuffle = false)
        assertEquals(expected = 52, actual = cards.size)

        assertEquals(Card(1, 1), cards.first())
        assertEquals(Card(13, 4), cards.last())

        val set: Set<Card> = cards.toSet()
        assertEquals(52, set.size)

        renderDeck(cards)
    }



}
