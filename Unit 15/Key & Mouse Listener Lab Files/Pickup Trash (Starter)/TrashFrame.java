import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
public class TrashFrame extends JFrame
{
	// these setting are being used to track the size of the panel that
	// is being created
	private int panelHeight =400;
	private int panelWidth = 400;
	
	// For this example the other parameter that is being recieved is the
	// name of the window. Note that other frames may need more information
	// depending on how the program is designed and built
	TrashFrame(String titleBarName)
	{
		super(titleBarName);
		Scanner keyboard = new Scanner(System.in);
		// Calls the JFrame constructor that sets the title of the frame
		// to the String that was passed.
		
		
		// called so that the frame is built
		// this call is made so inset sizes can be calculated
		pack();
		
	
		// creates the panel that will be added to the frame later.
		TrashPanel towerPanel = new TrashPanel(panelWidth,panelHeight);
		
		// gets the content pane of the frame
		// this pane is where you will add your panel
		Container c = this.getContentPane();
		
		// this line is needed but it is not important for you to understand
		// layouts at this time.
		c.setLayout(null);
		
		// this line adds the panel to content frame so that the frame
		c.add(towerPanel);
		
		// Code sets the 
		Insets frameInsets = getInsets();
    	
    	int frameWidth = panelWidth + (frameInsets.left + frameInsets.right);
    	int frameHeight = panelHeight + (frameInsets.top + frameInsets.bottom);
    	
    	setPreferredSize(new Dimension ((int)frameWidth,(int)frameHeight));
    	
    	// builds the window to the preferredSize
    	pack();
    	
    	// makes the window so that it can not be resized
    	setResizable(false);		
		
		// this line makes the frame visable now that we have set all its
		// properties
		show();
	}

}