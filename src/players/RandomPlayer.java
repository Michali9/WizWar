package players;

import board.Board;
import java.util.Random;

public class RandomPlayer extends Player {
    private Random random;

    public RandomPlayer(String name, int x, int y) {
        super(name, x, y);
        this.random = new Random();
    }

    @Override
    public void takeTurn(Board board) {
        int move = random.nextInt(4);
        switch (move) {
            case 0: y--; break;
            case 1: y++; break;
            case 2: x--; break;
            case 3: x++; break;
        }
    }
}