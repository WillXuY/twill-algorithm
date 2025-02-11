package org.willxu.algorithm.service.integer;

public interface MinimumSwapsToArrangeBinaryGrid {
	/**
	 * Given an n x n binary grid, in one step you can choose two
	 * adjacent rows of the grid and swap them.
	 * <p>
	 * A grid is said to be valid if all the cells above the main
	 * diagonal are zeros.
	 * <p>
	 * Return the minimum number of steps needed to make the grid valid,
	 * or -1 if the grid cannot be valid.
	 * <p>
	 * The main diagonal of a grid is the diagonal that starts at cell
	 * (1, 1) and ends at cell (n, n).
	 * 
	 * @param grid n == grid.length == grid[i].length
	 *             1 <= n <= 200
	 *             grid[i][j] is either 0 or 1
	 */
	int minSwaps(int[][] grid);
}
