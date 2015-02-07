package guessinggame;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        //System.out.println(Math.random()*1000);
        int num;
        int timesGuessed = 0;


        int comNum = (int) (Math.random() * 1000);
        System.out.println(comNum);


        Scanner numS = new Scanner(System.in);

        do {
            System.out.println("Please try to guess my number, 1-1000.");
            num = numS.nextInt();

            if (num > comNum) {
                System.out.println("Too high!");
            } else if (num < comNum) {
                System.out.println("Too low!");
            }

            timesGuessed++;
        } while (num != comNum);

        System.out.println("You guessed correctly! It was: " + comNum);
        System.out.println("You guessed " + timesGuessed + " times.");


    }
}
