package org.willxu.algorithm.service.matrix;

import java.util.List;

public interface PacificAtlanticWaterFlow {
    /**
     * There is an m x n rectangular island that borders both the
     * Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the
     * island's left and top edges, and the Atlantic Ocean touches the
     * island's right and bottom edges.
     * <p>
     * The island is partitioned into a grid of square cells. You are
     * given an m x n integer matrix heights where heights[r][c]
     * represents the height above sea level of the cell at coordinate
     * (r, c).
     * <p>
     * The island receives a lot of rain, and the rain water can flow to
     * neighboring cells directly north, south, east, and west if the
     * neighboring cell's height is less than or equal to the current
     * cell's height. Water can flow from any cell adjacent to an ocean
     * into the ocean.
     * <p>
     * Return a 2D list of grid coordinates result where
     * result[i] = [r_i, c_i] denotes that rain water can flow from cell
     * (r_i, c_i) to both the Pacific and Atlantic oceans.
     *
     * @param heights m == heights.length
     *                n == heights[r].length
     *                1 <= m, n <= 200
     *                0 <= heights[r][c] <= 10^5
     */
    List<List<Integer>> pacificAtlantic(int[][] heights);
}
