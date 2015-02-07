import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args)
	{
		int userNum;


		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter an integer.");
		userNum = num.nextInt();

        if(userNum%2==0)
        {
        	System.out.println("Your number is even.");
        }

        if(userNum%2!=0)
        {
        	System.out.println("Your number is odd");
        }





	}
}