package pack1;

import java.util.ArrayList;
import java.util.Scanner;

class MainFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Create a 52 card deck
        Deck deck = new Deck();
        // create an empty hand
        Hand hand = new Hand();
        ArrayList<PlayingCard> cardsMF = hand.getCardsH();

        ArrayList<PlayingCard> discard = new ArrayList<PlayingCard>();
        do {
            System.out.println("---Menu----");
            System.out.println("1. View Hand");
            System.out.println("2. Draw");
            System.out.println("3. Discard");
            System.out.println("4. Shuffle discarded cards into deck");
            System.out.println("0. Exit");
            System.out.println("Enter selection: ");
            int selection = keyboard.nextInt();

            if (selection == 1) {


                if (cardsMF.isEmpty()) {
                    System.out.println("The hand is empty.");

                } else {
                    System.out.println(cardsMF);
                }


            } else if (selection == 2) {
                // display the deck has no cards if the deck is empty
                // else display what card was drawn and add it to hand

                if (deck.isEmpty()) {
                    System.out.println("The deck is empty.");

                } else {


                    PlayingCard drawnCard = Deck.draw();
                    System.out.println(drawnCard);
                    Hand.addCard(drawnCard);

                }

            } else if (selection == 3) {


                if (cardsMF.isEmpty()) {
                    System.out.println("The hand is empty.");

                } else {

                    int cardsAmt = hand.getCardsH().size();

                    for (int p = 0; p < cardsAmt; p++) {
                        System.out.println(p + ":" + cardsMF.get(p).toString());
                    }
                    System.out.println("Please enter the index of the card you want to remove.");
                    int index = keyboard.nextInt();
                    hand.getCardsH().remove(index);

                }

            } else if (selection == 4) {


                Deck.addCards(discard);

                discard.clear();

            } else if (selection == 0) {
                System.exit(0);
            } else {
                System.err.println("Error: Invalid choice number.");
            }
        } while (true);
    }
}