package org.willxu.algorithm.service.matrix;

public interface ZeroOneMatrix {
    /**
     * Given an m x n binary matrix mat, return the distance of the
     * nearest 0 for each cell.
     * <p>
     * The distance between two adjacent cells is 1.
     *
     * @param mat m == mat.length
     *            n == mat[i].length
     *            1 <= m, n <= 10^4
     *            1 <= m * n <= 10^4
     *            mat[i][j] is either 0 or 1.
     *            There is at least one 0 in mat.
     */
    int[][] updateMatrix(int[][] mat);
}
