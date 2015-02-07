package pack1;


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userSentence;


        System.out.println("Please enter a sentence to convert to Pig Latin.");
        userSentence = input.nextLine();

        System.out.println(convertSentence(userSentence));


    }

//methods

    private static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
                return true;

            case 'e':
                return true;

            case 'i':
                return true;

            case 'o':
                return true;

            case 'u':
                return true;

            default:
                return false;

        }

    } //done


    private static String convertSingleWord(String word) {
        boolean hasVowel = false;

        for (int i = 0; i < word.length(); i++) {

            if (isVowel(word.charAt(i))) {
                hasVowel = true;

            }
        }


        if (isVowel(word.charAt(0))) {
            return word + "way";
        } else if (hasVowel) {
            int vowelLoc;

            for (int i = 0; i < word.length(); i++) {

                if (isVowel(word.charAt(i))) {
                    vowelLoc = i;
                    return word.substring(vowelLoc, word.length()) + word.substring(0, vowelLoc) + "ay";
                }
            }

        } else {
            return word;
        }

        return " ";
    } //done

    private static String convertSentence(String sentence) {
        String convSentence = " ";
        String[] words = sentence.split(" ");

        for (String word : words) {
            convSentence = convSentence + convertSingleWord(word) + " ";

        }

        return convSentence;

    } //done


}



