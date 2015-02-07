package pack1;

import javax.swing.*;
import java.awt.*;

class Mainfile extends JFrame {
    public static void main(String[] args) {
        System.out.println("Loading Window...");
        new Mainfile();
    }

    private Mainfile() {
        // creates the JFrame with the given name
        super("Pie Chart");

        // Sets the close button to exit the program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // makes the window not able to be resized
        setResizable(false);

        // sets the frame's size
        setPreferredSize(new Dimension(1680, 1050));

        // creates the window
        pack();

        // shows the frame
        setVisible(true);

    }




    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillOval(680, 312, 500, 500);

        g.setColor(Color.WHITE);
        g.fillArc(680, 312, 500, 500, 0, 104);

        g.setColor(Color.YELLOW);
        g.fillArc(680, 312, 500, 500, 104, 118);

        g.setColor(Color.GREEN);
        g.fillArc(680, 312, 500, 500, 222, 72);

        g.setColor(Color.blue);
        g.fillArc(680, 312, 500, 500, 294, 35);

        //todo text
        g.setFont(new Font("Times New Roman", Font.BOLD, 24));
        g.setColor(Color.WHITE);
        g.fillRect(40, 70, 50, 50);
        g.drawString("Sleep- 7 hours, 29%", 100, 100);

        g.setColor(Color.YELLOW);
        g.drawString("School - 8 hours, 33%", 100, 200);
        g.fillRect(40, 170, 50, 50);

        g.setColor(Color.GREEN);
        g.drawString("Video Games - 5 hours, 20%", 100, 300);
        g.fillRect(40, 270, 50, 50);

        g.setColor(Color.BLUE);
        g.drawString("Errands- 2 hours, 8%", 100, 400);
        g.fillRect(40, 370, 50, 50);

        g.setColor(Color.RED);
        g.drawString("Other- 2 hours, 8%", 100, 500);
        g.fillRect(40, 470, 50, 50);

    }
}