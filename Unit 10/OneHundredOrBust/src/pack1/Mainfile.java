package pack1;

import java.util.Scanner;

public class Mainfile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many players? 2-5");
        int playersAmt = input.nextInt();
        if (playersAmt < 2) playersAmt = 2; //set upwards if below threshold.
        if (playersAmt > 5) playersAmt = 5; //set downwards if above threshold.

        String[] playerNames = new String[playersAmt];
        int[] playerScores = new int[playersAmt];

        for (int e = 0; e < playersAmt; e++) { //receive all players' names.
            System.out.println("Please enter the name for player " + e);
            playerNames[e] = input.next();
        }
        shuffle(playerNames);

        while (true) {
            for (int i = 0; i < playersAmt; i++) { //turn incrementer
                int totalPoints = 0; //points to be added to the player at end of turn.
                boolean turnSuccess = false;
                while (!turnSuccess) {
                    String currentPlayer = playerNames[i];
                    System.out.println("Total points accumulated: " + totalPoints);
                    System.out.println("Player " + currentPlayer + ", Would you like to roll(0), or stop(1)?");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 0: //roll die, and add points to player score.
                            int die1 = rollDie(), die2 = rollDie();
                            if (die1 == die2) {
                                System.out.println("Doubles was rolled by player " + currentPlayer);
                                totalPoints = 0; //if doubles rolled, player gets no points for that turn.
                                turnSuccess = true; //set turnSuccess so turn may exit.
                            } else {
                                totalPoints += (die1 + die2); //add won points to final points to be obtained.
                                continue; //continue the current turn, to continue gambling
                            }
                            break;
                        case 1: //exit and keep points.
                            playerScores[i] += totalPoints;
                            System.out.println("Total points accumulated at the end of turn: " + totalPoints);
                            turnSuccess = true;
                            break;
                        case 3: //secret cheat to view scores of current player
                            System.out.println("Player " + currentPlayer + " has a score of " + playerScores[i]);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a 0 or 1.");
                            break;
                    }
                }
                if (findWinner(playerNames, playerScores) != null) {
                    System.out.println("Player " + findWinner(playerNames, playerScores) + " has won. Congrats!");
                    System.out.println("Everyone's scores are as follows. ");
                    finalResults(playerNames, playerScores);
                    System.exit(0);
                }

            }

        }

    }

    /**
     * Rolls an imaginary die to get a random # between 1-6
     *
     * @return int between 1-6
     */
    public static int rollDie() {
        return (int) ((Math.random() * 6) + 1);
    }

    /**
     * A method to find the winner of the game.
     *
     * @param names  array of strings that holds player names
     * @param scores scores of the players. data is linked, i.e. player 0 is scores[0], etc.
     * @return name of the winner, or null if nobody is over 100 points.
     */
    public static String findWinner(String[] names, int[] scores) {
        for (int p = 0; p < scores.length; p++) {
            if (scores[p] >= 100) {
                return names[p];
            }
        }
        return null;
    }

    /**
     * Print out everyone's names and scores.
     *
     * @param names  array of names.
     * @param scores array of the players' scores.
     */
    public static void finalResults(String[] names, int[] scores) {
        for (int l = 0; l < names.length; l++) {
            System.out.print(names[l] + ", " + scores[l] + "\n");
        }
    }

    /**
     * Method to shuffle the provided array.
     *
     * @param array array to shuffle.
     */
    public static void shuffle(String[] array) {
        String[] temp1 = new String[1];
        String[] temp2 = new String[1];
        for (int y = 0; y < 10; y++) {
            int random1 = (int) (Math.random() * array.length);
            int random2 = (int) (Math.random() * array.length);
            temp1[0] = array[random1];
            temp2[0] = array[random2];
            array[random1] = temp1[0];
            array[random2] = temp2[0];
        }
    }


}
