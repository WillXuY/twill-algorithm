package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.DeleteGreatestValueInEachRow;

import java.util.Arrays;

public class DeleteGreatestValueInEachRowSort
        implements DeleteGreatestValueInEachRow {
    @Override
    public int deleteGreatestValue(int[][] grid) {
        int[] sortedMin = grid[0];
        Arrays.sort(sortedMin);
        for (int i = 1; i < grid.length; i++) {
            int[] row = grid[i];
            Arrays.sort(row);
            for (int j = 0; j < row.length; j++) {
                if (row[j] > sortedMin[j]) {
                    sortedMin[j] = row[j];
                }
            }
        }
        int output = 0;
        for (int s: sortedMin) {
            output += s;
        }
        return output;
    }
}
