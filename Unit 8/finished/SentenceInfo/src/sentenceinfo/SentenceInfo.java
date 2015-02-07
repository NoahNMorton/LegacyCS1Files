package sentenceinfo;

import java.util.Scanner;

public class SentenceInfo {

    public static void main(String[] args) {

        String userString;
        Scanner entStringS = new Scanner(System.in);
        //int startLoca;

        System.out.println("Please enter a string.");

        userString = entStringS.nextLine();

        //find num of words
        String[] words = userString.split(" ");
        System.out.println("There are " + words.length + " words in your string.");


        //find chars
        char[] characters = userString.toCharArray();
        int numChar = characters.length;
        System.out.println("There are " + numChar + " characters in your string.");

        //find vowels

        //userString.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < userString.length(); ++i) {
            switch (userString.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
                    //do nothing
            }
        }
        System.out.println("There are " + vowelCount + " Vowels in your string.");

        //find consonants
        //bcdfghjklmnpqrstvwxyz
        int consonantCount = 0;
        for (int i = 0; i < userString.length(); ++i) {
            switch (userString.charAt(i)) {
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':

                    consonantCount++;
                    break;
                default:
                    //do nothing
            }
        }
        System.out.println("There are " + consonantCount + " Consonants in your string.");


    }
}
