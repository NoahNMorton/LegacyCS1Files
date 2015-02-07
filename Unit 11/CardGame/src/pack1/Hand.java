package pack1;

import java.util.ArrayList;


class Hand {


    // Attributes

    private static ArrayList<PlayingCard> cardsH;


    // Constructor

    public Hand() {
        cardsH = new ArrayList<PlayingCard>();
    }

    // Accessors
    // write an accessor for cardsH
    public ArrayList<PlayingCard> getCardsH() {
        return cardsH;
    }


    // Other Methods

    // addCard

    public static void addCard(PlayingCard card) {
        cardsH.add(card);
    }


    // removeCard

    private static boolean removeCard(PlayingCard card) {
        return cardsH.remove(card);

    }


}