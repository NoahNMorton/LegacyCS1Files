import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class DBMB_Frame extends JFrame implements KeyListener
{
	int boxX = 50;
	int boxY = 50;
	
	// creates a variable for the buffer
	BufferedImage buffer = null;

	public DBMB_Frame()
	{
		// calls super and sets the name of the frame
		super("Key Listener on a Frame");
		
		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets the size of the frame
		setSize(400,400);
		
		// creates the buffer to size of the drawing area
		buffer = new BufferedImage(getWidth(),getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
		
		// lets teh program know the frame will be listening to the keyboard.
		addKeyListener(this);
		
		// makes the screen not able to be resized
		setResizable(false);
		
		// makes the screen visiable
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		Graphics bg = buffer.getGraphics();
		
		// fills in a black background for the buffer
		bg.setColor(Color.BLACK);
		bg.fillRect(0,0,getWidth(),getHeight());
		
		// draws a red box on the buffer at (boxX, boxY);
		bg.setColor(Color.RED);
		bg.fillRect(boxX,boxY,10,10);
		
		// draws the directions to the buffer;
		bg.setColor(Color.CYAN);
		bg.drawString("Use w,a,s or d to move the box",100,350);
		
		// draws the buffer to the screen
		g.drawImage(buffer,0,0,null);
	}

	public void keyPressed(KeyEvent e)
	{
		
	}

	public void keyTyped(KeyEvent e)
	{
		// gets the typed key from the user
		char key = e.getKeyChar();
		
		// moves the box 1 pixel if a,s,d,w was typed
		if(key=='a')
			boxX = boxX -1;
		if(key=='d')
			boxX = boxX +1;
		if(key=='w')
			boxY = boxY -1;
		if(key=='s')
			boxY = boxY +1;
		
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
	}
}
