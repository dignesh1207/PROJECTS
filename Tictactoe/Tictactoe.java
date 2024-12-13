package TICTACTOE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tictactoe {

    public static boolean player = true;

    // Lists to store player moves
    private static List<Integer> movesX = new ArrayList<>();
    private static List<Integer> movesO = new ArrayList<>();

    // Winning combinations
    private static final List<List<Integer>> WINNING_COMBINATIONS = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9),
            Arrays.asList(1, 4, 7),
            Arrays.asList(2, 5, 8),
            Arrays.asList(3, 6, 9),
            Arrays.asList(1, 5, 9),
            Arrays.asList(3, 5, 7)
    );

    // Alternate player turns
    public static String turn() {
        // Return the symbol of the current player and then toggle the player
        if (player) {
            player = false;
            return "X";
        } else {
            player = true;
            return "O";
        }
    }

    // Add move to the respective player's list
    public static void addMove(int num) {
        if (!player) { // Player is "X"
            movesX.add(num);
        } else { // Player is "O"
            movesO.add(num);
        }
    }

    // Check for a winner
    public static String checkWinner() {
        for (List<Integer> combination : WINNING_COMBINATIONS) {
            if (movesX.containsAll(combination)) {
                return "X";
            } else if (movesO.containsAll(combination)) {
                return "O";
            }
        }
        return null; // No winner yet
    }

    // Check for a draw
    public static boolean isDraw() {
        return movesX.size() + movesO.size() >= 9 && checkWinner() == null;
    }

    // Reset the game state
    public static void reset() {
        movesX.clear();
        movesO.clear();
        player = true;
    }
}
