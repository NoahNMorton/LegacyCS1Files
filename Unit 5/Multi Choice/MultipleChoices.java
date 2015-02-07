
import java.util.Scanner;

public class MultipleChoices {

    
    public static void main(String[] args) {
     Scanner q1S = new Scanner(System.in);
     Scanner q2S = new Scanner(System.in);
     Scanner q3S = new Scanner(System.in);
     Scanner q4S = new Scanner(System.in);
     Scanner q5S = new Scanner(System.in);
     Scanner q6S = new Scanner(System.in);
     Scanner q7S = new Scanner(System.in);
     Scanner q8S = new Scanner(System.in);
     Scanner q9S = new Scanner(System.in);
     Scanner q10S = new Scanner(System.in);
     
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
     
     int score=0;
     char grade=' ';
     
        System.out.println("1. What colour is the sky during the day?");
        System.out.println("A. Blue");
        System.out.println("B. Black");
        System.out.println("C. Orange");
        System.out.println("D. Red");
        an1 = q1S.next().charAt(0);
        
        System.out.println("2. Which is a vegitable?");
        System.out.println("A. Tomato");
        System.out.println("B. Apple");
        System.out.println("C. Orange");
        System.out.println("D. Grape");
        an2 = q2S.next().charAt(0);
     
        System.out.println("3. How is the word false spelled?");
        System.out.println("A. False");
        System.out.println("B. flase");
        System.out.println("C. falseo");
        System.out.println("D. nah");
        an3 = q3S.next().charAt(0);
     
        System.out.println("4. In the solar system, what kind of star is our sun?");
        System.out.println("A. Blue giant");
        System.out.println("B. Yellow");
        System.out.println("C. Red dwarf");
        System.out.println("D. Black hole");
        an4 = q4S.next().charAt(0);
     
        System.out.println("5. What's the best time to wear a striped sweater?");
        System.out.println("A. Never");
        System.out.println("B. Once in a while");
        System.out.println("C. Friday, Friday...");
        System.out.println("D. All the time.");
        an5 = q5S.next().charAt(0);
     
        System.out.println("6. What colour is the sky during the night?");
        System.out.println("A. Blue");
        System.out.println("B. Black");
        System.out.println("C. Orange");
        System.out.println("D. Red");
        an6 = q6S.next().charAt(0);
     
        System.out.println("7. What time does twilight occor?");
        System.out.println("A. In a book, hated by many");
        System.out.println("B. In the evening");
        System.out.println("C. In the morning");
        System.out.println("D. Never");
        an7 = q7S.next().charAt(0);
     
        System.out.println("8. Is the test maker running out of questions?");
        System.out.println("A. Yes.");
        System.out.println("B. Nah, he's good.");
        an8 = q8S.next().charAt(0);
     
        System.out.println("9. Is the cake a lie?");
        System.out.println("A. No, is legit");
        System.out.println("B. What?");
        System.out.println("C. Yes, completely falsified");
        System.out.println("D. Cake? Can i have some?");
        an9 = q9S.next().charAt(0);
     
        System.out.println("10. What was the first question on the test?");
        System.out.println("A. Do turtles exist?");
        System.out.println("B. What colour are blue baboons?");
        System.out.println("C. What colour is the sky during the day?");
        System.out.println("D. There was no first question.");
        an10 = q10S.next().charAt(0);
     
        if(an1=='a')
        {
            score++;
        }
        
        if(an2=='a')
        {
            score++;
        }
        
        if(an3=='a')
        {
            score++;
        }
        
        if(an4=='b')
        {
            score++;
        }
        
        if(an5=='d')
        {
            score++;
        }
        
        if(an6=='b')
        {
            score++;
        }
        if(an7=='b')
        {
            score++;
        }
        
        if(an8=='a')
        {
            score++;
        }
        
        if(an9=='c')
        {
            score++;
        }
        
        if(an10=='c')
        {
            score++;
        }
     
        System.out.println("You scored "+score+" Out of 10.");
        if(score>=9)
        {
            grade='A';
        }
        else if(score==8)
        {
            grade='B';
        }
        else if(score==7)
        {
            grade='C';
        }
        else if(score==6)
        {
            grade='D';
        }
        else if(score<=5)
        {
            grade='F';
        }
        System.out.println("You got a "+grade);
     
     
     
     
     
             
        
        
        
        
        
        
        
    }
}
