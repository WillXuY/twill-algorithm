package org.willxu.algorithm.service.bool;

public interface Search2dMatrixIi {
    /**
     * Write an efficient algorithm that searches for a value target in
     * an m x n integer matrix matrix. This matrix has the following
     * properties:
     * <p>
     * - Integers in each row are sorted in ascending from left to
     *   right.
     * - Integers in each column are sorted in ascending from top to
     *   bottom.
     *
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= n, m <= 300
     *               -10^9 <= matrix[i][j] <= 10^9
     *               All the integers in each row are sorted in
     *               ascending order.
     *               All the integers in each column are sorted in
     *               ascending order.
     * @param target -10^9 <= target <= 10^9
     */
    boolean searchMatrix(int[][] matrix, int target);
}
