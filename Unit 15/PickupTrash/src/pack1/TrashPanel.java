package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class TrashPanel extends JPanel implements MouseListener {
    @SuppressWarnings("CanBeFinal")
    private boolean[][] trash = new boolean[20][20];
    @SuppressWarnings("CanBeFinal")
    private int width, height, tries = 0;

    TrashPanel(int width, int height) {
        super();
        //Random rand = new Random();
        this.width = width;
        this.height = height;

        for (int r = 0; r < trash.length; r++) { //randomly fills the array with true and false
            boolean[] row = trash[r];
            for (int c = 0; c < row.length; c++) {
                double randDouble = Math.random();
                if (randDouble <= 0.5) {
                    trash[r][c] = true;
                } else if (randDouble > 0.5) {
                    trash[r][c] = false;
                }
            }
        }


        addMouseListener(this);
        setFocusable(true);
        requestFocus();
        setSize(width, height);
    }

    /**
     * Method to test if the trash array is empty.
     *
     * @param trash the array being operated on
     * @return the status of the array
     */
    private static boolean trashIsEmpty(boolean[][] trash) {
        int trueValues = 0;

        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 20; y++) {
                if (trash[x][y]) {
                    trueValues++;
                }
            }
        }
        return trueValues == 0;

    }

    public void paint(Graphics g) {
        // font to be used to draw text to the user
        Font font = new Font(g.getFont().getFontName(), Font.BOLD, 20);
        g.setFont(font);

        //todo check
        if (trashIsEmpty(trash)) { //if whole array is false
            g.setColor(Color.white);
            g.fillRect(0, 0, width, height);
            g.setColor(Color.black);
            System.out.println("All Trash cleared.");
            g.drawString("All trash has been cleared!", 50, 100);
            g.drawString("It took you " + tries + " Tries.", 50, 200);
        } else {
            g.setColor(Color.gray);
            for (int x = 2; x < width; x += 20) {
                for (int y = 2; y < height; y += 20) {
                    g.drawRect(x, y, 10, 10);
                }
            }
            for (int x = 0; x < 400; x += 20) {
                for (int y = 0; y < 400; y += 20) {
                    if (trash[y / 20][x / 20]) {
                        g.setColor(Color.black);
                    } else {
                        g.setColor(Color.white);
                    }
                    g.fillRect(x, y, 10, 10);
                }
            }


        }

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        int columnClicked = e.getX() / 20, rowClicked = e.getY() / 20;
        System.out.println("Clicked at: " + e.getX() / 20 + "," + e.getY() / 20);
        tries++;
        pickUpTrash(rowClicked, columnClicked);
    }

    public void mouseReleased(MouseEvent e) {
    }

    /**
     * Method used to pick up the trash
     *
     * @param r the row of the array clicked
     * @param c the column of the array clicked
     */
    void pickUpTrash(int r, int c) {
        trash[r][c] = false;
        if (r - 1 >= 0 && trash[r - 1][c]) {
            pickUpTrash(r - 1, c);
        }
        if (c - 1 >= 0 && trash[r][c - 1]) {
            pickUpTrash(r, c - 1);
        }
        if (r + 1 < 20 && trash[r + 1][c]) {
            pickUpTrash(r + 1, c);
        }
        if (c + 1 < 20 && trash[r][c + 1]) {
            pickUpTrash(r, c + 1);
        }
        repaint();

    }

}