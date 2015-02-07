package pack1;


public class Game extends Rental {


    /**
     * @param title           the title of the game
     * @param cost            the cost of the game
     * @param rating          the rating of the game
     * @param platform        the platform of the game
     * @param numberOfPlayers the number of players in the game
     */
    public Game(String title, double cost, int rating, String platform, int numberOfPlayers) {
        super(title, cost, rating);
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
        rented = false;
    }

    String platform;
    int numberOfPlayers;

    String getPlatform() {
        return platform;
    }

    int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + ", Cost: $" + cost + ", Rating: " + rating + ", Platform: " + platform + ", Number of Players: " + numberOfPlayers;
    }


}
