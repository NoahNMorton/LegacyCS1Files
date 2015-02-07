package pack1;


import java.util.ArrayList;

class Deck {

    // Attributes
    //-cardsD (ArrayList of PlayingCards)
    @SuppressWarnings("CanBeFinal")
    private static ArrayList<PlayingCard> cardsD = new ArrayList<PlayingCard>();

    // Constructor

    public Deck() {
        cardsD.add(new PlayingCard('S', "Ace"));
        cardsD.add(new PlayingCard('S', "2"));
        cardsD.add(new PlayingCard('S', "3"));
        cardsD.add(new PlayingCard('S', "4"));
        cardsD.add(new PlayingCard('S', "5"));
        cardsD.add(new PlayingCard('S', "6"));
        cardsD.add(new PlayingCard('S', "7"));
        cardsD.add(new PlayingCard('S', "8"));
        cardsD.add(new PlayingCard('S', "9"));
        cardsD.add(new PlayingCard('S', "10"));
        cardsD.add(new PlayingCard('S', "Jack"));
        cardsD.add(new PlayingCard('S', "Queen"));
        cardsD.add(new PlayingCard('S', "King"));

        cardsD.add(new PlayingCard('H', "Ace"));
        cardsD.add(new PlayingCard('H', "2"));
        cardsD.add(new PlayingCard('H', "3"));
        cardsD.add(new PlayingCard('H', "4"));
        cardsD.add(new PlayingCard('H', "5"));
        cardsD.add(new PlayingCard('H', "6"));
        cardsD.add(new PlayingCard('H', "7"));
        cardsD.add(new PlayingCard('H', "8"));
        cardsD.add(new PlayingCard('H', "9"));
        cardsD.add(new PlayingCard('H', "10"));
        cardsD.add(new PlayingCard('H', "Jack"));
        cardsD.add(new PlayingCard('H', "Queen"));
        cardsD.add(new PlayingCard('H', "King"));

        cardsD.add(new PlayingCard('D', "Ace"));
        cardsD.add(new PlayingCard('D', "2"));
        cardsD.add(new PlayingCard('D', "3"));
        cardsD.add(new PlayingCard('D', "4"));
        cardsD.add(new PlayingCard('D', "5"));
        cardsD.add(new PlayingCard('D', "6"));
        cardsD.add(new PlayingCard('D', "7"));
        cardsD.add(new PlayingCard('D', "8"));
        cardsD.add(new PlayingCard('D', "9"));
        cardsD.add(new PlayingCard('D', "10"));
        cardsD.add(new PlayingCard('D', "Jack"));
        cardsD.add(new PlayingCard('D', "Queen"));
        cardsD.add(new PlayingCard('D', "King"));

        cardsD.add(new PlayingCard('C', "Ace"));
        cardsD.add(new PlayingCard('C', "2"));
        cardsD.add(new PlayingCard('C', "3"));
        cardsD.add(new PlayingCard('C', "4"));
        cardsD.add(new PlayingCard('C', "5"));
        cardsD.add(new PlayingCard('C', "6"));
        cardsD.add(new PlayingCard('C', "7"));
        cardsD.add(new PlayingCard('C', "8"));
        cardsD.add(new PlayingCard('C', "9"));
        cardsD.add(new PlayingCard('C', "10"));
        cardsD.add(new PlayingCard('C', "Jack"));
        cardsD.add(new PlayingCard('C', "Queen"));
        cardsD.add(new PlayingCard('C', "King"));
    }

    // Other Methods

    // isEmpty

    public static boolean isEmpty() {
        return cardsD.isEmpty();

    }


    // returns a card from the deck that has been randomly selected, null if the deck is empty
    public static PlayingCard draw() {
        if (cardsD.isEmpty()) {
            return null;
        }
        //System.out.println("The deck has "+cardsD.size());
        int card = (int) (Math.random() * cardsD.size());
        //System.out.println("Drawing from spot "+card);

        return cardsD.remove(card);


    }


    // receives a card and adds it to cardsD
    private static void addCard(PlayingCard card) {
        cardsD.add(card);
    }


    // receives an ArrayList of Cards and adds them to the instances card list
    public static void addCards(ArrayList<PlayingCard> cards2) {
        for (PlayingCard aCards2 : cards2) {
            cardsD.add(aCards2);
        }

    }


}