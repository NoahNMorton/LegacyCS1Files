package pack1;

import java.io.File;
import java.util.Scanner;

/**
 * @author othscs120
 *         Created on: 11/13/2014 , Time is :  1:16 PM
 *         Part of Project: Words
 */

public class Mainfile {

    public static void main(String[] args) throws Exception {
        Scanner inF = new Scanner(new File("input.txt")).useDelimiter("[*%@ ]");

        while (true) {
            try {
                System.out.println(inF.next());
            } catch (Exception e) {
                break;
            }

        }


    }


}
