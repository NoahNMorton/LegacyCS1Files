package pack1;

import java.io.File;
import java.util.Scanner;

/**
 * @author othscs120
 *         Created on: 11/13/2014 , Time is :  1:26 PM
 *         Part of Project: ClassRoster
 */

public class Mainfile {

    public static void main(String[] args) throws Exception {
        Scanner inF = new Scanner(new File("input.txt"));


        while (inF.hasNextLine()) {
            Scanner fromText= new Scanner(inF.nextLine()).useDelimiter("[ ,]");

            String fname = fromText.next();
            String lname = fromText.next();
            int ID = fromText.nextInt();


            System.out.println(ID + "-" + fname+ lname);


        }


    }


}
