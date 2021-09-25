package org.willxu.algorithm.service.integer;

public interface IslandPerimeter {
    /**
     * You are given row x col grid representing a map where
     * grid[i][j] == 1 represents land and grid[i][j] = represents
     * water.
     * Grid cells are connected horizontally/vertically(not diagonally).
     * The grid is completely surrounded by water, and there is exactly
     * one island (i.e., one or more connected land cells).
     * The island doesn't have "lakes", meaning the water inside isn't
     * connected to the water around the island. One cell is a square
     * with side length 1. The grid is rectangular, width and height
     * don't exceed 100. Determine the perimeter of the island.
     *
     * @param grid 1 <= grid.length, grid.width <= 100
     *             grid[i][j] is 0 or 1
     * @return return the edge number.
     */
    int islandPerimeter(int[][] grid);
}
