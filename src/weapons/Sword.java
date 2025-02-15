package weapons;

public class Sword extends Weapon {
    public Sword(int x, int y) {
        super("Sword", x, y);
    }

    @Override
    public boolean strongerThan(Weapon other) {
        return other instanceof MagicRing;
    }
}