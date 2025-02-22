package org.willxu.algorithm.service.bool;

public interface DetectCyclesIn2dGrid {
	/**
	 * Given a 2D array of characters grid of size m x n, you need to
	 * find if there exists any cycle consisting of the same value in
	 * grid.
	 * <p>
	 * A cycle is a path of length 4 or more in the grid that starts
	 * and ends at the same cell. From a given cell, you can move to
	 * one of the cells adjacent to it - in one of the four directions
	 * (up, down, left, or right), if it has the same value of the
	 * current cell.
	 * <p>
	 * Also, you cannot move to the cell that you visited in your last
	 * move. For example, the cycle (1, 1) -> (1, 2) -> (1, 1) is
	 * invalid because from (1, 2) we visited (1, 1) which was the last
	 * visited cell.
	 * <p>
	 * Return true if any cycle of the same value exists in grid,
	 * otherwise, return false.
	 * 
	 * @param grid m == grid.length
	 *             n == grid[i].length
	 *             1 <= m, n <= 500
	 *             consists only of lowercase English letters.
	 */
	boolean containsCycle(char[][] grid);
}
