package weapons;

public abstract class Weapon {
    protected int x, y;
    protected String type;

    public Weapon(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public abstract boolean strongerThan(Weapon other);
}