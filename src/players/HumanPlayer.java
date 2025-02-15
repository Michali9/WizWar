package players;

import board.Board;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, int x, int y) {
        super(name, x, y);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void takeTurn(Board board) {
        System.out.println(name + "'s turn. Enter move (U/D/L/R):");
        char move = scanner.next().charAt(0);
        switch (move) {
            case 'U': y--; break;
            case 'D': y++; break;
            case 'L': x--; break;
            case 'R': x++; break;
        }
    }
}