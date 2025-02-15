package weapons;

public class MagicRing extends Weapon {
    public MagicRing(int x, int y) {
        super("MagicRing", x, y);
    }

    @Override
    public boolean strongerThan(Weapon other) {
        return other instanceof Fireball;
    }
}
