package org.willxu.algorithm.domain;

/**
 * Given a 2D matrix matrix, handle multiple queries of the following
 * type:
 * <p>
 * Calculate the sum of the elements of matrix inside the rectangle
 * defined by its upper left corner (row1, col1) and lower right corner
 * (row2, col2).
 * <p>
 * You must design an algorithm where sumRegion works on O(1) time
 * complexity.
 * <p>
 * At most 104 calls will be made to sumRegion.
 */
public abstract class RangeSumQuery2dImmutable {
    /**
     * Initializes the object with the integer matrix matrix.
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= m, n <= 200
     *               -10^4 <= matrix[i][j] <= 10^4
     */
    public RangeSumQuery2dImmutable(int[][] matrix) {}

    /**
     * m == matrix.length, n == matrix[i].length,1 <= m, n <= 200
     * -10^4 <= matrix[i][j] <= 10^4
     * @param row1,row2 0 <= row1 <= row2 < m
     * @param col1,col2 0 <= col1 <= col2 < n
     * @return the sum of the elements of matrix inside the rectangle
     *         defined by its upper left corner (row1, col1) and lower
     *         right corner (row2, col2).
     */
    public abstract int sumRegion(int row1, int col1, int row2, int col2);
}
