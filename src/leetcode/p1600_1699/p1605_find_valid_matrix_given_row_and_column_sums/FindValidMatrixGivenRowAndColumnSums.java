package leetcode.p1600_1699.p1605_find_valid_matrix_given_row_and_column_sums;

public interface FindValidMatrixGivenRowAndColumnSums {
	/**
	 * You are given two arrays rowSum and colSum of non-negative
	 * integers where rowSum[i] is the sum of the elements in the i^th
	 * row and colSum[j] is the sum of the elements of the j^th column
	 * of a 2D matrix. In other words, you do not know the elements of
	 * the matrix, but you do know the sums of each row and column.
	 * <p>
	 * Find any matrix of non-negative integers of size rowSum.length x
	 * colSum.length that satisfies the rowSum and colSum requirements.
	 * <p>
	 * Return a 2D array representing any matrix that fulfills the
	 * requirements. It's guaranteed that at least one matrix that
	 * fulfills the requirements exists.
	 * 
	 * @param rowSum,colSum 1 <= rowSum.length, colSum.length <= 500
	 *                      0 <= rowSum[i], colSum[i] <= 10^8
	 *                      sum(rowSum) == sum(colSum)
	 */
    int[][] restoreMatrix(int[] rowSum, int[] colSum);
}
