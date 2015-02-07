package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class ConnectFourFrame extends JFrame implements MouseListener {
    public static final int ONE_PLAYER = 1, TWO_PLAYER = 2;
    int turn = ConnectFourGame.RED, mode; //1 or 2 player game
    ConnectFourGame game;
    BufferedImage buffer;
    boolean gameOver = false;

    /**
     * @param players players in the game
     */
    public ConnectFourFrame(int players) {

        super("Connect Four");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setPreferredSize(new Dimension(400, 370));
        pack();
        addMouseListener(this);
        setVisible(true);
        this.mode = players;
        reset();
    }

    public int getTurn() {
        return turn;
    }

    public int getMode() {
        return mode;
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getButton() + " " + MouseEvent.BUTTON3);
        if (gameOver && e.getButton() == MouseEvent.BUTTON3)
            reset();

        System.out.println("Clicked at " + e.getX());

        if (mode == 1) {

            if (e.getX() >= 0 && e.getX() <= 50 && !game.columnFull(0) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(0, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;
                    }
                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 0");
                repaint();
            } else if (e.getX() >= 51 && e.getX() <= 100 && !game.columnFull(1) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(1, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;

                    }

                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 1");
                repaint();
            } else if (e.getX() >= 111 && e.getX() <= 160 && !game.columnFull(2) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(2, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;

                    }

                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 2");
                repaint();
            } else if (e.getX() >= 166 && e.getX() <= 220 && !game.columnFull(3) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(3, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;

                    }

                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 3");
                repaint();
            } else if (e.getX() >= 221 && e.getX() <= 270 && !game.columnFull(4) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(4, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;

                    }

                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 4");
                repaint();
            } else if (e.getX() >= 271 && e.getX() <= 320 && !game.columnFull(5) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(5, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;

                    }

                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 5");
                repaint();
            } else if (e.getX() >= 321 && e.getX() <= 370 && !game.columnFull(6) && e.getButton() == MouseEvent.BUTTON1) {
                game.dropPiece(6, ConnectFourGame.RED);
                boolean moveSuccess = false;
                int rand = 0;
                while (!moveSuccess) {
                    rand = (int) (Math.random() * 6);
                    if (!game.columnFull(rand)) {
                        moveSuccess = true;

                    }

                }
                game.dropPiece(rand, ConnectFourGame.BLACK);
                System.out.println("Dropped in 6");
                repaint();
            }
            //check status
            if (game.status() == ConnectFourGame.BLACK_WINS) {
                System.out.println("Black wins!");
                gameOver = true;
            } else if (game.status() == ConnectFourGame.RED_WINS) {
                System.out.println("Red wins!");
                gameOver = true;
            } else if (game.status() == ConnectFourGame.DRAW) {
                System.out.println("It's a Draw!");
                gameOver = true;
            }

        } else if (mode == 2) {


            System.out.println("Clicked at " + e.getX());
            if (e.getX() >= 0 && e.getX() <= 50 && !game.columnFull(0) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(0, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(0, turn);
                }
                System.out.println("Dropped in 0");
                repaint();
            } else if (e.getX() >= 51 && e.getX() <= 100 && !game.columnFull(1) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(1, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(1, turn);
                }
                System.out.println("Dropped in 1");
                repaint();
            } else if (e.getX() >= 111 && e.getX() <= 160 && !game.columnFull(2) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(2, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(2, turn);
                }
                System.out.println("Dropped in 2");
                repaint();
            } else if (e.getX() >= 166 && e.getX() <= 220 && !game.columnFull(3) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(3, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(3, turn);
                }
                System.out.println("Dropped in 3");
                repaint();
            } else if (e.getX() >= 221 && e.getX() <= 270 && !game.columnFull(4) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(4, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(4, turn);
                }
                System.out.println("Dropped in 4");
                repaint();
            } else if (e.getX() >= 271 && e.getX() <= 320 && !game.columnFull(5) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(5, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(5, turn);
                }
                System.out.println("Dropped in 5");
                repaint();
            } else if (e.getX() >= 321 && e.getX() <= 370 && !game.columnFull(6) && e.getButton() == MouseEvent.BUTTON1) {
                if (turn == ConnectFourGame.RED) {
                    turn = ConnectFourGame.BLACK;
                    game.dropPiece(6, turn);
                } else {
                    turn = ConnectFourGame.RED;
                    game.dropPiece(6, turn);
                }
                System.out.println("Dropped in 6");
                repaint();
            }

            //Check status
            if (game.status() == ConnectFourGame.BLACK_WINS) {
                System.out.println("Black wins!");
                gameOver = true;
                repaint();

            } else if (game.status() == ConnectFourGame.RED_WINS) {
                System.out.println("Red wins!");
                gameOver = true;
                repaint();

            } else if (game.status() == ConnectFourGame.DRAW) {
                System.out.println("It's a Draw!");
                gameOver = true;
                repaint();

            }
        }
        repaint();
    }

    public void mouseClicked(MouseEvent e) {
        //unused
    }

    public void mouseEntered(MouseEvent e) {
        //unused
    }

    public void mouseExited(MouseEvent e) {
        //unused
    }

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRect(0, 0, 500, 500); //fills screen with a yellow rectangle

        g.setColor(Color.white);
        for (int y = 40; y < 500 - 170; y += 55) { //y
            for (int x = 0; x < 500 - 140; x += 55) { //x
                if (game.getSpot(y / 55, x / 55) == ConnectFourGame.RED) { //if space is red
                    g.setColor(Color.red);
                } else if (game.getSpot(y / 55, x / 55) == ConnectFourGame.BLACK) { //if space is black
                    g.setColor(Color.black);
                } else {
                    g.setColor(Color.white);
                }
                g.fillOval(x, y, 50, 50);
            }
        }
        if (game.status() == ConnectFourGame.RED_WINS) {

            g.setColor(Color.white);
            g.fillRect(50, 50, 170, 130);
            g.setFont(new Font("Times New Roman", Font.BOLD, 24));
            g.setColor(Color.black);
            g.drawString("Red Wins!", 100, 100);

        } else if (game.status() == ConnectFourGame.BLACK_WINS) {

            g.setColor(Color.white);
            g.fillRect(50, 50, 170, 130);
            g.setFont(new Font("Times New Roman", Font.BOLD, 24));
            g.setColor(Color.black);
            g.drawString("Black Wins!", 100, 100);
        } else if (game.status() == ConnectFourGame.DRAW) {

            g.setColor(Color.white);
            g.fillRect(50, 50, 170, 130);
            g.setFont(new Font("Times New Roman", Font.BOLD, 24));
            g.setColor(Color.BLACK);
            g.drawString("It's a Draw!", 100, 100);

        }
    }

    public void mousePressed(MouseEvent e) {

    }

    private void reset() {
        game = new ConnectFourGame();
    }


}
