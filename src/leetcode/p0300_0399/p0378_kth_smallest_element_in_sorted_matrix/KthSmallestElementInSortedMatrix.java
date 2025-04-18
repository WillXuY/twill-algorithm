package leetcode.p0300_0399.p0378_kth_smallest_element_in_sorted_matrix;

public interface KthSmallestElementInSortedMatrix {
    /**
     * Given an n x n matrix where each of the rows and columns is
     * sorted in ascending order, return the k^th smallest element in
     * the matrix.
     * <p>
     * Note that it is the k^th smallest element in the sorted order,
     * not the k^th distinct element.
     * <p>
     * You must find a solution with a memory complexity better than
     * O(n^2).
     *
     * @param matrix n == matrix.length == matrix[i].length
     *               1 <= n <= 300
     *               -10^9 <= matrix[i][j] <= 10^9
     *               All the rows and columns of matrix are guaranteed
     *               to be sorted in non-decreasing order.
     * @param k 1 <= k <= n^2
     */
    int kthSmallest(int[][] matrix, int k);
}
