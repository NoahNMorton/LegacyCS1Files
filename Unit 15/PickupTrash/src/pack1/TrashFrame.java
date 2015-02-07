package pack1;

import javax.swing.*;
import java.awt.*;

class TrashFrame extends JFrame {

    // For this example the other parameter that is being received is the
    // name of the window. Note that other frames may need more information
    // depending on how the program is designed and built
    @SuppressWarnings("SameParameterValue")
    TrashFrame(String titleBarName) {
        super(titleBarName);
        //Scanner keyboard = new Scanner(System.in);
        pack();
        int panelHeight = 400;
        int panelWidth = 400;
        TrashPanel towerPanel = new TrashPanel(panelWidth, panelHeight);
        Container c = this.getContentPane();
        c.setLayout(null);
        c.add(towerPanel);
        Insets frameInsets = getInsets();
        int frameWidth = panelWidth + (frameInsets.left + frameInsets.right);
        int frameHeight = panelHeight + (frameInsets.top + frameInsets.bottom);
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setVisible(true);
        System.out.println("Initialising...\nAuthor: Noah Morton\nLoading Window...");
    }

}