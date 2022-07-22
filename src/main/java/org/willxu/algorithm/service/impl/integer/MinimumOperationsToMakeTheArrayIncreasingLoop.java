package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumOperationsToMakeTheArrayIncreasing;

public class MinimumOperationsToMakeTheArrayIncreasingLoop
        implements MinimumOperationsToMakeTheArrayIncreasing {
    @Override
    public int minOperations(int[] nums) {
        int output = 0;
        int lastNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= lastNumber) {
                output += lastNumber - nums[i] + 1;
                lastNumber += 1;
            } else {
                lastNumber = nums[i];
            }
        }
        return output;
    }
}
