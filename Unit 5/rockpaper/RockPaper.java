import java.util.Scanner;

public class RockPaper
{
	public static void main(String[] args)
	{


		//the user will enter 1 for 1, 2 for 2, or 3 for 3, 4 for 4 and 5 for 5.

		int user=0;
		int com=0;
		//final int 1 = 1;
		//final int 2 = 2;
        //final int 3 = 3;
        //final int 4 = 4;
        //final int 5 = 5;

		boolean comwin;
		boolean userwin;

		Scanner userS = new Scanner(System.in);



		System.out.println("Please enter your choice. Enter 1 for paper, 2 for scissors, or 3 for rock, 4 for lizard and 5 for spock");
		user = userS.nextInt();

		com = (int)(Math.random()*5);
		if(com==0)
		{
		com=1;
		}
		
		if(com==user)
		{
			System.out.println("It's a tie!"); 
		}

		if(user==1 && com==3) //user wins
		{
			comwin=false;
			userwin=true;
        }
		if(user==1 && com==2) //com wins 
		{
			comwin=true;
			userwin=false;
        }

		if(user==1 && com==4)  //com win
		{
			comwin=true;
			userwin=false;
        }

		if(user==1 && com==5) //user wins
		{
			comwin=true;
			userwin=true;
		}

		if(user==2 && com==1) //user wins
		{
			comwin=false;
			userwin=true;
        }

		if(user==2 && com==3) //user wins
		{
			userwin=true;
			comwin=false;
		}

		if(user==2 && com==4) //user wins
		{
			comwin=false;
			userwin=true;
		}

		if(user==2 && com==5) //com wins
		{
			userwin=false;
			comwin=true;
		}

		if(user==3 && com==1) //com wins
		{
			comwin=true;
			userwin=false;
		}

		if(user==3 && com==2) //user wins
		{
			userwin=true;
			comwin=false;
		}

		if(user==3 && com==4) //user wins
		{
			userwin=true;
			comwin=false;
		}

		if(user==3 && com==5) //com wins
		{
			comwin=true;
			userwin=false;
		}

		if(user==4 && com==1) //user win
		{
			userwin=true;
			comwin=false;
		}

		if(user==4 && com==2) //com win
		{
			comwin=true;
			userwin=false;
		}

		if(user==4 && com==3) //com win
		{
			comwin=true;
			userwin=false;
		}

		if(user==4 && com==5) //user win
		{
			userwin=true;
			comwin=false;
		}

		if(user==5 && com==1) //com wins
		{
			comwin=true;
			userwin=false;
		}

		if(user==5 && com==2) //user wins
		{
			comwin=false;
			userwin=true;
		}

		if(user==5 && com==3) //user wins
		{
			comwin=false;
			userwin=true;
		}

		if(user==5 && com==4) //com wins
		{
			comwin=true;
			userwin=false;
		}

		if(userwin=true)
		{
			System.out.println("The user has won.");
		}
		else
		{
			System.out.println("The computer has won.");
		}
		System.out.println("Com choice was "+com);
	}
}