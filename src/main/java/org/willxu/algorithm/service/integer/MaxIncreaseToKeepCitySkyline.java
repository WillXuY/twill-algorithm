package org.willxu.algorithm.service.integer;

public interface MaxIncreaseToKeepCitySkyline {
    /**
     * There is a city composed of n x n blocks, where each block
     * contains a single building shaped like a vertical square prism.
     * You are given a 0-indexed n x n integer matrix grid where
     * grid[r][c] represents the height of the building located in the
     * block at row r and column c.
     * <p>
     * A city's skyline is the outer contour formed by all the building
     * when viewing the side of the city from a distance. The skyline
     * from each cardinal direction north, east, south, and west may be
     * different.
     * <p>
     * We are allowed to increase the height of any number of buildings
     * by any amount (the amount can be different per building). The
     * height of a 0-height building can also be increased. However,
     * increasing the height of a building should not affect the city's
     * skyline from any cardinal direction.
     * <p>
     * Return the maximum total sum that the height of the buildings can
     * be increased by without changing the city's skyline from any
     * cardinal direction.
     *
     * @param grid n == grid.length
     *             n == grid[r].length
     *             2 <= n <= 50
     *             0 <= grid[r][c] <= 100
     */
    int maxIncreaseKeepingSkyline(int[][] grid);
}
