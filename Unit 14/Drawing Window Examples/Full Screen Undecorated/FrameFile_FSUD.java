import java.awt.*;
import javax.swing.*;

public class FrameFile_FSUD extends JFrame
{
	public FrameFile_FSUD()
	{
		// creates the JFrame
		super();

		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// makes the window not able to be resized
		setResizable(false);

		// turns off the windows frame
		setUndecorated(true);

		// gets the graphics configuration
		GraphicsConfiguration gc = getGraphicsConfiguration();

		// gets a rectangle with the deminsions of the screen
		Rectangle screenRect = gc.getBounds();


		// sets frame width and height
		int frameWidth = (int)(screenRect.width);
		int frameHeight = (int)(screenRect.height);

		// sets the frame's size
		setSize(frameWidth, frameHeight);

		// shows the frame
		setVisible(true);

	}

	public void paint(Graphics g)
	{
		// draws a black background with a a red X
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.RED);
		g.drawLine(0,0,getWidth(),getHeight());
		g.drawLine(getWidth(),0,0,getHeight());
	}
}