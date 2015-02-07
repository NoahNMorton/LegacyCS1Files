import java.util.Scanner;




public class HelloUser
{
	public static void main(String[] args)
	{
		String name;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your name please.");
		name = a.next();
		System.out.println("Hello, " + name);
		
	}
}