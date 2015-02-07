import java.awt.*;
import javax.swing.*;

public class Animal extends JFrame
{
	public static void main(String[] args)
	{
		System.out.println("aaaa");
		new Animal();
	}

	public Animal()
	{
		// creates the JFrame with the given name
		super("Animal");

		// Sets the close button to exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// makes the window not able to be resized
		setResizable(false);

		// sets the frame's size
		setPreferredSize(new Dimension(500, 500));

		// creates the window
		pack();

		// shows the frame
		setVisible(true);

	}

	public void paint(Graphics g)
	{
		// draws a black background and a red X
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.RED);
		g.drawLine(0,0,getWidth(),getHeight());
		g.drawLine(getWidth(),0,0,getHeight());
	}
}