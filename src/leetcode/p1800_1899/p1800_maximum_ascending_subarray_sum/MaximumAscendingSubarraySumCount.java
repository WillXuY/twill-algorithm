package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumAscendingSubarraySum;

public class MaximumAscendingSubarraySumCount
        implements MaximumAscendingSubarraySum {
    @Override
    public int maxAscendingSum(int[] nums) {
        int output = nums[0];
        int count = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count += nums[i];
            } else {
                count = nums[i];
            }
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
