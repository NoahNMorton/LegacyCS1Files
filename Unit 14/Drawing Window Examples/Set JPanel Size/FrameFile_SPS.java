import java.awt.*;
import javax.swing.*;

public class FrameFile_SPS extends JFrame
{
	public FrameFile_SPS(String frameName, int panelWidth, int panelHeight)
	{
		// creates the JFrame with the given name
		super(frameName);
	
		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// makes the window not able to be resized
		setResizable(false);

		// creates the window
		pack();
		
		// creates the panel
		PanelFile_SPS p = new PanelFile_SPS(panelWidth, panelHeight);
		
		// gets the frames insets
		Insets frameInsets = getInsets();

		// calculates panel size
		int frameWidth = panelWidth
			+ (frameInsets.left + frameInsets.right);
		int frameHeight = panelHeight
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

