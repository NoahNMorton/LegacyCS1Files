package pack1;

import java.awt.*;

class DrawingLine {


    // Attributes
    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;
    private static Color colorL;


    // Constructor

    public DrawingLine(int x1, int y1, int x2, int y2, Color colorL) {
        DrawingLine.x1 = x1;
        DrawingLine.x2 = x2;
        DrawingLine.y1 = y1;
        DrawingLine.y2 = y2;
        DrawingLine.colorL = colorL;

    }

    // Accessors


    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public Color getColorL() {
        return colorL;
    }


}