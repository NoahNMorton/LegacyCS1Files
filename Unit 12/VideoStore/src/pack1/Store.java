package pack1;

import java.util.ArrayList;

public class Store {
    ArrayList<Video> videos;
    ArrayList<Game> games;

    /**
     * @param videos the videos in the store
     * @param games  the games in the store
     */
    public Store(ArrayList<Video> videos, ArrayList<Game> games) {
        this.videos = videos;
        this.games = games;
    }

    ArrayList<Video> getVideos() {
        return videos;
    }

    ArrayList<Game> getGames() {
        return games;
    }

    public void addGame(Game g) {
        games.add(g);
    }

    public void addVideo(Video v) {
        videos.add(v);
    }

    public int gamesInStock() {
        return games.size();
    }

    public int videosInStock() {
        return videos.size();
    }


}
