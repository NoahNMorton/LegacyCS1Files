package pack1;


class Line {


    private MyPoint p1;
    private MyPoint p2;
    private double slope;
    private double xInt; //intercepts of line
    private double yInt;


    public Line(MyPoint p1, MyPoint p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public double getSlope() {
        return slope;
    }

    public double getxInt() {
        return xInt;
    }

    public double getyInt() {
        return yInt;
    }

    public String toString() {
        slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

        yInt = p1.getY() - slope * p1.getX();
        xInt = (-yInt) / slope;
        String equation = "y=" + (int) slope + "x+" + (int) yInt;
        return "Point 1: " + p1.toString() + "\nPoint 2: " + p2.toString() + "\nSlope: " + slope + "\nx Intercept: " + xInt + "\ny Intercept: " + yInt + "\nLine equation: " + equation + "\n";
    }
}

