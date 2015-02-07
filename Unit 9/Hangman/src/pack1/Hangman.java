package pack1;


import java.util.ArrayList;
import java.util.Scanner;

class Hangman {


    public static void main(String[] args) {

        boolean correct =false;
        ArrayList<String> sentences = new ArrayList<String>();
        sentences.add("turtle");
        sentences.add("welcome");
        sentences.add("haberdashery");
        sentences.add("advance");
        sentences.add("sentence");
        sentences.add("love");
        sentences.add("soul");
        sentences.add("computer");
        sentences.add("water");
        sentences.add("fire");

        ArrayList<Character> guessedVowels = new ArrayList<Character>();
        ArrayList<Character> guessedConsonants = new ArrayList<Character>();
        String sentence;
        sentence = sentences.remove((int) (Math.random() * 10)); //picks a random string from list.
        char[] sentenceArray = sentence.toCharArray();
        char letter;
        int guesses = 6;
        Scanner letterS = new Scanner(System.in);
        boolean won = false;
        ArrayList<Character> blanks = new ArrayList<Character>();
        for (int i = 0; i < sentence.length(); i++)
            blanks.add('_');


        do {


            System.out.println("You have " + guesses + " guesses left.");

            //print sentence blanks
            System.out.println(blanks);

            //print guessed vowels
            System.out.println("Guessed Vowels: " + guessedVowels);
            //print guessed consonant
            System.out.println("Guessed Consonants: " + guessedConsonants);

            System.out.println("Guess a letter.");
            letter = letterS.next().charAt(0);


            //vowel detect
            switch (letter) {
                case 'a':
                    guessedVowels.add('a');

                    break;
                case 'e':
                    guessedVowels.add('e');

                    break;
                case 'i':
                    guessedVowels.add('i');

                    break;
                case 'o':
                    guessedVowels.add('o');

                    break;
                case 'u':
                    guessedVowels.add('u');

                    break;
                default:
                    //do nothing
            }
            //consonant detect
            switch (letter) {
                case 'b':
                    guessedConsonants.add('b');

                    break;
                case 'c':
                    guessedConsonants.add('c');

                    break;
                case 'd':
                    guessedConsonants.add('d');

                    break;
                case 'f':
                    guessedConsonants.add('f');

                    break;
                case 'g':
                    guessedConsonants.add('g');

                    break;
                case 'h':
                    guessedConsonants.add('h');

                    break;
                case 'j':
                    guessedConsonants.add('j');

                    break;
                case 'k':
                    guessedConsonants.add('k');

                    break;
                case 'l':
                    guessedConsonants.add('l');

                    break;
                case 'm':
                    guessedConsonants.add('m');

                    break;
                case 'n':
                    guessedConsonants.add('n');

                    break;
                case 'p':
                    guessedConsonants.add('p');

                    break;
                case 'q':
                    guessedConsonants.add('q');

                    break;
                case 'r':
                    guessedConsonants.add('r');

                    break;
                case 's':
                    guessedConsonants.add('s');

                    break;
                case 't':
                    guessedConsonants.add('t');

                    break;
                case 'v':
                    guessedConsonants.add('v');

                    break;
                case 'w':
                    guessedConsonants.add('w');

                    break;
                case 'x':
                    guessedConsonants.add('x');

                    break;
                case 'y':
                    guessedConsonants.add('y');

                    break;
                case 'z':
                    guessedConsonants.add('z');

                    break;
                default:
                    //do nothing
            }

            //test if correct
            correct = false;
            for (int x = 0; x < sentenceArray.length; x++) {
                if (sentenceArray[x] == letter) {
                    blanks.set(x, letter);
                    correct = true;
                }

            }
            if (correct == false) {
                guesses--;
            }
            if (!blanks.contains('_')) //end when word is guessed
            {
                won = true;

            }

            if (guesses <= 0) //exits if you run out of guesses
                break;


        } while (!won);

        if (won) {
            System.out.println("You won! The word was: " + sentence);

        } else {
            System.out.println("Out of guesses.");
        }

    }

}
