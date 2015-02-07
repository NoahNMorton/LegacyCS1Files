package selectionsort;

//import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] userArray = new int[10];

        userArray[0] = (int) (Math.random() * 999) + 1;
        userArray[1] = (int) (Math.random() * 999) + 1;
        userArray[2] = (int) (Math.random() * 999) + 1;
        userArray[3] = (int) (Math.random() * 999) + 1;
        userArray[4] = (int) (Math.random() * 999) + 1;
        userArray[5] = (int) (Math.random() * 999) + 1;
        userArray[6] = (int) (Math.random() * 999) + 1;
        userArray[7] = (int) (Math.random() * 999) + 1;
        userArray[8] = (int) (Math.random() * 999) + 1;
        userArray[9] = (int) (Math.random() * 999) + 1;


        for (int i = 0; i < 10; i++) //prints array before sort
        {
            System.out.print(" " + userArray[i]);
        }
        System.out.println("\n");

        //sort (selection)
        System.out.println("Sortification... \n");





        int i, j, first, temp;

        for (i = userArray.length - 1; i > 0; i--) {
            first = 0;
            for (j = 1; j <= i; j++) {
                if (userArray[j] < userArray[first]) {
                    first = j;
                }
            }
            temp = userArray[first];
            userArray[first] = userArray[i];
            userArray[i] = temp;
        }


        //Arrays.sort(userArray, 0, 10);

        for (int l = 0; l < userArray.length; l++) //prints array after sort
        {
            System.out.print(" " + userArray[l]);
        }
        System.out.println("\n");


    }
}
