import java.util.* ;
import java.io.*; 

public class Solution {

    // Directions the knight can move
    private static final int[][] MOVES = {
        {-2, 1}, {-1, 2}, {1, 2}, {2, 1},
        {2, -1}, {1, -2}, {-1, -2}, {-2, -1}
    };

    // Check if a position is valid on the board
    public static boolean isValid(int ni, int nj, int n) {
        return ni >= 0 && nj >= 0 && ni < n && nj < n;
    }

    public static double knightProbability(int n, int k, int r, int c) {
        double[][] curr = new double[n][n];
        double[][] next = new double[n][n];
        curr[r][c] = 1;

        for (int m = 1; m <= k; m++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (curr[i][j] != 0) {
                        for (int[] move : MOVES) {
                            int ni = i + move[0];
                            int nj = j + move[1];
                            if (isValid(ni, nj, n)) {
                                next[ni][nj] += curr[i][j] / 8.0;
                            }
                        }
                    }
                }
            }
            curr = next;
            next = new double[n][n];
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += curr[i][j];
            }
        }
        return sum;
    }
}
