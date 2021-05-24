package bjj;

public class JCard {

    private int value;
    private int suit;

    JCard(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }


    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

}
