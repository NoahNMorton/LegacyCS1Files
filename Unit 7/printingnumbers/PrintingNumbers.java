package printingnumbers;

import java.util.Scanner;

public class PrintingNumbers {

    public static void main(String[] args) {
        int numbers;
        byte choice;
        Scanner numS = new Scanner(System.in);
        Scanner choiceS = new Scanner(System.in);

        System.out.println("Please enter your choice.");
        System.out.println("1 for ascending order, 2 for decending, and 3 for random numbers.");
        choice = choiceS.nextByte();

        System.out.println("How many numbers?");
        numbers = numS.nextInt();

        if (choice == 1) {
            for (int i = 1; i <= numbers; i++) {
                System.out.println(i);
            }
        } else if (choice == 2) {
            for (int l = numbers; l >= 1; l--) {
                System.out.println(l);
            }
        } else if (choice == 3) {
            for (int t = 1; t <= numbers; t++) {
                System.out.println(Math.random() * 100000);
            }



        }







    }
}
