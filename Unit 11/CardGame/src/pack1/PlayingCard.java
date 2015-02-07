package pack1;


class PlayingCard {


    // Attributes
    //-suit  (char) can hold these values (S, D, H, C)
    private char suit;
    //-value (String) can hold these values(2,3,4,5,6,7,8,9,10,J,Q,K,A)
    private String value;

    // Constructor

    public PlayingCard(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    // Accessors


    char getSuit() {
        return suit;
    }

    String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        PlayingCard pc = (PlayingCard) o;

        return this.getSuit() == pc.getSuit() && this.getValue().equals(pc.getValue());
    }

    @Override
    public String toString() {


        if (suit == 'D') {
            return value + " of Diamonds.";
        } else if (suit == 'C') {
            return value + " of Clubs.";
        } else if (suit == 'H') {
            return value + " of Hearts.";
        } else if (suit == 'S') {
            return value + " of Spades.";
        }

        return null;
    }
}