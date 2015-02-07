package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {{'_', '_', '_'},
                		  {'_', '_', '_'},
                		  {'_', '_', '_'}};

        Scanner x1S = new Scanner(System.in);
        Scanner y1S = new Scanner(System.in);

        int x;
        int y;
        int comX;
        int comY;
        boolean win = false;
        boolean choiceSucceed = false;

        do {
            System.out.println("The user is O.");
            System.out.println("Please enter the row of your choice.");
            x = x1S.nextInt();
            System.out.println("Please enter the column of your choice.");
            y = y1S.nextInt();

            if (board[x][y] == '_') {
                board[x][y] = 'O';
            } else {
                System.out.println("Invalid. Place taken."); //prevents overwrite of place
            }


   if(board[0][0]!='_' && board[1][0]!='_' && board[2][0]!='_' && board[0][1]!='_' && board[0][2]!='_' && board[1][1]!='_' && board[2][2]!='_')
            {
            	System.out.println("The board is CAT.");
            	System.exit(0);

            }


            //user check

            //horizontal
            if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') { //top
                System.out.println("User wins.");
                win = true;
            } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') { //mid
                System.out.println("User wins.");
                win = true;
            } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') { //bottom
                System.out.println("User wins.");
                win = true;
            }
            //vertical
            else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') { //center
                System.out.println("User wins.");
                win = true;
            } else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') { //left
                System.out.println("User wins.");
                win = true;
            } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') { //right
                System.out.println("User wins.");
                win = true;
            }
            //diagonal
            else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') { //forward slash
                System.out.println("User wins.");
                win = true;
            } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') { //backward slash
                System.out.println("User wins.");
                win = true;
            }

            //com check
            //horizontal
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                System.out.println("Com wins.");
                win = true;
            } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                System.out.println("Com wins.");
                win = true;
            } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
                System.out.println("Com wins.");
                win = true;
            }

            //vertical
            else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') { //center
                System.out.println("Com wins.");
                win = true;
            } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') { //left
                System.out.println("Com wins.");
                win = true;
            } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') { //right
                System.out.println("Com wins.");
                win = true;
            }
            //diagonal
            else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') { //forward slash
                System.out.println("Com wins.");
                win = true;
            } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') { //backward slash
                System.out.println("Com wins.");
                win = true;
            }




            //random com
            while (!choiceSucceed) {
                comX = (int) (Math.random() * 3);
                comY = (int) (Math.random() * 3);

                if (board[comX][comY] == '_') {
                    board[comX][comY] = 'X'; //places choice, if choice fails, tries again
                    choiceSucceed = true;
                }
            }
            choiceSucceed = false;
            //print board









            for (char[] blank : board) {
                for (int c = 0; c < board[0].length; c++) {
                    System.out.print(blank[c] + " ");
                }
                System.out.print("\n");
            }



        } while (!win);


    }
}
