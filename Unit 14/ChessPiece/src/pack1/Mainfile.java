package pack1;

import javax.swing.*;
import java.awt.*;

public class Mainfile extends JFrame {
    public static void main(String[] args) {

        new Mainfile();
    }

    public Mainfile() {
        super("Chess Piece");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setPreferredSize(new Dimension(150, 400));
        pack();
        setVisible(true);
        //setUndecorated(true);

    }

    public void paint(Graphics g) {
        //todo draw chess piece
        g.setColor(Color.RED);

        g.fillRect(0, 0, 150, 400); //fills the screen
        g.setColor(Color.BLACK);

        //start drawing chess piece
        /* I plan to draw the rook, or castle. */
        Polygon p = new Polygon();
        p.addPoint(25, 70);
        p.addPoint(45, 70);
        p.addPoint(45, 90);
        p.addPoint(65, 90);
        p.addPoint(65, 70);
        p.addPoint(85, 70);
        p.addPoint(85, 90);
        p.addPoint(105, 90);
        p.addPoint(105, 70);
        p.addPoint(125, 70);
        p.addPoint(125, 160);
        p.addPoint(110, 170);
        p.addPoint(110, 250);
        p.addPoint(118, 260);

        p.addPoint(110,270);
        p.addPoint(130,270);
        p.addPoint(140,280);
        p.addPoint(130,290);

        p.addPoint(25,290);
        p.addPoint(10,280);
        p.addPoint(25,270);
        p.addPoint(40,270);
        p.addPoint(30,260);
        p.addPoint(40,250);
        p.addPoint(40,170);
        p.addPoint(25,160);

        g.fillPolygon(p);


    }
}