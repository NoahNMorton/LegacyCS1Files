package pack1;


import java.util.Scanner;

class Mainfile {

    public static void main(String[] args) {
        ConnectFourGame CFG = new ConnectFourGame();
        Player pl1, pl2;

        Scanner input = new Scanner(System.in);
        byte redType, blackType; //1 for human, 2 for computer
        String name;

        System.out.println("What type of player is Red? 1 for human, 2 for computer");
        redType = input.nextByte();
        System.out.println("What type of player is Black? 1 for human, 2 for computer");
        blackType = input.nextByte();

        if (redType > 2 || redType < 1)
            System.exit(2);
        if (blackType > 2 || blackType < 1)
            System.exit(2);


        if (redType == 1) {
            System.out.println("What is red's name?");
            name = input.next();
            pl1 = new HumanPlayer(name, ConnectFourGame.RED);
        } else {
            pl1 = new ComputerPlayer("Computer", ConnectFourGame.RED);
        }

        if (blackType == 1) {
            System.out.println("What is black's name?");
            name = input.next();
            pl2 = new HumanPlayer(name, ConnectFourGame.BLACK);
        } else {
            pl2 = new ComputerPlayer("Computer", ConnectFourGame.BLACK);
        }

        do {
            CFG.draw(); //draw the board to console

            CFG.dropPiece(pl1.move(CFG), ConnectFourGame.RED);
            CFG.draw();


            CFG.dropPiece(pl2.move(CFG), ConnectFourGame.BLACK);

            if (CFG.status() == ConnectFourGame.BLACK_WINS) {
                //System.console().flush();
                System.out.println("Black wins!");
                CFG.draw();
                System.exit(0);
            } else if (CFG.status() == ConnectFourGame.RED_WINS) {
                //System.console().flush();
                System.out.println("Red wins!");
                CFG.draw();
                System.exit(0);
            } else if (CFG.status() == ConnectFourGame.DRAW) {
                System.out.println("It's a Draw!");
                CFG.draw();
                System.exit(0);
            }

        } while (CFG.status() == ConnectFourGame.PLAYING);


    }

}
