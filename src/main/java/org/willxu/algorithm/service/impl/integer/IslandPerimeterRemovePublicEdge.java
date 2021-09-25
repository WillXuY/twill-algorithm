package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.IslandPerimeter;

public class IslandPerimeterRemovePublicEdge implements IslandPerimeter {
    @Override
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1) {
                    count+=4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        count-=2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        count-=2;
                    }
                }
            }
        }
        return count;
    }
}
