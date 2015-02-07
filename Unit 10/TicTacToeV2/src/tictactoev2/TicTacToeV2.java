package tictactoev2;


import java.util.Scanner;

public class TicTacToeV2 {
    public static void main(String[] args) {
        char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

        Scanner x1S = new Scanner(System.in);
        Scanner y1S = new Scanner(System.in);

        boolean exit = false;
        char letter;
        boolean Cat;
        do {
            System.out.println("The user is X.");
            System.out.println("Please enter the row of your choice.");
            int x = x1S.nextInt();
            System.out.println("Please enter the column of your choice.");
            int y = y1S.nextInt();
            if (board[x][y] == '_') {
                board[x][y] = 88;
            } else {
                System.out.println("Invalid. Place taken.");
            }
            letter = 'X';

            if (isWinner(board, letter)) {
                System.out.println("User 1 Wins");
                System.exit(0);
            }


            display(board);


            System.out.println("The second user is O.");
            System.out.println("Please enter the row of your choice.");
            int x2 = x1S.nextInt();
            System.out.println("Please enter the column of your choice.");
            int y2 = y1S.nextInt();
            if (board[x2][y2] == '_') {
                board[x2][y2] = 79;
            } else {
                System.out.println("Invalid. Place taken.");
            }
            display(board);
            letter = 'O';
            if (isWinner(board, letter)) {
                System.out.println("User 2 Wins");
                System.exit(0);
            }


            if (isCat(board)) {
                System.exit(0);
            }

        } while (true);



    }

    private static boolean isWinner(char[][] board, char letter) {
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

    private static void display(char[][] board) {
        for (char[] blank : board) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(blank[c] + " ");
            }
            System.out.print("\n");
        }
    }

    private static boolean isCat(char[][] board) {
        return (board[0][0] != '_') && (board[0][1] != '_') && (board[0][2] != '_') && (board[1][0] != '_') && (board[1][1] != '_') && (board[1][2] != '_') && (board[2][0] != '_') && (board[2][1] != '_') && (board[2][2] != '_');


    }
}
