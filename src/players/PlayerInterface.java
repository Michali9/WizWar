package players;

import board.Board;

public interface PlayerInterface {
    String getName();
    char getSymbol();
    void takeTurn(Board board);
}