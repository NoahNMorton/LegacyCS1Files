package pack1;

import java.util.ArrayList;

public class Video extends Rental {

    String description, director;
    ArrayList<String> leadingActors;
    int minutes;


    /**
     * @param title         the title of the video
     * @param cost          the cost of the video
     * @param rating        the rating of the video
     * @param description   the description of the video
     * @param director      the director of the video
     * @param leadingActors the leading actors in the video
     * @param minutes       the minutes of the video
     */
    public Video(String title, double cost, int rating, String description, String director, ArrayList<String> leadingActors, int minutes) {
        super(title, cost, rating);
        this.description = description;
        this.director = director;
        this.leadingActors = leadingActors;
        this.minutes = minutes;
        rented = false;
    }

    String getDescription() {
        return description;
    }

    String getDirector() {
        return director;
    }

    ArrayList<String> getLeadingActors() {
        return leadingActors;
    }

    int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {

        return "\nTitle: " + title + ", Cost: $" + cost + ", Rating: " + rating + ", Description: " + description + ", Director: " + director + ", Leading Actors: "
                + leadingActors + ", Minutes: " + minutes;
    }
}
