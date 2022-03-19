package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountNegativeNumbersInSortedMatrix;

public class CountNegativeNumbersInSortedMatrixStile
        implements CountNegativeNumbersInSortedMatrix {
    @Override
    public int countNegatives(int[][] grid) {
        int output = 0;
        int CountNegativesLastRow = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            int positiveRemaining = row.length - 1 - CountNegativesLastRow;
            if (positiveRemaining < 0) {
                output += CountNegativesLastRow * (grid.length - i);
                break;
            }
            for (int j = positiveRemaining; j >= 0; j--) {
                if (row[j] < 0) {
                    CountNegativesLastRow++;
                    if (j == 0) {
                        if (CountNegativesLastRow > row.length) {
                            CountNegativesLastRow = row.length;
                        }
                        output += CountNegativesLastRow;
                    }
                } else {
                    output += CountNegativesLastRow;
                    break;
                }
            }
        }
        return output;
    }
}
