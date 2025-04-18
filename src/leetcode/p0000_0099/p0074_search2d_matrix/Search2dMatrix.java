package leetcode.p0000_0099.p0074_search2d_matrix;

public interface Search2dMatrix {
    /**
     * You are given an m x n integer matrix matrix with the following
     * two properties:
     * <p>
     * - Each row is sorted in non-decreasing order.
     * - The first integer of each row is greater than the last integer
     *   of the previous row.
     * <p>
     * Given an integer target, return true if target is in matrix or
     * false otherwise.
     * <p>
     * You must write a solution in O(log(m * n)) time complexity.
     *
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= m, n <= 100
     * @param target -104 <= matrix[i][j], target <= 104
     */
    boolean searchMatrix(int[][] matrix, int target);
}
