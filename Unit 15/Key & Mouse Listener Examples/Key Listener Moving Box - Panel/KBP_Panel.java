import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KBP_Panel extends JPanel implements KeyListener
{
	int boxX =50;
	int boxY =50;

	public KBP_Panel(int width, int height)
	{
		// calls super and sets the name of the frame
		super();
		
		//sets the size of the frame
		setSize(400,400);
		
		// lets teh program know the frame will be listening to the keyboard.
		addKeyListener(this);
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
		g.drawString("Use w,a,s or d to move the box",100,350);
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
	
	// This method is being overridden
	// It is called when the frame finishes adding the panel
	public void addNotify()
	{
		// call super so the method still does what it was built to do
		super.addNotify();
		
		// requests focus so that key inputs are sent to this screen
		requestFocus();
	}
}
