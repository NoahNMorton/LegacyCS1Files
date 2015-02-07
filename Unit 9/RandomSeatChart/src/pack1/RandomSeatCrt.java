package pack1;
//Author: Noah Morton

import java.util.ArrayList;
import java.util.Scanner;

/**
 * take a value in the seats, remove it, then set a student to that seat.
 * print out the seat and the student to sit there.
 * use Math.random times the size of the seats ArrayList.
 */

class RandomSeatCrt {

    public static void main(String[] args) {

        String stuName;
        ArrayList<Integer> seats = new ArrayList<Integer>();
        int numSeats;
        String student;
        int seat;
        Scanner nameS = new Scanner(System.in);
        Scanner seatS = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<String>();

        do {
            System.out.println("Please enter a name, enter Done to stop entering.");
            stuName = nameS.next();
            students.add(stuName);
        } while (!stuName.equals("Done"));

        System.out.println("[Code] Removing name Done from ArrayList");
        students.remove("Done");
        System.out.println("[Code] Removal Successful.");

        System.out.println("How many seats in your class?");
        numSeats = seatS.nextInt();
        numSeats++;

        if (students.size() > numSeats) {
            System.out.println("Error Not enough seats.");
        } else {

            for (int p = 1; p < numSeats; p++)
                seats.add(p);

            do {
                seat = seats.remove(((int) (Math.random() * seats.size())));

                student = students.remove(((int) (Math.random() * students.size())));

                System.out.println("Student " + student + " sits at " + seat);
            } while (!students.isEmpty());


        }

    }

}
