package board;

import players.*;
import weapons.*;
import objects.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    private int width;
    private int height;
    private List<Player> players;
    private List<Weapon> weapons;
    private List<Tree> trees;
    private Random random;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.players = new ArrayList<>();
        this.weapons = new ArrayList<>();
        this.trees = new ArrayList<>();
        this.random = new Random();
    }

    public void initializeGame() {
        // Adding players
        players.add(new HumanPlayer("Player1", random.nextInt(width), random.nextInt(height)));
        players.add(new RandomPlayer("RandomBot", random.nextInt(width), random.nextInt(height)));
        players.add(new ScanningPlayer("ScannerBot", random.nextInt(width), random.nextInt(height)));
        players.add(new SmartRandomPlayer("SmartBot", random.nextInt(width), random.nextInt(height)));

        // Adding weapons
        weapons.add(new Fireball(random.nextInt(width), random.nextInt(height)));
        weapons.add(new Sword(random.nextInt(width), random.nextInt(height)));
        weapons.add(new MagicRing(random.nextInt(width), random.nextInt(height)));

        // Adding trees
        for (int i = 0; i < 3; i++) {
            trees.add(new Tree(random.nextInt(width), random.nextInt(height)));
        }
    }

    public void playGame() {
        while (players.size() > 1) {
            for (Player player : new ArrayList<>(players)) {
                player.takeTurn(this);
                printBoard();
            }
        }
        System.out.println("Game over! Winner: " + players.get(0).getName());
    }

    public void printBoard() {
        char[][] grid = new char[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = '.';
            }
        }
        for (Player p : players) grid[p.getX()][p.getY()] = 'P';
        for (Weapon w : weapons) grid[w.getX()][w.getY()] = 'W';
        for (Tree t : trees) grid[t.getX()][t.getY()] = 'T';

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
