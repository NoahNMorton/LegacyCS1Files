package matchinggame;

import java.util.Scanner;

public class MatchingGame {

    public static void main(String[] args) {

        int[][] boardIn = {{1, 9, 3, 7}, //0
                           {1, 8, 6, 4}, //1
                           {2, 2, 3, 4}, //2
                           {9, 8, 6, 7}}; //3

        boolean[][] boardBool = {{false, false, false, false},
                                {false, false, false, false},
                                {false, false, false, false},
                                {false, false, false, false}};

        int[][] blanks = {{0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0, 0}};

        Scanner xS = new Scanner(System.in);
        Scanner yS = new Scanner(System.in);

        int x;
        int y;
        int x2;
        int y2;
        boolean won = false;


        while (!won) {

            //print
            for (int[] blank : blanks) {
                for (int c = 0; c < blanks[0].length; c++) {
                    System.out.print(blank[c] + " ");
                }
                System.out.print("\n");
            }

            System.out.println("Please enter the row-coord of your choice.");
            x = xS.nextInt();
            System.out.println("Please enter the column-coord of your choice.");
            y = yS.nextInt();

            System.out.println("Please enter the second row-coord of your choice.");
            x2 = xS.nextInt();
            System.out.println("Please enter the second column-coord of your choice.");
            y2 = yS.nextInt();

            
            boardBool[x][y] = true;
            boardBool[x2][y2] = true;

            //win checking
            if (boardBool[0][0] && boardBool[1][0]) //1
            {

                System.out.println("Match!");
                blanks[0][0] = 1;
                blanks[1][0] = 1;
                boardBool[0][0] = false;
                boardBool[1][0] = false;

            }

            if (boardBool[2][0] && boardBool[2][1]) //2
            {

                System.out.println("Match!");
                blanks[2][0] = 2;
                blanks[2][1] = 2;
                boardBool[2][0] = false;
                boardBool[2][1] = false;

            }

            if (boardBool[0][2] && boardBool[2][2]) //3
            {

                System.out.println("Match!");
                blanks[0][2] = 3;
                blanks[2][2] = 3;
                boardBool[0][2] = false;
                boardBool[2][2] = false;

            }

            if (boardBool[1][3] && boardBool[2][3]) //4
            {

                System.out.println("Match!");
                blanks[1][3] = 4;
                blanks[2][3] = 4;
                boardBool[1][3] = false;
                boardBool[2][3] = false;

            }

            if (boardBool[1][2] && boardBool[3][2]) //6
            {

                System.out.println("Match!");
                blanks[1][2] = 6;
                blanks[3][2] = 6;
                boardBool[1][2] = false;
                boardBool[3][2] = false;

            }

            if (boardBool[0][3] && boardBool[3][3]) //7
            {

                System.out.println("Match!");
                blanks[0][3] = 7;
                blanks[3][3] = 7;
                boardBool[0][3] = false;
                boardBool[3][3] = false;

            }

            if (boardBool[1][1]  && boardBool[3][1]) //8
            {

                System.out.println("Match!");
                blanks[1][1] = 8;
                blanks[3][1] = 8;
                boardBool[1][1] = false;
                boardBool[3][1] = false;

            }

            if (boardBool[3][0]  && boardBool[0][1]) //9
            {
                System.out.println("Match!");
                blanks[3][0] = 9;
                blanks[0][1] = 9;
                boardBool[3][0] = false;
                boardBool[0][1] = false;
            }
            //TODO add win checking >attempt

            if(boardBool[0][0] && boardBool[0][1] && boardBool[0][2] && boardBool[0][3] &&
              boardBool[1][0] && boardBool[1][1] && boardBool[1][2] && boardBool[1][3] &&
             boardBool[2][0] && boardBool[2][1] && boardBool[2][2] && boardBool[2][3] &&
             boardBool[3][0] && boardBool[3][1] && boardBool[3][2] && boardBool[3][3])
            {
                won = true;
            }    
                
            
            
            
            
//            for (boolean[] aBoardBool : boardBool) {
//                for (int c = 0; c < boardBool[0].length; c++) {
//                    if (aBoardBool[c]) {
//                        won = true;
//                    }
//                }
//            }


        }

            System.out.println("You have won!");



    }
}
