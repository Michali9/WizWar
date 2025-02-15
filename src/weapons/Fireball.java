package weapons;

public class Fireball extends Weapon {
    public Fireball(int x, int y) {
        super("Fireball", x, y);
    }

    @Override
    public boolean strongerThan(Weapon other) {
        return other instanceof Sword;
    }
}