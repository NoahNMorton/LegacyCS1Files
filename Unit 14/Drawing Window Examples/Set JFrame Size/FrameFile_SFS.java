import java.awt.*;
import javax.swing.*;

public class FrameFile_SFS extends JFrame
{
	public FrameFile_SFS(String frameName, int frameWidth, int frameHeight)
	{
		// creates the JFrame with the given name
		super(frameName);

		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// makes the window not able to be resized
		setResizable(false);

		// sets the frame's size
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		
		// creates the window
		pack();
		
		// gets the frames insets
		Insets frameInsets = getInsets();

		// calculates panel size
		int panelWidth = frameWidth
			- (frameInsets.left + frameInsets.right);
		int panelHeight = frameHeight
			- (frameInsets.top + frameInsets.bottom);

		// creates the panel
		PanelFile_SFS p = new PanelFile_SFS(panelWidth, panelHeight);

		// turns off the layout options
		setLayout(null);

		// adds the panel to the frame
		add(p);

		// shows the frame
		setVisible(true);

	}
}