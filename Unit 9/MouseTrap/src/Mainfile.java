import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Noah Morton
 *         Created on: 9/26/2014 , Time is :  12:49 PM
 *         Part of Project: MouseTrap
 */

public class Mainfile {

    public static void main(String[] args)

    {

        ArrayList<Point> walls = new ArrayList<Point>();
        Scanner input = new Scanner(System.in);
        int mx = 4, my = 4, tries = 0;
        char md = '^'; //set facing up
        boolean moveSuccess;

        do {
            do {
                draw(walls, my, mx, md);
                System.out.println(mx + "," + my);
                System.out.println("Please enter a X for the new wall.");
                int x = input.nextInt();
                System.out.println("Please enter an Y for the new wall.");
                int y = input.nextInt();

                tries++;
                if (x != mx || y != my) {
                    walls.add(new Point(x, y)); //adds the new wall to walls
                    break;

                } else {
                    System.out.println("Place invalid, you can't drop a wall on the mouse.");
                }
            } while (true);

            if (walls.size() >= 7) { //remove walls if too large
                walls.remove(0);
            }

            if ((walls.contains(new Point(mx - 1, my)) || mx - 1 < 0) && (walls.contains(new Point(mx + 1, my)) || mx + 1 > 8) && (walls.contains(new Point(mx, my + 1)) || my + 1 > 8) && (walls.contains(new Point(mx, my - 1)) || my - 1 < 0)) {
                System.out.println("Mouse is trapped. You won! It took " + tries + " tries.");
                System.exit(0);
            }

            moveSuccess = false;
            while (!moveSuccess) {
                double randomDouble = Math.random();

                if (md == '^') {

                    if (randomDouble <= .5 && my - 1 > 0 && !walls.contains(new Point(mx, my - 1))) { //move forward
                        my = my - 1;
                        md = '^';
                        moveSuccess = true;
                    } else if (randomDouble <= .7 && mx + 1 < 9 && !walls.contains(new Point(mx + 1, my))) //move right
                    {
                        mx = mx + 1;
                        md = '>';
                        moveSuccess = true;
                    } else if (randomDouble <= .9 && mx - 1 > 0 && !walls.contains(new Point(mx - 1, my))) //move left
                    {
                        mx = mx - 1;
                        md = '<';
                        moveSuccess = true;
                    } else if (randomDouble == 1 && my + 1 < 9 && !walls.contains(new Point(mx, my + 1))) //move back
                    {
                        my = my + 1;
                        md = 'v';
                        moveSuccess = true;
                    }
                } else if (md == '>') {

                    if (randomDouble <= .5 && mx + 1 < 9 && !walls.contains(new Point(mx + 1, my))) { //move forward
                        mx = mx + 1;
                        md = '>';
                        moveSuccess = true;
                    } else if (randomDouble <= .7 && my + 1 < 9 && !walls.contains(new Point(mx, my + 1))) //move right
                    {
                        my = my + 1;
                        md = 'v';
                        moveSuccess = true;
                    } else if (randomDouble <= .9 && my - 1 > 0 && !walls.contains(new Point(mx, my - 1))) //move left
                    {
                        my = my - 1;
                        md = '^';
                        moveSuccess = true;
                    } else if (randomDouble == 1 && mx - 1 > 0 && !walls.contains(new Point(mx - 1, my))) //move back
                    {
                        mx = mx - 1;
                        md = '<';
                        moveSuccess = true;
                    }
                } else if (md == 'v') {

                    if (randomDouble <= .5 && my + 1 < 9 && !walls.contains(new Point(mx, my + 1))) { //move forward
                        my = my + 1;
                        md = 'v';
                        moveSuccess = true;
                    } else if (randomDouble <= .7 && mx - 1 > 0 && !walls.contains(new Point(mx - 1, my))) //move left
                    {
                        mx = mx - 1;
                        md = '<';
                        moveSuccess = true;
                    } else if (randomDouble <= .9 && mx + 1 < 9 && !walls.contains(new Point(mx + 1, my))) //move right
                    {
                        mx = mx - 1;
                        md = '>';
                        moveSuccess = true;
                    } else if (randomDouble == 1 && my - 1 > 0 && !walls.contains(new Point(mx, my - 1))) //move back
                    {
                        my = my - 1;
                        md = '^';
                        moveSuccess = true;
                    }
                } else if (md == '<') {

                    if (randomDouble <= .5 && mx - 1 > 0 && !walls.contains(new Point(mx - 1, my))) { //move forward
                        mx = mx - 1;
                        md = '<';
                        moveSuccess = true;
                    } else if (randomDouble <= .7 && my - 1 > 0 && !walls.contains(new Point(mx, my - 1))) //move right
                    {
                        my = my - 1;
                        md = '^';
                        moveSuccess = true;
                    } else if (randomDouble <= .9 && my + 1 < 9 && !walls.contains(new Point(mx, my + 1))) //move left
                    {
                        my = my + 1;
                        md = 'v';
                        moveSuccess = true;
                    } else if (randomDouble == 1 && mx + 1 < 9 && !walls.contains(new Point(mx + 1, my))) //move back
                    {
                        mx = mx + 1;
                        md = '>';
                        moveSuccess = true;
                    }
                }

            }
            draw(walls, my, mx, md);


        } while (true);

    }

    /**
     * Draws the board.
     *
     * @param walls the walls on the board
     * @param my    the mouse's Y
     * @param mx    the mouse's X
     * @param md    the mouse's facing direction
     */
    public static void draw(ArrayList<Point> walls, int my, int mx, char md) {
        System.out.println("\n\n\n");
        //print board
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {

                if (walls.contains(new Point(x, y))) {
                    System.out.print("W ");
                } else if (my == y && mx == x) {
                    System.out.print(md + " ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.print("\n");
        }
    }


}
