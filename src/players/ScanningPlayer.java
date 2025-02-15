package players;

import board.Board;

public class ScanningPlayer extends Player {
    private int direction = 1; // 1 for right, -1 for left

    public ScanningPlayer(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void takeTurn(Board board) {
        if (x + direction < 0 || x + direction >= 10) {
            direction *= -1;
        }
        x += direction;
    }
}