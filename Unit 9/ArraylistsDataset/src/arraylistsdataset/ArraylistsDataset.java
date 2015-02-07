package arraylistsdataset;

//Author: Noah Morton

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Halting code:
 * System.out.println("Enter any letter to continue");
 * halt = HaltS.next();
 * Could be done better, but seems to be only way for now.
 */

class ArraylistsDataset {

    public static void main(String[] args) {

        byte choice;
        int index;
        double arrayTotal = 0;
        double average;
        Integer value;
        String halt;
        Scanner choiceS = new Scanner(System.in);
        Scanner indexS = new Scanner(System.in);
        Scanner valueS = new Scanner(System.in);
        Scanner HaltS = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        do {
            System.out.println("Please enter your choice of what to do.");
            System.out.println("1: Enter values");
            System.out.println("2: Change a value");
            System.out.println("3: Insert a value");
            System.out.println("4: Get index");
            System.out.println("5: Get size");
            System.out.println("6: Print");
            System.out.println("7: Total array");
            System.out.println("8: Average");
            System.out.println("9: Remove value");
            System.out.println("10: Remove location");
            System.out.println("11: Clear all");
            System.out.println("12: Exit");
            choice = choiceS.nextByte();

            //begin work

            if (choice == 1) {
                System.out.println("\n \n \n");
                do {
                    System.out.println("Please enter a value, enter 0 to stop entering.");
                    value = valueS.nextInt();
                    numbers.add(value);
                } while (value != 0);

                System.out.println("[Code] Removing end choice(0) from ArrayList");
                index = numbers.size() - 1;
                numbers.remove(index);
                System.out.println("[Code] Removal Successful.");
            } else if (choice == 2) {
                System.out.println("\n \n \n");
                System.out.println("Please enter an index.");
                index = indexS.nextInt();
                System.out.println("Please enter a value to change it to.");
                value = valueS.nextInt();

                numbers.set(index, value);

            } else if (choice == 3) {
                System.out.println("\n \n \n");
                System.out.println("Please enter an index.");
                index = indexS.nextInt();
                System.out.println("Please enter a value to add.");
                value = valueS.nextInt();

                numbers.add(index, value);
                System.out.println("Added. \n \n \n");

            } else if (choice == 4) {
                System.out.println("\n \n \n");
                System.out.println("Please enter an index.");
                index = indexS.nextInt();
                System.out.println("The value at index: " + index + " is: " + numbers.get(index));
                System.out.println("\n \n \n");
            } else if (choice == 5) {
                System.out.println("\n \n \n");
                System.out.println("The size of the Arraylist is: " + numbers.size());

            } else if (choice == 6) {
                System.out.println("\n \n \n");
                System.out.println("Printing...");
                System.out.println(numbers);
                System.out.println("Enter any letter to continue");
                halt = HaltS.next();
                System.out.println("\n \n \n");

            } else if (choice == 7) {
                System.out.println("\n \n \n");
                System.out.println("Totaling Values...");

                for (int p = 0; p < numbers.size(); p++) {
                    if (p == numbers.size()) {
                        break;
                    }
                    arrayTotal += numbers.get(p);

                }
                System.out.println("The total of the array is: " + arrayTotal);
                System.out.println("Enter any letter to continue");
                halt = HaltS.next();
                System.out.println("\n \n \n");

            } else if (choice == 8) {
                System.out.println("\n \n \n");

                for (int p = 0; p < numbers.size(); p++) {
                    if (p == numbers.size()) {
                        break;
                    }
                    arrayTotal += numbers.get(p);

                }
                average = arrayTotal / numbers.size();
                System.out.println("The average of the list is: " + average);

            } else if (choice == 9) {
                System.out.println("\n \n \n");
                System.out.println("Please enter a value to remove.");
                Integer valuer = valueS.nextInt();
                if (numbers.remove(valuer)) {
                    System.out.println("Remove successful");
                } else {
                    System.out.println("Remove failed");
                }

            } else if (choice == 10) {
                System.out.println("\n \n \n");
                System.out.println("Index to remove at?");
                index = indexS.nextInt();
                if (index > numbers.size() || index < (0)) {
                    System.out.println("Place invalid, skipping...");
                } else {
                    System.out.println(numbers.remove(index));
                }
            } else if (choice == 11) {
                System.out.println("\n \n \n");
                System.out.println("Clearing...");
                numbers.clear();
                System.out.println("Done Clearing.");
            } else if (choice == 12) {
                System.out.println("User has chosen to exit.");
                //end
            }


        } while (choice <= 11);

    }
}
