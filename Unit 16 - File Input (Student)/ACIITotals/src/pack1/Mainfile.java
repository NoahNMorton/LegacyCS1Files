package pack1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Mainfile {
    public static void main(String[] args) throws Exception {
        Scanner inF = new Scanner(new File("input.txt"));
        ArrayList<Integer> nums = new ArrayList<Integer>();


        while (inF.hasNextLine()) {
            Scanner inFline = new Scanner(inF.nextLine());
            while (inFline.hasNext()) {

                String word = inFline.next();
                nums.add(toAscii(word));
            }
            System.out.println(addTogether(nums) + 64);
            nums.clear();
            System.out.println("\n\n\n");

        }

    }


    public static int toAscii(String s) {
        int finalInt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            long asciiInt = (int) c;
            finalInt += asciiInt;
            //noinspection UnusedAssignment
            asciiInt = 0;
        }


        return finalInt;
    }

    public static int addTogether(ArrayList<Integer> array) {
        int finalSum = 0;
        for (Integer anArray : array) {
            finalSum += anArray;
        }
        return finalSum;
    }


}
