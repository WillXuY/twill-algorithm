package leetcode.p2300_2399.p2373_largest_local_values_in_matrix;

public interface LargestLocalValuesInMatrix {
    /**
     * You are given an n x n integer matrix grid.
     * <p>
     * Generate an integer matrix maxLocal of size (n - 2) x (n - 2)
     * such that:
     * <p>
     * - maxLocal[i][j] is equal to the largest value of the 3 x 3
     *   matrix in grid centered around row i + 1 and column j + 1.
     * <p>
     * In other words, we want to find the largest value in every
     * contiguous 3 x 3 matrix in grid.
     * <p>
     * Return the generated matrix.
     *
     * @param grid n == grid.length == grid[i].length
     *             3 <= n <= 100
     *             1 <= grid[i][j] <= 100
     */
    int[][] largestLocal(int[][] grid);
}
