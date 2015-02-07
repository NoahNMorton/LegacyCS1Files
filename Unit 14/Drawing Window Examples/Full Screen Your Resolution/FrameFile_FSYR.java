import java.awt.*;
import javax.swing.*;

public class FrameFile_FSYR extends JFrame
{
	public FrameFile_FSYR()
	{
		// creates the JFrame
		super();
		
		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Gets the Graphics environment
		GraphicsEnvironment ge
			= GraphicsEnvironment.getLocalGraphicsEnvironment();

		// gets the graphics device
		GraphicsDevice gd = ge.getDefaultScreenDevice();

		// turns on full screen mode for this window
		gd.setFullScreenWindow(this);

		// creates the desired desired display mode the parameters are (int width, int height, int bitDepth, int refreshRate) 
			// so the screen will be 800x600 with 32 bit color and a refresh rate of 60
		DisplayMode dm = new DisplayMode(800,600,32,60);

		// sets the display mode
		gd.setDisplayMode(dm);

		// turns off the windows frame
		setUndecorated(true);

		// makes the window not able to be resized
		setResizable(false);

		// shows the frame
		setVisible(true);

	}

	public void paint(Graphics g)
	{
		// draws a black backgroud with a red X
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.GREEN);
		g.drawLine(0,0,getWidth(),getHeight());
		g.drawLine(getWidth(),0,0,getHeight());
	}
}