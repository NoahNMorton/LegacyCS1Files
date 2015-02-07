package gradeavgv2;

import java.util.Scanner;

public class GradeAvgV2 {

    public static void main(String[] args) {
        int gradesAmt;
        double gradeSum=0;
        double finalGrade;
        Scanner entGrade = new Scanner(System.in);
        Scanner gradesS = new Scanner(System.in);

        System.out.println("How many grades?");
        gradesAmt = gradesS.nextInt();
        double[] grades = new double[100]; 

        for (int i = 0; i < gradesAmt; i++) {
            System.out.println("Please enter the grades.");
            grades[i] = entGrade.nextInt();
        }

        for(double x: grades)
        {
            gradeSum+=x;
        }
        
        
        

        finalGrade = gradeSum / gradesAmt; //Math possibly incorrect

        if (finalGrade >= 90) {
            System.out.println("Final average is: " + finalGrade);
            System.out.println("Grade is an A.");
        } else if (finalGrade >= 80) {
            System.out.println("Final average is: " + finalGrade);
            System.out.println("Grade is a B.");
        } else if (finalGrade >= 70) {
            System.out.println("Final average is: " + finalGrade);
            System.out.println("Grade is a C.");
        } else if (finalGrade >= 60) {
            System.out.println("Final average is: " + finalGrade);
            System.out.println("Grade is a D.");
        } else if (finalGrade <= 60) {
            System.out.println("Final average is: " + finalGrade);
            System.out.println("Grade is an F.");
        }


    }
}
