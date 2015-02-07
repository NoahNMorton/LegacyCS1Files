import java.util.Scanner;

public class DistanceCalc
{
	public static void main(String[] args)
	{
		int x1;
		int y1;
		int x2;
		int y2;
		double distance=0; //stores dis between points
		//scanners
		Scanner firstX = new Scanner(System.in);
		Scanner firstY = new Scanner(System.in);
		Scanner secondX = new Scanner(System.in);
		Scanner secondY = new Scanner(System.in);

		System.out.println("Please enter the first point's X value.");
		x1 = firstX.nextInt();
		System.out.println("Please enter the first point's Y value.");
		y1 = firstY.nextInt();
		System.out.println("Please enter the second point's X value.");
		x2 = secondX.nextInt();
		System.out.println("Please enter the second point's Y value.");
		y2 = secondY.nextInt();

		distance = Math.pow((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)),0.5);



		System.out.printf("The distance between (%d,%d) and (%d,%d) is %.2f units.\n",x1,y1,x2,y2,distance);

	}
}