package pack1;
/**
 * @author Noah Morton
 * @version 0.0.1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Mainfile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<Game>();
        ArrayList<Video> videos = new ArrayList<Video>();
        ArrayList<Game> rentedGames = new ArrayList<Game>();
        ArrayList<Video> rentedVideos = new ArrayList<Video>();

        //add games and videos
        games.add(new Game("Dark souls 2", 60, Rental.PG13, "Steam/Xbox", 4));
        games.add(new Game("New Super mario bros", 40, Rental.PG, "Wii", 4));
        games.add(new Game("Dota 2", 0, Rental.R, "Steam", 10));
        games.add(new Game("Terraria", 15, Rental.PG, "Steam", 1));
        games.add(new Game("Grand theft auto 5", 40, Rental.R, "Xbox", 1));
        ArrayList<String> actors = new ArrayList<String>();
        actors.add("Thomas");
        actors.add("Robin Williams");
        videos.add(new Video("Thomas the tank engine", 0, Rental.G, "Thomas, the little tank engine that could.", "Michael Bay", actors, 90));

        ArrayList<String> actors1 = new ArrayList<String>();
        actors1.add("Indiana Jones");
        actors1.add("Harrison Ford");
        videos.add(new Video("Indiana Jones ROTLA", 30, Rental.PG13, "A man named Indiana jones raids a lost ark.", "Michael Bay", actors1, 90));

        ArrayList<String> actors2 = new ArrayList<String>();
        actors2.add("Yoda");
        actors2.add("Snoop Dogg");
        videos.add(new Video("Star Wars", 90, Rental.PG13, "Space", "Michael Bay", actors2, 80));

        ArrayList<String> actors3 = new ArrayList<String>();
        actors3.add("Hans solos");
        actors3.add("Han Solo");
        videos.add(new Video("SpaceBalls", 30, Rental.PG, "Spoof of StarWars", "Michael Bay", actors3, 70));

        ArrayList<String> actors4 = new ArrayList<String>();
        actors4.add("Luigi");
        actors4.add("Mario");
        videos.add(new Video("The super mario bros movie", 0, Rental.PG, "The super mario brothers movie", "Michael Bay", actors4, 95));

        Store vs = new Store(videos, games);

        do {
            System.out.println("1. Rent Game \n2. Rent Video \n3. Checkout");
            byte action = input.nextByte();

            if (action == 1) {
                //rent game
                if (vs.gamesInStock() != 0) {
                    System.out.println("Games: -------------");
                    for (int p = 0; p < vs.gamesInStock(); p++) {
                        System.out.println((p + 1) + ":" + vs.getGames().get(p));
                    }

                    System.out.println("Please enter the number of the game you wish to rent. Enter 6 to cancel.");
                    byte rentNum = input.nextByte();
                    rentNum--;
                    if (rentNum != 5) {
                        rentedGames.add(games.get(rentNum));
                        games.remove(rentNum);
                    }
                } else {
                    System.out.println("Out of games.");
                }
            } else if (action == 2) {
                //rent video
                if (vs.videosInStock() != 0) {
                    System.out.println("Videos: ------------");
                    for (int e = 0; e < vs.videosInStock(); e++) {
                        System.out.println((e + 1) + ":" + vs.getVideos().get(e));
                    }
                    System.out.println("Please enter the number of the video you wish to rent. Enter 6 to cancel.");
                    byte rentNum = input.nextByte();
                    rentNum--;
                    if (rentNum != 5) {
                        rentedVideos.add(videos.get(rentNum));
                        videos.remove(rentNum);
                    }
                } else {
                    System.out.println("Out of videos");
                }
            } else if (action == 3) {
                //checkout
                double subTotal = 0;

                for (Game rentedGame : rentedGames) {
                    subTotal += rentedGame.getCost();
                }

                for (Video rentedVideo : rentedVideos) {
                    subTotal += rentedVideo.getCost();
                }
                //print arrays
                for (Game rentedGame : rentedGames) {
                    System.out.println("Rented Game: " + rentedGame.getTitle() + ", Cost: " + rentedGame.getCost());

                }
                for (Video rentedVideo : rentedVideos) {
                    System.out.println("Rented Video: " + rentedVideo.getTitle() + ", Cost: " + rentedVideo.getCost());

                }
                //get subtotal
                System.out.println("Subtotal: $" + subTotal);
                double tax = (subTotal * 0.0825); //tax in texas is 8.25%
                double finalTotal = subTotal + tax;
                System.out.println("Tax: $" + tax);
                System.out.println("Final Total: $" + finalTotal);
                System.exit(0);
            }

        } while (true);

    }


}
