package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaxAreaOfIsland;

import java.util.ArrayList;
import java.util.List;

public class MaxAreaOfIslandLoop implements MaxAreaOfIsland {
    @Override
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] != 1) {
                    continue;
                }
                int area = 1;
                grid[r][c] = 2;
                List<int[]> edgeList = new ArrayList<>();
                edgeList.add(new int[] {r, c});
                while (!edgeList.isEmpty()) {
                    List<int[]> newEdgeList = new ArrayList<>();
                    for (int[] e: edgeList) {
                        int row = e[0];
                        int col = e[1];
                        int top = row - 1;
                        if (top >= 0 && grid[top][col] == 1) {
                            area++;
                            newEdgeList.add(new int[] {top, col});
                            grid[top][col] = 2;
                        }
                        int bottom = row + 1;
                        if (bottom < grid.length && grid[bottom][col] == 1) {
                            area++;
                            newEdgeList.add(new int[] {bottom, col});
                            grid[bottom][col] = 2;
                        }
                        int left = col - 1;
                        if (left >= 0 && grid[row][left] == 1) {
                            area++;
                            newEdgeList.add(new int[] {row, left});
                            grid[row][left] = 2;
                        }
                        int right = col + 1;
                        if (right < grid[row].length && grid[row][right] == 1) {
                            area++;
                            newEdgeList.add(new int[] {row, right});
                            grid[row][right] = 2;
                        }
                    }
                    edgeList = newEdgeList;
                }
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
