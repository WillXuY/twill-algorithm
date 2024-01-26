package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaxIncreaseToKeepCitySkyline;

public class MaxIncreaseToKeepCitySkylineLoop
        implements MaxIncreaseToKeepCitySkyline {
    @Override
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxInRow = new int[grid.length];
        int[] maxInCol = new int[grid[0].length];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > maxInRow[r]) {
                    maxInRow[r] = grid[r][c];
                }
                if (grid[r][c] > maxInCol[c]) {
                    maxInCol[c] = grid[r][c];
                }
            }
        }
        int result = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                result += Math.min(maxInRow[r], maxInCol[c]) - grid[r][c];
            }
        }
        return result;
    }
}
