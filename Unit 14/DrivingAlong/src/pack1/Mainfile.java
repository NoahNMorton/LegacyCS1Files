package pack1;

import javax.swing.*;
import java.awt.*;

public class Mainfile extends JFrame {
    public static void main(String[] args) {

        new Mainfile();
    }

    public Mainfile() {
        super("Driving Along");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setPreferredSize(new Dimension(600, 400));
        pack();
        setVisible(true);
    }

    public void paint(Graphics g) {
        //background
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 600, 400);
        //grass
        g.setColor(Color.GREEN);
        g.fillRect(0,150,600,300);
        //road
        g.setColor(Color.GRAY);
        g.fillRect(0,200,600,100);
        //car
        g.setColor(Color.CYAN);
        Polygon p = new Polygon();
        p.addPoint(40, 250);
        p.addPoint(40, 220);
        p.addPoint(60, 220);
        p.addPoint(80, 190);
        p.addPoint(115, 190);
        p.addPoint(140, 220);
        p.addPoint(165, 220);
        p.addPoint(165, 250);
        g.fillPolygon(p);


        g.setColor(Color.BLACK);
        g.fillOval(50,240,30,30);
        g.fillOval(120,240,30,30);

        g.setColor(Color.YELLOW);
        g.fillOval(50,50,50,50);

        //tree
        g.setColor(new Color(111,71,57)); //brown
        g.fillRect(500,100,20,60);

        g.setColor(Color.GREEN);
        g.fillOval(480,80,70,60);





    }
}
