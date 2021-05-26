package tmp

class Card(val value: Int, val suit: Int)

class Hand(val name: String, val cards: List<Card>, val isStay: Boolean)

class Deck(val card: List<Card>)

class Game(val deck: Deck, val ph: Hand, dh: Hand)

