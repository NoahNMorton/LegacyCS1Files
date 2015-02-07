package pack1;

import java.awt.*;
import java.util.Scanner;

class MainFile {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DrawingWindow dw = new DrawingWindow();
        int x1;
        int x2;
        int y1;
        int y2;
        int colorNum;
        int width;
        int height;
        Color col = null;

        do {
            System.out.println("---Menu----");
            System.out.println("1. Add Line");
            System.out.println("2. Add Rectangle");
            System.out.println("3. Add Oval");
            System.out.println("4. Clear");
            System.out.println("0. Exit");
            System.out.println("Enter selection: ");
            int selection = keyboard.nextInt();
            if (selection == 1) {
                System.out.println("Please enter the first x value.");
                x1 = keyboard.nextInt();

                System.out.println("Please enter the first y value.");
                y1 = keyboard.nextInt();

                System.out.println("Please enter the second x value.");
                x2 = keyboard.nextInt();


                System.out.println("Please enter the second y value.");
                y2 = keyboard.nextInt();


                System.out.println("Please enter enter 1 for red, 2 for blue, 3 for green or 4 for a random color ");
                colorNum = keyboard.nextInt();


                if (colorNum == 1) {
                    col = Color.RED;
                } else if (colorNum == 2) {
                    col = Color.BLUE;
                } else if (colorNum == 3) {
                    col = Color.GREEN;
                } else if (colorNum == 4) {

                    col = new Color((int) (Math.random() * 256), ((int) (Math.random() * 256)), ((int) (Math.random() * 256)));
                }


                DrawingLine l = new DrawingLine(x1, y1, x2, y2, col);


                dw.addShape(l);

            } else if (selection == 2) {

                System.out.println("Please enter the  x value.");
                x1 = keyboard.nextInt();

                System.out.println("Please enter the  y value.");
                y1 = keyboard.nextInt();


                System.out.println("Please enter the width.");
                width = keyboard.nextInt();


                System.out.println("Please enter the height.");
                height = keyboard.nextInt();


                System.out.println("Please enter enter 1 for red, 2 for blue, 3 for green or 4 for a random color.");
                colorNum = keyboard.nextInt();

                if (colorNum == 1) {
                    col = Color.RED;
                } else if (colorNum == 2) {
                    col = Color.BLUE;
                } else if (colorNum == 3) {
                    col = Color.GREEN;
                } else if (colorNum == 4) {
                    col = new Color((int) (Math.random() * 256), ((int) (Math.random() * 256)), ((int) (Math.random() * 256)));
                }


                DrawingRectangle b = new DrawingRectangle(x1, y1, width, height, col);


                dw.addShape(b);
            } else if (selection == 3) {

                System.out.println("Please enter the x value.");
                x1 = keyboard.nextInt();

                System.out.println("Please enter the y value.");
                y1 = keyboard.nextInt();


                System.out.println("Please enter the width.");
                width = keyboard.nextInt();


                System.out.println("Please enter the height.");
                height = keyboard.nextInt();

                System.out.println("Please enter enter 1 for red, 2 for blue, 3 for green or 4 for a random color.");
                colorNum = keyboard.nextInt();

                if (colorNum == 1) {
                    col = Color.RED;
                } else if (colorNum == 2) {
                    col = Color.BLUE;
                } else if (colorNum == 3) {
                    col = Color.GREEN;
                } else if (colorNum == 4) {
                    col = new Color((int) (Math.random() * 256), ((int) (Math.random() * 256)), ((int) (Math.random() * 256)));
                }


                DrawingOval f = new DrawingOval(x1, y1, width, height, col);


                dw.addShape(f);
            } else if (selection == 4) {

                dw.clear();
            } else if (selection == 0) {
                System.exit(0);
            }
        } while (true);
    }
}