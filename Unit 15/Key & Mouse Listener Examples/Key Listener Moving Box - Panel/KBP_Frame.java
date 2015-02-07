import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KBP_Frame extends JFrame
{
	public KBP_Frame()
	{
		// creates the JFrame with the given name
		super("Key Listener on a Frame");

		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// makes the window not able to be resized
		setResizable(false);

		// creates the window
		pack();
		
		// creates the panel
		KBP_Panel p = new KBP_Panel(400, 400);
		
		// gets the frames insets
		Insets frameInsets = getInsets();

		// calculates panel size
		int frameWidth = p.getWidth()
			+ (frameInsets.left + frameInsets.right);
		int frameHeight = p.getHeight()
			+ (frameInsets.top + frameInsets.bottom);

		// sets the frame's size
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		
		// turns off the layout options
		setLayout(null);

		// adds the panel to the frame
		add(p);

		// adjusts the window to meet its new preferred size
		pack();

		// shows the frame
		setVisible(true);

	}
}
