import java.util.Scanner;




public class LeapYear
{
	public static void main(String[] args)
	{
		
		int year;
		Scanner yearS = new Scanner(System.in);
		
		System.out.println("Please enter the year.");
		year = yearS.nextInt();
		
		if((year%4)==0 && (year%100)==0 && (year%400==0))
		{
			System.out.println("The year is a leap year.");
		}	
		else 
		{
			System.out.println("The year is not a leap year.");
		}
		
		
	}
}