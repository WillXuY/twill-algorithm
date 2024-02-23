package org.willxu.algorithm.service.integer;

public interface MagicSquaresInGrid {
    /**
     * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers
     * from 1 to 9 such that each row, column, and both diagonals all
     * have the same sum.
     * <p>
     * Given a row x col grid of integers, how many 3 x 3 "magic square"
     * subgrids are there?  (Each subgrid is contiguous).
     *
     * @param grid row == grid.length
     *             col == grid[i].length
     *             1 <= row, col <= 10
     *             0 <= grid[i][j] <= 15
     */
    int numMagicSquaresInside(int[][] grid);
}
