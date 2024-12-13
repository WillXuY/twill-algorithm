package org.willxu.algorithm.service.bool;

public interface CheckIfThereIsValidPathInGrid {
    /**
     * You are given an m x n grid. Each cell of grid represents a
     * street. The street of grid[i][j] can be:
     * <p>
     * - 1 which means a street connecting the left cell and the right cell.
     * - 2 which means a street connecting the upper cell and the lower cell.
     * - 3 which means a street connecting the left cell and the lower cell.
     * - 4 which means a street connecting the right cell and the lower cell.
     * - 5 which means a street connecting the left cell and the upper cell.
     * - 6 which means a street connecting the right cell and the upper cell.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 300
     *             1 <= grid[i][j] <= 6
     */
    boolean hasValidPath(int[][] grid);
}
