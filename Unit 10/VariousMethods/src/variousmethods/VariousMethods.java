package variousmethods;

import java.util.ArrayList;
import java.util.Scanner;


public class VariousMethods {

    public static void main(String[] args) {

        byte choice;

        Scanner choiceS = new Scanner(System.in);
        Scanner Imput = new Scanner(System.in);
        boolean exit = false;

        do {

            System.out.println("Please enter your choice.");
            System.out.println("1: Letter Range");
            System.out.println("2: Number Range");
            System.out.println("3: Time to Min");
            System.out.println("4: Number to text");
            System.out.println("5: Maker's Favorites");
            System.out.println("6: Exit");
            choice = choiceS.nextByte();

            if (choice == 1) {
                System.out.println("Please enter two chars");
                char char1 = Imput.next().charAt(0);
                System.out.println("Next?");
                char char2 = Imput.next().charAt(0);

                System.out.println(letterRange(char1, char2));
            } else if (choice == 2) {
                System.out.println("Please enter two integers.");
                int int1 = Imput.nextInt();
                System.out.println("Next?");
                int int2 = Imput.nextInt();

                System.out.println(numberRange(int1, int2));
            } else if (choice == 3) {
                System.out.println("Please enter the hours");
                int int1 = Imput.nextInt();
                System.out.println("minutes?");
                int int2 = Imput.nextInt();

                System.out.println(timeMin(int1, int2));
            } else if (choice == 4) {
                System.out.println("Please enter a single digit number to convert");
                int int1 = Imput.nextInt();
                System.out.println(numText(int1));
            } else if (choice == 5) {
                makeFav();

            } else if (choice >= 6) {
                exit = true;
            }

        } while (!exit);

    }
    //methods go here  


    private static String letterRange(char b, char a) {
        String finalString = "";
        if (a < b) {
            return "Error: End cannot be smaller than start.";
        }
        for (; b < a; b++) {
            finalString += b;
        }

        return finalString;
    } //choice 1

    private static ArrayList numberRange(int int1, int int2) //choice 2
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int p = int1; p <= int2; p++) {
            nums.add(p);
        }


        return nums;
    }


    private static int timeMin(int h, int m) //choice 3
    {
        int mins = (h * 60) + m;

        return mins;
    }

    private static String numText(int num) //choice 4
    {
        String retString = " ";
        if (num == 1)
            retString = "one";
        if (num == 2)
            retString = "two";
        if (num == 3)
            retString = "three";
        if (num == 4)
            retString = "four";
        if (num == 5)
            retString = "five";
        if (num == 6)
            retString = "six";
        if (num == 7)
            retString = "seven";
        if (num == 8)
            retString = "eight";
        if (num == 9)
            retString = "nine";

        return retString;
    }

    private static void makeFav()  //choice 5
    {
        //food game movie song sport
        System.out.println("My favorite food is: Cookies");
        System.out.println("My favorite game is: Minecraft");
        System.out.println("My favorite movie is: Monte Python");
        System.out.println("My favorite song is: Feint & Boyinaband - Time Bomb");
        System.out.println("My favorite sport is: Golf");


    }

}
