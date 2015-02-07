import java.util.Scanner;

public class RectProgram
{
	public static void main(String[] args)
	{
		int width=0;
		int height=0;
		 
		int area=0;
		int perimeter=0;
		
		Scanner widthS = new Scanner(System.in);
		Scanner heightS = new Scanner(System.in);
		
		System.out.println("Enter Width of rectangle.");
		width = widthS.nextInt();
		System.out.println("\n Enter Height of rectangle.");
		height = heightS.nextInt();	
		
		area = width*height;  
		perimeter = 2*width+2*height;
		System.out.print("\nRectangle Properties:");
		System.out.println("\nWidth: "+width);
		System.out.println("Height: "+height);
		System.out.println("Perimeter: "+ perimeter);
		System.out.println("Area: "+area);
	}
}