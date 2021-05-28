package cs.blackjack

data class Game(
    val deck: Deck = Deck(shuffle = false),
    val ph: Hand = Hand("Player"),
    val dh: Hand = Hand("Dealer")
) : Any() {

    /**
     * Clears both hands,
     * takes 4 cards from the deck
     * adds 2 cards to player
     * adds 2 cards to dealer
     */
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

//        val ph2: Hand = ph.addCards(aPh)
//        val dh2: Hand = dh.addCards(aDh)

        val ph2: Hand = Hand(name = ph.name, cards = aPh)
        val dh2: Hand = Hand(name = dh.name, cards = aDh)

        return Game(deck2, ph = ph2, dh = dh2)

    }


    fun hit(): Game {
//        check(!isGameOver) { "Can't call hit when game is over" }

        val (a: List<Card>, deck2: Deck) = deck.take(1)
        val ph2: Hand = ph.addCards(a)
        return this.copy(deck = deck2, ph = ph2)
    }

    // in UI:  <Button name="Hit" enabled={!g.isGameOver}
    val isGameOver: Boolean get() = ph.points >= 21 || dh.points >= 21 || (ph.isStay && dh.points >= 17)

    val isGameActive: Boolean get() = !isGameOver


    /*
    add cards, 1 at a time, to dealer hand, until dh.points > 17
     */
    fun stay(): Game {
        return this
    }


}