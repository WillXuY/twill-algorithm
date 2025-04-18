package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SurfaceAreaOf3dShapes;

public class SurfaceAreaOf3dShapesSubtract implements SurfaceAreaOf3dShapes {
    /**
     * 1. count all surface area (amount * 6).
     * 2. subtract the inside surface.
     *    1) width and length: the min of two adjacent numbers * 2.
     *    2) height: (int[i][j] - i) * 2.
     */
    @Override
    public int surfaceArea(int[][] grid) {
        int countArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                countArea += 6 * grid[i][j];
                if (grid[i][j] > 0) {
                    countArea -= 2 * (grid[i][j] - 1);
                }
                if (i < grid.length - 1) {
                    countArea -= Math.min(grid[i][j], grid[i + 1][j]) * 2;
                }
                if (j < grid[i].length - 1) {
                    countArea -= Math.min(grid[i][j], grid[i][j + 1]) * 2;
                }
            }
        }
        return countArea;
    }
}
