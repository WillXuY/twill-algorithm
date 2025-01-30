package org.willxu.algorithm.service.integer;

public interface CountSubmatricesWithAllOnes {
	/**
	 * Given an m x n binary matrix mat, return the number of
	 * submatrices that have all ones.
	 * 
	 * @param mat 1 <= m, n <= 150
	 *            mat[i][j] is either 0 or 1. 
	 */
	int numSubmat(int[][] mat);
}
