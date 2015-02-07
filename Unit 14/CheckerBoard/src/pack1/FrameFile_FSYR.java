package pack1;


import javax.swing.*;
import java.awt.*;

public class FrameFile_FSYR extends JFrame {
    public FrameFile_FSYR() {
        // creates the JFrame
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        gd.setFullScreenWindow(this);
        DisplayMode dm = new DisplayMode(800, 600, 32, 60);
        gd.setDisplayMode(dm);

        setUndecorated(false);
        setResizable(false);
        setVisible(true);
        //setPreferredSize(new Dimension(800,600));
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);

        for (int b = 130; b < 530; b += 100) {
            for (int a = 240; a < 640; a += 100) {
                g.fillRect(a, b, 50, 50);
            }
        }
        for (int b = 80; b < 480; b += 100) {
            for (int a = 190; a < 590; a += 100) {
                g.fillRect(a, b, 50, 50);
            }
        }

        // pieces
        g.setColor(Color.WHITE);
        // g.drawOval(245, 85, 40, 40);

        for (int a = 245; a < 600; a += 100) {
            for (int b = 85; b < 200; b += 100) {
                g.drawOval(a, b, 40, 40);

            }
        }
        for (int a = 195; a < 500; a += 100) {
            g.drawOval(a, 135, 40, 40);
        }
        //red team
        g.setColor(Color.RED);
        for (int a = 195; a < 500; a += 100) {
            for (int b = 335; b < 500; b += 100) {
                g.fillOval(a, b, 40, 40);

            }
        }
        for (int a = 245; a < 600; a += 100) {
            g.fillOval(a, 385, 40, 40);
        }
        g.setColor(Color.WHITE);
        for (int a = 195; a < 500; a += 100) {
            for (int b = 335; b < 500; b += 100) {
                g.drawOval(a, b, 40, 40);

            }
        }
        for (int a = 245; a < 600; a += 100) {
            g.drawOval(a, 385, 40, 40);
        }


    }
}