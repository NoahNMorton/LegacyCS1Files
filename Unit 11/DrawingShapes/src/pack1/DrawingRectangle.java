package pack1;

import java.awt.*;

class DrawingRectangle {


    // Attributes
    private static int x;
    private static int y;
    private static int width;
    private static int height;
    private static Color colorR;

    // Constructor


    public DrawingRectangle(int x, int y, int width, int height, Color colorR) {
        DrawingRectangle.x = x;
        DrawingRectangle.y = y;
        DrawingRectangle.width = width;
        DrawingRectangle.height = height;
        DrawingRectangle.colorR = colorR;

    }

    // Accessors


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColorR() {
        return colorR;
    }


}