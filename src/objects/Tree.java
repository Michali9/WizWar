package objects;

import game.GameObjectInterface;

public class Tree implements GameObjectInterface {
    private int x, y;

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}