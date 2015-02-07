import java.util.Scanner;

public class GradeAvg
{
	public static void main(String[] args)
	{

		double g1;
		double g2;
		double g3;
		double g4;

		double average;

		Scanner sg1 = new Scanner(System.in);
		Scanner sg2 = new Scanner(System.in);
		Scanner sg3 = new Scanner(System.in);
		Scanner sg4 = new Scanner(System.in);

		System.out.println("Please enter the first grade.");
		g1 = sg1.nextDouble();

		System.out.println("Please enter the second grade.");
		g2 = sg2.nextDouble();

		System.out.println("Please enter the third grade.");
		g3 = sg3.nextDouble();

		System.out.println("Please enter the fourth grade.");
		g4 = sg4.nextDouble();


		average= (g1+g2+g3+g4)/4;


		System.out.printf("The average for this student is %.3f  points. \n",average);


		if(average>=90)
		{
			System.out.println("Their grade is an A.");
		}
		else if(average>=80)
		{
			System.out.println("Their grade is a B.");
		}
		else if(average>=70)
		{
			System.out.println("Their grade is a C.");
		}
		else if(average>=60)
		{
			System.out.println("Their grade is a D.");
		}
		else if(average<=59)
		{
			System.out.println("They Failed! They have an F.");
		}
		else
		{
			System.out.println("Grade invalid.");
		}











	}
}