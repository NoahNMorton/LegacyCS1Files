package pack1;


public class ComputerPlayer extends Player {

    @SuppressWarnings("SameParameterValue")
    public ComputerPlayer(String name, int color) {
        super(name, color);
    }

    /**
     * @param game game currently being played
     * @return returns the randomly chosen move.
     */
    public int move(ConnectFourGame game) {

        int randomChoice;

        if (game.columnFull(0) && game.columnFull(1) && game.columnFull(2) && game.columnFull(3) && game.columnFull(5)) {
            System.err.println("Error: No available moves.");
            System.exit(-2);
        }
        while (true) {
            randomChoice = (int) (Math.random() * 7);

            if (!game.columnFull(randomChoice)) {
                break;
            }
        }
        return randomChoice;
    }

}
