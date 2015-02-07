package pack1;

import java.io.File;
import java.util.Scanner;

/**
 * @author othscs120
 *         Created on: 11/13/2014 , Time is :  12:59 PM
 *         Part of Project: CelciusToFahrenheit
 */

public class Mainfile {

    public static void main(String[] args) throws Exception {
        Scanner inputF = new Scanner(new File("input.txt"));
        int lines = inputF.nextInt();


        for (int i = 0; i < lines; i++) {
            int c = inputF.nextInt();
            int cTemporary = c * 9;
            System.out.println((cTemporary / 5) + 32);
        }


    }


}
