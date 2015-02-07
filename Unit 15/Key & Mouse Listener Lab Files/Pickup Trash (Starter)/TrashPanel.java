import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TrashPanel extends JPanel implements MouseListener
{
	private boolean[][] trash = new boolean[20][20];
	private int width;
	private int height;
	
	
	TrashPanel(int width, int height)
	{
		super();
		Random rand = new Random();
		this.width =width;
		this.height = height;
		
			// ADD CODE HERE
		
			// RANDOMLY FILL THE TRASH ARRAY WITH TRUE AND FALSE
			// FALSE - NO TRASH
			// TRUE - TRASH
	
		addMouseListener(this);
		
		setFocusable(true);
		
		requestFocus();
		
		setSize(width,height);	
	}
	
	

	public void paint(Graphics g)
	{
		// font to be used to draw text to the user
		Font font= new Font(g.getFont().getFontName() , Font.BOLD,20);
		g.setFont(font);
		
	
			// ADD CODE HERE
			
			// DRAW THE TRASH CANS AND DRAW TRASH IN THE
			// CANS THAT HAVE TRASH
			// IF THERE ARE NOT CANS WITH TRASH THEN TELL THE 
			// USER THAT THEY HAVE CLEARED OUT ALL OF THE TRASH
	}
	
	

	public void mouseClicked(MouseEvent e) 
	{
	
	}
	

	public void mouseEntered(MouseEvent e) 
	{	
	}
	

	public void mouseExited(MouseEvent e) 
	{
	}
	

	public void mousePressed(MouseEvent e) 
	{
		// ADD CODE HERE
		
		// CALL PICK UP TRASH WITH THE CORRECT ROW, COL
		// IF THEY CLICKED ON A TRASH BAG
	}
	

	public void mouseReleased(MouseEvent e)  
	{	
	}
	
	public void pickUpTrash(int r, int c)
	{
		// ADD CODE HERE
		
		// CLEAN UP THE TRASH ON THE CURRENT SQUARE 
		// AND CALL PICKUP TRASH AS NEEDED TO CLEAN
		// NEIGHBORING SQUARES
	}

}