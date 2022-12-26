package org.willxu.algorithm.service.integer;

public interface DeleteGreatestValueInEachRow {
    /**
     * You are given an m x n matrix grid consisting of positive
     * integers.
     * <p>
     * Perform the following operation until grid becomes empty:
     * <p>
     * - Delete the element with the greatest value from each row. If
     *   multiple such elements exist, delete any of them.
     * - Add the maximum of deleted elements to the answer.
     * <p>
     * Note that the number of columns decreases by one after each
     * operation.
     * <p>
     * Return the answer after performing the operations described above
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 50
     *             1 <= grid[i][j] <= 100
     */
    int deleteGreatestValue(int[][] grid);
}
