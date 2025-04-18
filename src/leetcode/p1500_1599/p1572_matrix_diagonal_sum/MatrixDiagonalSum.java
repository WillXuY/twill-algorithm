package leetcode.p1500_1599.p1572_matrix_diagonal_sum;

public interface MatrixDiagonalSum {
    /**
     * Given a square matrix mat, return the sum of the matrix
     * diagonals.
     *
     * Only include the sum of all the elements on the primary diagonal
     * and all the elements on the secondary diagonal that are not part
     * of the primary diagonal.
     *
     * @param mat n == mat.length == mat[i].length
     *            1 <= n <= 100
     *            1 <= mat[i][j] <= 100
     */
    int diagonalSum(int[][] mat);
}
