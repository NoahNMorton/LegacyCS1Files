import java.util.Scanner;


public class MixedNumber1
{
	public static void main(String[] args)
	{
	    int denum=0;
		int num=0;
        int mixedNum;
        int mixedFrac=0;


		Scanner denumS = new Scanner(System.in);
        Scanner numS = new Scanner(System.in);

		System.out.println("Enter numerator of fraction.");
		num = numS.nextInt();

        System.out.println("Enter denominator of fraction.");
		denum = denumS.nextInt();

		mixedNum = num/denum;
		mixedFrac = num%denum;

		System.out.print("The mixed number derived from " + num);
		System.out.print("/");
		System.out.print(denum);
		System.out.print(" is: "+ mixedNum +" "+mixedFrac+ "/"+denum);

	}
}

