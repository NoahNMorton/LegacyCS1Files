package pack1;
/**
 * @author Noah Morton
 * @version v1.0.3
 */

import java.util.Scanner;

class Mainfile {

    public static void main(String[] args) {
        ConnectFourGame CFG = new ConnectFourGame();
        //Player pl1, pl2; //player 1 and 2
        Scanner input = new Scanner(System.in);
        System.out.println("How many players? 1 or 2?");
        byte numOfPlayers = input.nextByte();
        new ConnectFourFrame(numOfPlayers); //create the window with number of players


    }

}
