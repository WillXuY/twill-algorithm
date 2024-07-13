package org.willxu.algorithm.service.matrix;

public interface ColoringBorder {
    /**
     * You are given an m x n integer matrix grid, and three integers
     * row, col, and color. Each value in the grid represents the color
     * of the grid square at that location.
     * <p>
     * Two squares are called adjacent if they are next to each other in
     * any of the 4 directions.
     * <p>
     * Two squares belong to the same connected component if they have
     * the same color and they are adjacent.
     * <p>
     * The border of a connected component is all the squares in the
     * connected component that are either adjacent to (at least) a
     * square not in the component, or on the boundary of the grid (the
     * first or last row or column).
     * <p>
     * You should color the border of the connected component that
     * contains the square grid[row][col] with color.
     * <p>
     * Return the final grid.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m, n <= 50
     * @param row 0 <= row < m
     * @param col 0 <= col < n
     * @param color 1 <= grid[i][j], color <= 1000
     */
    int[][] colorBorder(int[][] grid, int row, int col, int color);
}
