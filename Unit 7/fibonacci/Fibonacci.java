package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int UserNum;
        boolean isFibo;
        Scanner numS = new Scanner(System.in);

        do {
            System.out.println("Please enter a positive number.");
            UserNum = numS.nextInt();
        } while (UserNum < 0);

        isFibo = UserNum == ((UserNum - 1) + (UserNum - 2));

        if (isFibo == true) {
            System.out.println("The entered number, " + UserNum + ", Is Fibonacci.");
        } else {
            System.out.println("The entered number, " + UserNum + ", Is not Fibonacci.");
        }





    }
}
