package pack1;

abstract class Player {

    @SuppressWarnings("CanBeFinal")
    private int color; //colour of the player
    @SuppressWarnings("CanBeFinal")
    private String name; //name of the player

    public Player(String name, int color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public abstract int move(ConnectFourGame game); //preform a move of some type


}