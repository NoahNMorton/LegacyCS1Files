import java.util.Scanner;

public class CircleLab
{
	public static void main(String[] args)
	{
		double radius=0;
		double area=0;
        double circumference;

		Scanner Cradius = new Scanner(System.in);


		System.out.println("Enter Radius of circle.");
		radius = Cradius.nextDouble();


		area = Math.PI*(radius*radius);
		circumference = 2*Math.PI*radius;
		System.out.print("\n Circle Properties:");
		System.out.println("\n Circumference: "+circumference);
		System.out.println("\n Radius: "+radius);
		System.out.println("\n Area: "+area);
	}
}