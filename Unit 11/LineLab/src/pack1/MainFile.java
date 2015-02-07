package pack1;

import java.util.Scanner;

class MainFile {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        byte choice, subChoice;
        double num;

        System.out.println("Entering data for Point 1 of line 1...");
        MyPoint p1 = makePoint();
        System.out.println("Entering data for Point 2 of line 1...");
        MyPoint p2 = makePoint();

        Line l1 = new Line(p1, p2);

        System.out.println("Entering data for Point 1 of line 2...");
        MyPoint p3 = makePoint();
        System.out.println("Entering data for Point 2 of line 2...");
        MyPoint p4 = makePoint();

        Line l2 = new Line(p3, p4);

        do {


            System.out.println("Please enter your choice.");
            System.out.println("1: View line 1");
            System.out.println("2: View line 2");
            System.out.println("3: Change line 1");
            System.out.println("4: Change line 2");
            System.out.println("5: View Intersection");
            System.out.println("6: Exit");


            choice = keyboard.nextByte();

            if (choice == 1) {                                                                          /*view line 1*/

                System.out.println(l1.toString());

            } else if (choice == 2) {                                                                   /*view line 2*/
                System.out.println(l2.toString());

            } else if (choice == 3) {                                                                 /*change line 1*/

                System.out.println(l1);
                System.out.println("What do you want to change?");
                System.out.println("1: Change point 1 \n2: Change point 2 \n3: Change Both \n4: Cancel. ");
                subChoice = keyboard.nextByte();

                if (subChoice == 1) { //change first point
                    System.out.println("Please enter the x value for the first point.");

                    p1.setX(keyboard.nextDouble());

                    System.out.println("Please enter the y value for the first point.");
                    p1.setY(keyboard.nextDouble());

                } else if (subChoice == 2) { //change second point

                    System.out.println("Please enter the x value for the second point.");
                    p2.setX(keyboard.nextDouble());

                    System.out.println("Please enter the y value for the second point.");
                    p2.setY(keyboard.nextDouble());

                } else if (subChoice == 3) { //change both
                    System.out.println("Please enter the x value for the first point.");
                    num = keyboard.nextDouble();
                    p1.setX(num);

                    System.out.println("Please enter the y value for the first point.");
                    num = keyboard.nextDouble();
                    p1.setY(num);

                    System.out.println("Please enter the x value for the second point.");
                    num = keyboard.nextDouble();
                    p2.setX(num);

                    System.out.println("Please enter the y value for the second point.");
                    num = keyboard.nextDouble();
                    p2.setY(num);
                } else {
                    System.out.println("Canceling...");
                    //nothing
                }

            } else if (choice == 4) {                                                                 /*change line 2*/
                System.out.println(l2.toString());
                System.out.println("What do you want to change?");
                System.out.println("1: Change point 1 \n2: Change point 2 \n3: Change Both 4: Cancel. ");
                subChoice = keyboard.nextByte();

                if (subChoice == 1) { //change first point
                    System.out.println("Please enter the x value for the first point.");
                    num = keyboard.nextDouble();
                    p3.setX(num);

                    System.out.println("Please enter the y value for the first point.");
                    num = keyboard.nextDouble();
                    p3.setY(num);


                } else if (subChoice == 2) { //change second point

                    System.out.println("Please enter the x value for the second point.");
                    num = keyboard.nextDouble();
                    p4.setX(num);

                    System.out.println("Please enter the y value for the second point.");
                    num = keyboard.nextDouble();
                    p4.setY(num);

                } else if (subChoice == 3) { //change both
                    System.out.println("Please enter the x value for the first point.");
                    num = keyboard.nextDouble();
                    p3.setX(num);

                    System.out.println("Please enter the y value for the first point.");
                    num = keyboard.nextDouble();
                    p3.setY(num);

                    System.out.println("Please enter the x value for the second point.");
                    num = keyboard.nextDouble();
                    p4.setX(num);

                    System.out.println("Please enter the y value for the second point.");
                    num = keyboard.nextDouble();
                    p4.setY(num);

                } else {
                    System.out.println("Canceling...");
                }

            } else if (choice == 5) {                                                             /*view intersection*/

                if (Math.abs(l1.getSlope() - l2.getSlope()) > 0.00000000001) {
                    double xInter = (l2.getyInt() - l1.getyInt()) / (l1.getSlope() - l2.getSlope());
                    double yInter = l1.getSlope() * xInter + l1.getyInt();
                    System.out.println("The two lines intersect at: (" + (int)xInter + "," + (int)yInter + ")");
                } else {
                    System.out.println("These lines do not intersect.");
                }
            } else if (choice == 6) {
                System.exit(0);
            } else {
                System.err.println("Error: Invalid choice.");
            }

        } while (true);

    }

    private static MyPoint makePoint() {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the x value.");
        double x = input.nextDouble();
        System.out.println("Please enter the y value.");
        double y = input.nextDouble();
        return new MyPoint(x, y);

    }


}
