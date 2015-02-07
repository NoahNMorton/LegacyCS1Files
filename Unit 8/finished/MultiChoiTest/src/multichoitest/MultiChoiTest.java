package multichoitest;

import java.util.Scanner;

public class MultiChoiTest {

    public static void main(String[] args) {

        char[] studentAns = new char[10];
        char[] correctAns = {'a', 'a', 'b', 'c', 'a', 'b', 'c', 'b', 'a', 'c'};
        String[] ques = {"What is the color of the sky?", "What is the first day of the week?", "When is Christmas?", "What is 10 plus 2?", "How do you spell false?", "What is a String variable?", "The sun sets in what direction?", "What is EDM?", "Is this a Quiz, or a Test?", "Is this the last question?"};
        Scanner ansS = new Scanner(System.in);
        int score = 0;

        char an1;
        char an2;
        char an3;
        char an4;
        char an5;
        char an6;
        char an7;
        char an8;
        char an9;
        char an10;

        System.out.println(ques[0]); //1 A
        System.out.println("A. Blue");
        System.out.println("B. Yellow");
        System.out.println("C. Orange");
        an1 = ansS.next().charAt(0);
        studentAns[0] = an1;

        System.out.println(ques[1]);  //2 A
        System.out.println("A. Sunday");
        System.out.println("B. Wednesday");
        System.out.println("C. Tuesday");
        an2 = ansS.next().charAt(0);
        studentAns[1] = an2;

        System.out.println(ques[2]); //3 B
        System.out.println("A. January");
        System.out.println("B. December");
        System.out.println("C. May");
        an3 = ansS.next().charAt(0);
        studentAns[2] = an3;

        System.out.println(ques[3]); //4 C
        System.out.println("A. 8");
        System.out.println("B. Fish");
        System.out.println("C. 12");
        an4 = ansS.next().charAt(0);
        studentAns[3] = an4;

        System.out.println(ques[4]); //5 A
        System.out.println("A. False");
        System.out.println("B. Flase");
        System.out.println("C. no");
        an5 = ansS.next().charAt(0);
        studentAns[4] = an5;

        System.out.println(ques[5]); //6 B
        System.out.println("A. A variable.");
        System.out.println("B. A variable that holds many chars");
        System.out.println("C. Orange");
        an6 = ansS.next().charAt(0);
        studentAns[5] = an6;

        System.out.println(ques[6]); //7 C
        System.out.println("A. North");
        System.out.println("B. Left");
        System.out.println("C. Trick question. It doesn't move.");
        an7 = ansS.next().charAt(0);
        studentAns[6] = an7;

        System.out.println(ques[7]); //8 B
        System.out.println("A. Edible Dutch Masterpieces");
        System.out.println("B. Electronic Dance Music");
        System.out.println("C. Extremely Dreadful Museums");
        an8 = ansS.next().charAt(0);
        studentAns[7] = an8;

        System.out.println(ques[8]); //9 A
        System.out.println("A. Test");
        System.out.println("B. Quiz");
        System.out.println("C. Assessment");
        an9 = ansS.next().charAt(0);
        studentAns[8] = an9;

        System.out.println(ques[9]); //10 C
        System.out.println("A. Perhaps, depends on the day.");
        System.out.println("B. No.");
        System.out.println("C. Yes");
        an10 = ansS.next().charAt(0);
        studentAns[9] = an10;

        //If storm

        if (studentAns[0] == correctAns[0]) {
            score++;
        }

        if (studentAns[1] == correctAns[1]) {
            score++;
        }

        if (studentAns[2] == correctAns[2]) {
            score++;
        }

        if (studentAns[3] == correctAns[3]) {
            score++;
        }

        if (studentAns[4] == correctAns[4]) {
            score++;
        }

        if (studentAns[5] == correctAns[5]) {
            score++;
        }

        if (studentAns[6] == correctAns[6]) {
            score++;
        }

        if (studentAns[7] == correctAns[7]) {
            score++;
        }

        if (studentAns[8] == correctAns[8]) {
            score++;
        }

        if (studentAns[9] == correctAns[9]) {
            score++;
        }
        score = score * 10;

        System.out.println("Your Score was a " + score);

        if (score >= 90) {
            System.out.println("You got an A.");
        } else if (score >= 80) {
            System.out.println("You got a B.");
        } else if (score >= 70) {
            System.out.println("You got a C.");
        } else if (score >= 60) {
            System.out.println("You got a D.");
        } else if (score <= 59) {
            System.out.println("You failed, with an F.");
        }

    }
}
