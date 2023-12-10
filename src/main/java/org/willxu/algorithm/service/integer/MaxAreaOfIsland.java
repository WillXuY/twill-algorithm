package org.willxu.algorithm.service.integer;

public interface MaxAreaOfIsland {
    /**
     * You are given an m x n binary matrix grid. An island is a group
     * of 1's (representing land) connected 4-directionally (horizontal
     * or vertical.) You may assume all four edges of the grid are
     * surrounded by water.
     * <p>
     * The area of an island is the number of cells with a value 1 in
     * the island.
     * <p>
     * Return the maximum area of an island in grid. If there is no
     * island, return 0.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 50
     *             grid[i][j] is either 0 or 1.
     */
    int maxAreaOfIsland(int[][] grid);
}
