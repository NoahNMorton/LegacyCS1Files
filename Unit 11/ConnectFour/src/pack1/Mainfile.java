package pack1;


import java.util.Scanner;

class Mainfile {

    public static void main(String[] args) {
        ConnectFourGame CFG = new ConnectFourGame();
        Scanner imput = new Scanner(System.in);

        do {
            CFG.draw();

            System.out.println("Player RED is playing. Please give a column.");
            int col = imput.nextInt();
            CFG.dropPiece(col, ConnectFourGame.RED);


            System.out.println("Player BLACK is playing. Please give a column.");
            col = imput.nextInt();
            CFG.dropPiece(col, ConnectFourGame.BLACK);


            if (CFG.status() == ConnectFourGame.BLACK_WINS) {
                System.out.println("Black wins!");
                System.exit(0);
            } else if (CFG.status() == ConnectFourGame.RED_WINS) {
                System.out.println("Red wins!");
                System.exit(0);
            } else if (CFG.status() == ConnectFourGame.DRAW) {
                System.out.println("It's a Draw!");
                System.exit(0);
            }


        } while (CFG.status() == ConnectFourGame.PLAYING);


    }

}
