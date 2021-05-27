package bjoo


import kotlin.test.Test
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

    @Test
    fun testTake1() {
        val deck1 = Deck(shuffle = false)
        assertEquals(expected = 52, actual = deck1.size)


        val p: Pair<List<Card>, Deck> = deck1.take(4)

        val a: List<Card> = p.first
        val deck2: Deck = p.second

        assertEquals(expected = 48, actual = deck2.size)
        assertEquals(expected = 4, actual = a.size)


    }


    //destructuring
    @Test
    fun testTake2() {
        val deck1 = Deck(shuffle = false)
        assertEquals(expected = 52, actual = deck1.size)

        val (a: List<Card>, deck2: Deck) = deck1.take(4)

        assertEquals(expected = 48, actual = deck2.size)
        assertEquals(expected = 4, actual = a.size)


    }


}