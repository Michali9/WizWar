package players;


import board.Board;

public abstract class Player {
    protected int x, y;
    protected String name;

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public abstract void takeTurn(Board board);

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
