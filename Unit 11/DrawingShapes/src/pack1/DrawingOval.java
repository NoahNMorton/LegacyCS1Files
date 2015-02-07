package pack1;


import java.awt.*;

class DrawingOval {


    // Attributes
    private static int x;
    private static int y;
    private static int width;
    private static int height;
    private static Color colorO;


    // Constructor


    public DrawingOval(int x, int y, int width, int height, Color colorO) {
        DrawingOval.x = x;
        DrawingOval.y = y;
        DrawingOval.width = width;
        DrawingOval.height = height;
        DrawingOval.colorO = colorO;

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

    public Color getColorO() {
        return colorO;
    }

}