package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.FindValidMatrixGivenRowAndColumnSums;

public class FindValidMatrixGivenRowAndColumnSumsCompare implements FindValidMatrixGivenRowAndColumnSums {

	@Override
	public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int[][] result = new int[rowSum.length][colSum.length];
		for (int r = 0; r < rowSum.length; r++) {
			for (int c = 0; c < colSum.length; c++) {
				result[r][c] = Math.min(rowSum[r], colSum[c]);
				rowSum[r] -= result[r][c];
				colSum[c] -= result[r][c];
			}
		}
		return result;
	}

}
