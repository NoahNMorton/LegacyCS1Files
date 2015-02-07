package primeornot;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        int num;

        Scanner numS = new Scanner(System.in);

        do {
            System.out.println("Please enter a positive number.");
            num = numS.nextInt();
        } while (num < 0);



        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("The number is not prime");
                break;
            } else {
                System.out.println("The number is prime.");
                break;
            }

        }


    }
}
