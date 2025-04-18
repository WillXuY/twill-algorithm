package leetcode.p1200_1299.p1260_shift2d_grid;

import java.util.List;

public interface Shift2dGrid {
    /**
     * Given a 2D grid of size m x n and an integer k. You need to shift
     * the grid k times.
     * In one shift operation:
     * - Element at grid[i][j] moves to grid[i][j + 1].
     * - Element at grid[i][n - 1] moves to grid[i + 1][0].
     * - Element at grid[m - 1][n - 1] moves to grid[0][0].
     * Return the 2D grid after applying shift operation k times.
     *
     * @param grid 1 <= grid.length <= 50
     *             1 <= grid[i].length <= 50
     *             -1000 <= grid[i][j] <= 1000
     * @param k 0 <= k <= 100
     * @return the grid after shift k times.
     */
    List<List<Integer>> shiftGrid(int[][] grid, int k);
}
