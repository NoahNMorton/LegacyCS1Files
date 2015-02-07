package dataset;

import java.util.Scanner;

public class DataSet {

    public static void main(String[] args) {

        byte choice;

        int[] userArray = new int[10];

        int index;
        int valChange;
        int arrayTotal = 0;
        double arrayAvg;
        int arrayMax = 0;
        int arrayMin = 0;

        Scanner choiceS = new Scanner(System.in);
        Scanner valCS = new Scanner(System.in);
        Scanner indexS = new Scanner(System.in);

        do {
            for (int r = 0; r < 11; r++) { //find min
                if (r == 10) {
                    break;
                }
                if (userArray[r] < arrayMin) {
                    arrayMin = userArray[r];
                }
            }

            for (int w = 0; w < 11; w++) { //find max
                if (w == 10) {
                    break;
                }

                if (userArray[w] > arrayMax) {
                    arrayMax = userArray[w];
                }
            }

            System.out.println("What do you want to do? 1:Reassign Array, 2:Change element, 3:Print array,"
                    + " 4:Total array, 5:Average, 6:Max, 7:Min, Or 8 to exit.");
            choice = choiceS.nextByte();

            if (choice == 1) //change entire array
            {
                for (int i = 0; i < 11; i++) {
                    if (i == 10) {
                        break;
                    }
                    System.out.println("Please enter the new value.");
                    userArray[i] = valCS.nextInt();
					arrayMin=userArray[i];
                }
                
            } else if (choice == 2) //change single element 
            {
                System.out.println("Which element?");
                index = indexS.nextInt();
                System.out.println("New Value?");
                valChange = valCS.nextInt();
                userArray[index] = valChange;
            } else if (choice == 3) //print Array 
            {
                System.out.println("Printing Array...");
                for (int t = 0; t < 11; t++) {
                    if (t == 10) {
                        break;
                    }
                    System.out.println(userArray[t]);

                }
            } else if (choice == 4) //Total array  
            {
                for (int p = 0; p < 11; p++) {
                    if (p == 10) {
                        break;
                    }
                    arrayTotal += userArray[p];
                }
                System.out.println("The total of the array is: " + arrayTotal);
                arrayTotal = 0;

            } else if (choice == 5) //average array
            {
                arrayAvg = (userArray[0] + userArray[1] + userArray[2] + userArray[3] + userArray[4] + userArray[5] + userArray[6] + userArray[7] + userArray[8] + userArray[9]) / 10.0;
                System.out.println("The average of the array is: " + arrayAvg);
            } else if (choice == 6) //max array
            {

                System.out.println("The max of the array is: " + arrayMax);
            } else if (choice == 7) { //min array

                System.out.println("The min of this array is: " + arrayMin);
            } else {
                System.out.println("User has chosen to exit.");
            }

        } while (choice <= 7);



        }
    }

