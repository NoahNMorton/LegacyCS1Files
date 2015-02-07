import java.awt.*;
import javax.swing.*;

public class FrameFile_MAX extends JFrame
{
	public FrameFile_MAX(String frameName)
	{
		// creates the JFrame with the given name
		super(frameName);

		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// makes the window not able to be resized
		setResizable(false);
		
		// creates the window
		pack();

		// gets the graphics configuration
		GraphicsConfiguration gc = getGraphicsConfiguration();

		// gets a rectangle with the deminsions of the screen
		Rectangle screenRect = gc.getBounds();

		// gets the insets of the desktop
		Insets deskInsets = Toolkit.getDefaultToolkit().getScreenInsets(gc);

		// calculates frame width and height
		int frameWidth = (int)(screenRect.width)
			- (deskInsets.left + deskInsets.right);
		int frameHeight = (int)(screenRect.height)
			- (deskInsets.top + deskInsets.bottom);	// removes the height of the start bar
		
		// sets the frame's size
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		
		pack();
		
		// gets the frames insets
		Insets frameInsets = getInsets();
		
		// calculates panel size
		int panelWidth = frameWidth
			- (frameInsets.left + frameInsets.right);
		int panelHeight = frameHeight
			- (frameInsets.top + frameInsets.bottom);
		
		// creates the panel
		PanelFile_MAX p = new PanelFile_MAX(panelWidth, panelHeight);

		// turns off the layout options
		setLayout(null);

		// adds the panel to the frame
		add(p);

		// shows the frame
		setVisible(true);
	}
}