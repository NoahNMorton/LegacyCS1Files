import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class LoadNDraw_Frame extends JFrame
{
	private BufferedImage ladder 	= null;
	private BufferedImage floor 	= null;

	public LoadNDraw_Frame()
	{
		// calls super and sets the name of the frame
		super("Load and draw 2 Images");
		
		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try
		{
			floor = ImageIO.read((new File("Images\\floor.gif")));
			ladder = ImageIO.read((new File("Images\\ladder.gif")));
			System.out.println("All images wereloaded Properly.");
		}
		catch(Exception e)
		{
			System.out.println("Error Loading Images: " + e.getMessage());
		}
				
		//sets the size of the frame
		setSize(250,150);
		
		// makes the screen not able to be resized
		setResizable(false);
		
		// makes the screen visiable
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		// fills in a black background
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		
		// draws both images to the screen
		g.drawImage(ladder, 50,50,null);
		g.drawImage(floor, 150,50,null);
	}
}
