package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumSubarray;

public class MaximumSubarrayBruteForce implements MaximumSubarray {
    @Override
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int thisSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // save the sum rather than the nums[i]
            if (thisSum >= 0) {
                thisSum += nums[i];
            } else {
                thisSum = nums[i];
            }
            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
        }
        return maxSum;
    }
}
