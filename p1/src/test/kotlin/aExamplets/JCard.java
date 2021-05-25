package aExamplets;

public class JCard {

    private int value;
    private int suit;

    JCard(int value, int suit) {
        if(suit > 4) throw new IllegalStateException("Bad suit: $suit");
        if(value > 13) throw new IllegalStateException("Bad value: value");
        this.value = value;
        this.suit = suit;
        System.err.println("value[" + value + "]");
        System.err.println("suit[" + suit + "]");
    }


    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitName() {
        switch (suit) {
            case 1:
                return "Spades";
            case 2:
                return "Spades";
            case 3:
                return "Spades";
            case 4:
                return "Diamonds";
            default:
                throw new IllegalStateException("Bad suit: " + suit);
        }


    }
}
