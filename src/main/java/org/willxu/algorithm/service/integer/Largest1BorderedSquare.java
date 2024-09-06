package org.willxu.algorithm.service.integer;

public interface Largest1BorderedSquare {
    /**
     * Given a 2D grid of 0s and 1s, return the number of elements in
     * the largest square subgrid that has all 1s on its border, or 0 if
     * such a subgrid doesn't exist in the grid.
     *
     * @param grid 1 <= grid.length <= 100
     *             1 <= grid[0].length <= 100
     *             grid[i][j] is 0 or 1
     */
    int largest1BorderedSquare(int[][] grid);
}
