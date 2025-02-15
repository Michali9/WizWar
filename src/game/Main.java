package game;

import board.Board;
import players.*;
import weapons.*;
import objects.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(10, 10);
        board.initializeGame();
        board.playGame();
    }
}