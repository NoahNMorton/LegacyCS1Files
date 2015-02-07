package mathmenu;

import java.util.Scanner;

public class MathMenu {

    public static void main(String[] args) {

        byte choice;
        double OpNum;
        int power;
        boolean exit = false;
        double answer;
        Scanner choiceS = new Scanner(System.in);
        Scanner opnumS = new Scanner(System.in);
        Scanner powerS = new Scanner(System.in);

        do {
            System.out.println("Please enter the type of math you want to do.");
            System.out.println("1 for square, 2 for power, 3 for square root, and 4 to exit.");
            choice = choiceS.nextByte();
        } while (choice >= 5);

        if (choice == 1) {
            System.out.println("Please enter a number to square.");
            OpNum = opnumS.nextDouble();

            answer = Math.pow(OpNum, 2);
            System.out.println("The answer is: " + answer);
        } else if (choice == 2) {
            System.out.println("Please enter a number to power.");
            OpNum = opnumS.nextDouble();

            System.out.println("Please enter the power.");
            power = powerS.nextInt();

            answer = Math.pow(OpNum, power);
            System.out.println("The answer is: " + answer);
        } else if (choice == 3) {
            System.out.println("Please enter a number to square root.");
            OpNum = opnumS.nextDouble();

            answer = Math.sqrt(OpNum);
            System.out.println("The answer is: " + answer);
        } else {
            System.out.println("User has chosen to exit.");
        }

    }
}
