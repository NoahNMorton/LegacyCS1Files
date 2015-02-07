import java.util.Scanner;


public class MixedNum2
{
	public static void main(String[] args)
	{
	    int denum=0;
		int num=0;
        int mixedNum=0;
        int mixedFrac=0;
        boolean numMixed;


		Scanner denumS = new Scanner(System.in);
        Scanner numS = new Scanner(System.in);

		System.out.println("Enter numerator of fraction.");
		num = numS.nextInt();

        System.out.println("Enter denominator of fraction.");
		denum = denumS.nextInt();



		if(num%denum==0)
		{
			numMixed=false;
			mixedNum = num/denum;
		}
        else
        {
        	numMixed=true;
        	mixedFrac = num%denum;
        }

		if(numMixed==true)
		{

		System.out.print("The mixed number derived from " + num);
		System.out.print("/");
		System.out.print(denum);
		System.out.print(" is: "+ mixedNum +" "+mixedFrac+ "/"+denum);
		}
	    else if(numMixed==false)
        {
        System.out.print("The whole number derived from " + num);
		System.out.print("/");
		System.out.print(denum);
		System.out.print(" is: "+ mixedNum);
        }

	}
}

