package org.willxu.algorithm.service.integer;

public interface RottingOranges {
    /**
     * You are given an m x n grid where each cell can have one of three
     * values:
     * <p>
     * - 0 representing an empty cell,
     * - 1 representing a fresh orange, or
     * - 2 representing a rotten orange.
     * <p>
     * Every minute, any fresh orange that is 4-directionally adjacent
     * to a rotten orange becomes rotten.
     * <p>
     * Return the minimum number of minutes that must elapse until no
     * cell has a fresh orange. If this is impossible, return -1.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 10
     *             grid[i][j] is 0, 1, or 2.
     */
    int orangesRotting(int[][] grid);
}
