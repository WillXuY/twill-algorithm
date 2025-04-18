package org.willxu.algorithm.service.bool;

public interface CheckIfMatrixIsxMatrix {
    /**
     * A square matrix is said to be an X-Matrix if both of the
     * following conditions hold:
     * <p>
     * - All the elements in the diagonals of the matrix are non-zero.
     * - All other elements are 0.
     * <p>
     * Given a 2D integer array grid of size n x n representing a square
     * matrix, return true if grid is an X-Matrix. Otherwise, return
     * false.
     *
     * @param grid n == grid.length == grid[i].length
     *             3 <= n <= 100
     *             0 <= grid[i][j] <= 105
     */
    boolean checkXMatrix(int[][] grid);
}
