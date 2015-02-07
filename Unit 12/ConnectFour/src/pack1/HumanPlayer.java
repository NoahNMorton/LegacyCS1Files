package pack1;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private final Scanner input = new Scanner(System.in);

    public HumanPlayer(String name, int color) {

        super(name, color);

    }

    /**
     * @param game game currently being played
     * @return player's choice
     */
    public int move(ConnectFourGame game) {

        if (game.columnFull(0) && game.columnFull(1) && game.columnFull(2) && game.columnFull(3) && game.columnFull(5)) {
            System.err.println("Error: No available moves.");
            System.exit(2);
        }

        while (true) {
            System.out.println("Please enter a column.");
            int column = input.nextInt();

            if (!game.columnFull(column)) {
                return column;

            }
        }


    }

}
