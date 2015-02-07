package pack1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        byte choice;
        int first;
        int second;
        final int fibo1 = 0;
        final int fibo2 = 1;

        Scanner choiceS = new Scanner(System.in);
        Scanner intImput = new Scanner(System.in);

        do {

            System.out.println("Please enter what to do.");
            System.out.println("1: Summation ");
            System.out.println("2: Factorial ");
            System.out.println("3: Power ");
            System.out.println("4: Factors ");
            System.out.println("5: Fibonacci ");
            System.out.println("6: Exit");
            choice = choiceS.nextByte();

            if (choice == 1) {
                System.out.println("First int?");
                first = intImput.nextInt();
                System.out.println("Second?");
                second = intImput.nextInt();
                System.out.println(summation(first, second));

            } else if (choice == 2) {
                System.out.println("int?");
                first = intImput.nextInt();
                System.out.println(factorial(first));

            } else if (choice == 3) {
                System.out.println("Base?");
                first = intImput.nextInt();
                System.out.println("Exponent?");
                second = intImput.nextInt();
                System.out.println(power(first, second));
            } else if (choice == 4) {
                System.out.println("First int?");
                first = intImput.nextInt();

                System.out.println(factors(first, 1));
            } else if (choice == 5) {
                System.out.println("Int to check?");
                first = intImput.nextInt();
                System.out.println("The number you entered is " + fibonacci(first, fibo1, fibo2) + " fibonacci.");
            } else if (choice >= 6) {
                System.exit(0);
            }

        } while (true);
    }

    //methods
    private static double summation(int first, int second) {

        if (first == second) {
            return second;
        } else {
            return first + summation(first + 1, second);
        }

    }

    private static double factorial(int num) {

        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);

    }

    private static double power(double base, double exponent) {


        if (exponent == 1)
            return base;

        return base * power(base, exponent - 1);
    }

    private static String factors(int num, int start) {


        if (start == num) {
            return "" + num;
        } else if (num % start == 0) {
            return "" + start + " " + factors(num, start + 1);
        } else {
            return factors(num, start + 1);
        }

    }

    private static boolean fibonacci(int first, int fibo1, int fibo2) {
        if (fibo1 == first) {
            return true;
        } else if (fibo1 > first) {
            return false;
        } else {
            return fibonacci(first, fibo2, fibo2 + fibo1);
        }

    }

}
