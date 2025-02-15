package players;

import board.Board;
import java.util.Random;

public class SmartRandomPlayer extends Player {
    private Random random;

    public SmartRandomPlayer(String name, int x, int y) {
        super(name, x, y);
        this.random = new Random();
    }

    @Override
    public void takeTurn(Board board) {
        // Simple AI: prefers to move towards weapons if possible
        // For now, just move randomly like RandomPlayer
        int move = random.nextInt(4);
        switch (move) {
            case 0: y--; break;
            case 1: y++; break;
            case 2: x--; break;
            case 3: x++; break;
        }
    }
}