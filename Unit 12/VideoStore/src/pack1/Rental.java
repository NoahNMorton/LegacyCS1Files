package pack1;


public class Rental {

    public static final int G = 0;
    public static final int PG = 1;
    public static final int PG13 = 2;
    public static final int R = 3;

    public String title;
    public double cost;
    public int rating;
    public boolean rented;

    //constructor
    public Rental(String title, double cost, int rating) {
        this.title = title;
        this.cost = cost;
        this.rating = rating;
        rented = false;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public int getRating() {
        return rating;
    }

    public boolean getRented() {
        return rented;
    }

    @Override
    public String toString() {
        return ": Title: " + title + " Cost: $" + cost + " Rating: " + rating;

    }
}
