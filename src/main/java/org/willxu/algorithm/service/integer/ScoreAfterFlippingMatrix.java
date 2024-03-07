package org.willxu.algorithm.service.integer;

public interface ScoreAfterFlippingMatrix {
    /**
     * You are given an m x n binary matrix grid.
     * <p>
     * A move consists of choosing any row or column and toggling each
     * value in that row or column (i.e., changing all 0's to 1's, and
     * all 1's to 0's).
     * <p>
     * Every row of the matrix is interpreted as a binary number, and
     * the score of the matrix is the sum of these numbers.
     * <p>
     * Return the highest possible score after making any number of
     * moves (including zero moves).
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 20
     *             grid[i][j] is either 0 or 1.
     */
    int matrixScore(int[][] grid);
}
