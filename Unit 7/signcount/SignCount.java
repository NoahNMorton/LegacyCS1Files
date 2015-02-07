package signcount;

import java.util.Scanner;

public class SignCount {

    public static void main(String[] args) {

        int neqVals = 0;
        int posVals = 0;
        int num;
        Scanner numS = new Scanner(System.in);

        do {
            System.out.println("Please enter a number. Enter 0 to count.");
            num = numS.nextInt();

            if (num < 0) {
                neqVals++;
            } else {
                posVals++;
            }

        } while (num != 0);

        posVals--;
        System.out.println("You entered "+posVals+" positive values and "+neqVals+" Negative values." );





    }
}
