package multiples;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        int num;
        Scanner numS = new Scanner(System.in);
        Scanner multS = new Scanner(System.in);
        int mult;

        System.out.println("Please enter a number");
        num = numS.nextInt();

        System.out.println("How many multiples?");
        mult = multS.nextInt();

        System.out.println("Multiples: ");
        for (int i = 1; i <= mult; i++) {
            System.out.println(num * i);
        }








    }
}
