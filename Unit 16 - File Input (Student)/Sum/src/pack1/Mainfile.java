package pack1;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Mainfile {

    public static void main(String[] args) throws Exception {
        Scanner inF = new Scanner(new File("input.txt"));
        double finalTotal = 0;
        ArrayList<Double> total = new ArrayList<Double>();
        while (inF.hasNextLine()) {
            Scanner inT = new Scanner(inF.nextLine()).useDelimiter("[,]");
            while (inT.hasNextDouble()) { //adds data from the file
                total.add(inT.nextDouble());

            }
            while (total.size() != 0) { //adds the values to finalTotal
                finalTotal += total.remove(0);

            }

            total.clear();
            System.out.println(finalTotal);
            finalTotal=0;

        }

    }
}






