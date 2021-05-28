package org.willxu.algorithm.service.impl.ints2ints;

import org.willxu.algorithm.service.ints2ints.TwoSum;

public class TwoSumBruteForce implements TwoSum {
    @Override
    public int[] getTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("result is not exists");
    }
}
