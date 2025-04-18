package leetcode.p0000_0099.p0064_minimum_path_sum;

public interface MinimumPathSum {
    /**
     * Given a m x n grid filled with non-negative numbers, find a path
     * from top left to bottom right, which minimizes the sum of all
     * numbers along its path.
     * <p>
     * Note: You can only move either down or right at any point in time.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 200
     *             0 <= grid[i][j] <= 100
     */
    int minPathSum(int[][] grid);
}
