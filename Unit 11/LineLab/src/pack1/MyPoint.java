package pack1;


public class MyPoint {

    private double x;
    private double y;

    //constructor
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;

    }

    //accessors
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {

        return "(" + x + "," + y + ")";

    }


}


