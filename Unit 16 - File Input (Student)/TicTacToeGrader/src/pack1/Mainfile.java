package pack1;


import java.io.File;
import java.util.Scanner;

public class Mainfile {

    public static void main(String[] args) throws Exception {

        Scanner inF = new Scanner(new File("input.txt"));
        String a = "";

        for (int i = 0; i < 5; i++) {
            char[][] board = new char[3][3];

            for (int y = 0; y < 3; y++) {
                if (inF.hasNextLine())
                    a = inF.nextLine();
                for (int x = 0; x < 3; x++) {
                    board[y][x] = a.charAt(x);
                }
            }
            if (inF.hasNextLine())
                inF.nextLine();

            System.out.println(gameState(board));
        }

    }

    /**
     * Pre: Receives a tic tac toe board
     *
     * @param board the board read in from the file
     * @return Returns one of the following Strings based on the values in board: “X WINS”, “O WINS”, “TIE”, “PLAYING”
     */
    public static String gameState(char[][] board) {
        //todo checks
        //check X
        if (check(board, 'x')) {
            return "X WINS";
        } else if (check(board, 'o')) {
            return "O WINS";
        } else if (isTie(board))
            return "TIE";
        else
            return "PLAYING";


    }

    /**
     * Method called from Mainfile.gameState to check the received game.
     *
     * @param board  the board read in from the file
     * @param letter the letter provided to check for
     * @return true or false based on the game.
     */
    public static boolean check(char[][] board, char letter) {
        if ((board[0][0] == letter) && (board[0][1] == letter) && (board[0][2] == letter)) {
            return true;
        }
        if ((board[1][0] == letter) && (board[1][1] == letter) && (board[1][2] == letter)) {
            return true;
        }
        if ((board[2][0] == letter) && (board[2][1] == letter) && (board[2][2] == letter)) {
            return true;
        }
        if ((board[0][1] == letter) && (board[1][1] == letter) && (board[2][1] == letter)) {
            return true;
        }
        if ((board[0][0] == letter) && (board[1][0] == letter) && (board[2][0] == letter)) {
            return true;
        }
        if ((board[0][2] == letter) && (board[1][2] == letter) && (board[2][2] == letter)) {
            return true;
        }
        if ((board[0][0] == letter) && (board[1][1] == letter) && (board[2][2] == letter)) {
            return true;
        }
        return (board[0][2] == letter) && (board[1][1] == letter) && (board[2][0] == letter);

    }

    /**
     * Called from gameState, to check if the game is a file.
     *
     * @param board the board read in from the file
     * @return whether or not the game is a tie, or CAT.
     */
    public static boolean isTie(char[][] board) {
        return (board[0][0] != '_') && (board[0][1] != '_') && (board[0][2] != '_') && (board[1][0] != '_') &&
                (board[1][1] != '_') && (board[1][2] != '_') && (board[2][0] != '_') && (board[2][1] != '_') &&
                (board[2][2] != '_');
    }


}
