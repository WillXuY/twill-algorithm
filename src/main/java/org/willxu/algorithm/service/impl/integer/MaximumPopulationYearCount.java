package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumPopulationYear;

public class MaximumPopulationYearCount implements MaximumPopulationYear {
    @Override
    public int maximumPopulation(int[][] logs) {
        // year - 1950.
        int[] yearCount = new int[101];
        for (int[] log: logs) {
            for (int i = log[0]; i < log[1]; i++) {
                yearCount[i - 1950]++;
            }
        }
        int maxCount = 0;
        int output = -1;
        for (int i = 0; i < yearCount.length; i++) {
            if (yearCount[i] > maxCount) {
                maxCount = yearCount[i];
                output = i + 1950;
            }
        }
        return output;
    }
}
