package leetcode.p1300_1399.p1337_the_weakest_rows_in_matrix;

public interface TheWeakestRowsInMatrix {
    /**
     * You are given an m x n binary matrix mat of 1's (representing
     * soldiers) and 0's (representing civilians). The soldiers are
     * positioned in front of the civilians. That is, all the 1's will
     * appear to the left of all the 0's in each row.
     * A row i is weaker then a row j if one of the following is true:
     * - The number of soldiers in row i is less than the number of
     *   soldiers in row j.
     * - Both rows have the same number of soldiers and i < j.
     * Return the indices of the k weakest rows in the matrix ordered
     * from weakest to strongest.
     *
     * @param mat 2 <= mat.length, mat[i].length <= 100
     *            matrix[i][j] is either 0 or 1.
     * @param k 1 <= k <= m
     * @return k weakest rows in matrix.
     */
    int[] kWeakestRows(int[][] mat, int k);
}
