import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MBF_Frame extends JFrame implements MouseListener
{
	int boxX =50;
	int boxY =50;

	public MBF_Frame()
	{
		// calls super and sets the name of the frame
		super("Mouse Listener on a Frame");
		
		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets the size of the frame
		setSize(400,400);
		
		// lets teh program know the frame will be listening to the keyboard.
		addMouseListener(this);
		
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
		
		// draws a red box on the screen at (boxX, boxY);
		g.setColor(Color.RED);
		g.fillRect(boxX,boxY,10,10);
		
		// draws the directions to the screen;
		g.setColor(Color.CYAN);
		g.drawString("Left click button to move the box.",100,350);
	}

	public void mousePressed(MouseEvent e)
	{	}
	
	public void mouseReleased(MouseEvent e)
	{	}
	
	public void mouseClicked(MouseEvent e)
	{	
		// get the x and y where the mouse was clicked
		int x = e.getX();
		int y = e.getY();
		
		// Checks to make sure the click was a left click
		if(e.getButton() == e.BUTTON1)
		{
			// sets the boxX and boxY to the location where the mouse was clicked
			boxX = x;
			boxY = y;
		}
		
		// redraws the screen
		repaint();
	}
	
	public void mouseEntered(MouseEvent e)
	{	}
	
	public void mouseExited(MouseEvent e)
	{	}
}
