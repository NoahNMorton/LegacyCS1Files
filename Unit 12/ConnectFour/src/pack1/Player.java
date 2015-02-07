package pack1;

abstract class Player {

    @SuppressWarnings("CanBeFinal")
    private int color;
    @SuppressWarnings("CanBeFinal")
    private String name;

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

    public abstract int move(ConnectFourGame game);


}