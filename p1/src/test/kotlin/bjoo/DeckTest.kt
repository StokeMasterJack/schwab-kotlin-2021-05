package bjoo

import org.junit.Test
import kotlin.test.assertEquals

class DeckTest {


    /*
     task: create Deck class such that test_generateNewDeck compiles, runs and passes
   */
    @Test
    fun test_DeckConstructor() {

        val d = Deck(shuffle = false)

        assertEquals(expected = 52, actual = d.size)

        assertEquals(Card(1, 1), d.first)
        assertEquals(Card(13, 4), d.last)

        val set: Set<Card> = d.cards.toSet()
        assertEquals(52, set.size)
    }



}