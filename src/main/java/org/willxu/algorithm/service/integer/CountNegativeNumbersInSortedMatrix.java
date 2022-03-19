package org.willxu.algorithm.service.integer;

public interface CountNegativeNumbersInSortedMatrix {
    /**
     * Given a m x n matrix grid which is roted in non-increasing order
     * both row-wise and column-wise, return the number of negative
     * numbers in grid.
     * Follow up:
     * Could you find an O(n + m) solution?
     *
     * @param grid 1 <= grid.length, grid[i].length <= 100
     *             -100 <= grid[i][j] <= 100
     * @return number of negatives.
     */
    int countNegatives(int[][] grid);
}
