package org.willxu.algorithm.service.ints;

public interface MatrixBlockSum {
    /**
     * Given a m x n matrix mat and an integer k, return a matrix answer
     * where each answer[i][j] is the sum of all elements mat[r][c] for:
     * <p>
     * - i - k <= r <= i + k,
     * - j - k <= c <= j + k, and
     * - (r, c) is a valid position in the matrix.
     *
     * @param mat,k m == mat.length
     *              n == mat[i].length
     *              1 <= m, n, k <= 100
     *              1 <= mat[i][j] <= 100
     */
    int[][] matrixBlockSum(int[][] mat, int k);
}
