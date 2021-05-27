package bjState

class Card(val value: Int, val suit: Int)

class Deck(val cards: List<Card>,val shuffle: Boolean = false)

class Hand(val name: String, val cards: List<Card>, val isStay: Boolean)

class Game(val d: Deck, val ph: Hand, val dh: Hand)