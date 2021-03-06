package bjoo

data class Game(
    val deck: Deck = Deck(shuffle = false),
    val ph: Hand = Hand("Player"),
    val dh: Hand = Hand("Dealer")
):Any() {

    fun deal(): Game {
//        check(isGameOver) { "Can't call deal when game is active" }

        // deck.take must return 2 things:
        // the 4 cards
        // modified deck (48)

        val (a: List<Card>, deck2: Deck) = deck.take(4)

        check(a.size == 4)
        check(deck2.size == deck.size - 4)

        val aPh: List<Card> = a.subList(0, 2)
        val aDh: List<Card> = a.subList(2, 4)


        check(aPh.size == 2)
        check(aDh.size == 2)

        val ph2: Hand = ph.addCards(aPh)
        val dh2: Hand = dh.addCards(aDh)

        return Game(deck2, ph = ph2, dh = dh2)

    }



    fun hit(): Game {
//        check(!isGameOver) { "Can't call hit when game is over" }

        val (a: List<Card>, deck2: Deck) = deck.take(1)
        val ph2: Hand = ph.addCards(a)
        return this.copy(deck = deck2, ph = ph2)
    }

    // in UI:  <Button name="Hit" enabled={!g.isGameOver}
    val isGameOver:Boolean get() = false

    val isGameActive:Boolean get() = !isGameOver


    /*
    add cards, 1 at a time, to dealer hand, until dh.points > 17
     */
    fun stay(): Game {
        return this
    }


}