package leetcode.p0000_0099.p0054_spiral_matrix;

import java.util.List;

public interface SpiralMatrix {
    /**
     * Given an m x n matrix, return all elements of the matrix in
     * spiral order.
     *
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= m, n <= 10
     *               -100 <= matrix[i][j] <= 100
     */
    List<Integer> spiralOrder(int[][] matrix);
}
