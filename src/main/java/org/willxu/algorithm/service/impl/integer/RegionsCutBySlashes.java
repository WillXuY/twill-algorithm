package org.willxu.algorithm.service.impl.integer;

public interface RegionsCutBySlashes {
    /**
     * An n x n grid is composed of 1 x 1 squares where each 1 x 1
     * square consists of a '/', '\', or blank space ' '. These
     * characters divide the square into contiguous regions.
     * <p>
     * Given the grid grid represented as a string array, return the
     * number of regions.
     * <p>
     * Note that backslash characters are escaped, so a '\' is
     * represented as '\\'.
     *
     * @param grid n == grid.length == grid[i].length
     *             1 <= n <= 30
     *             grid[i][j] is either '/', '\', or ' '.
     */
    int regionsBySlashes(String[] grid);
}
