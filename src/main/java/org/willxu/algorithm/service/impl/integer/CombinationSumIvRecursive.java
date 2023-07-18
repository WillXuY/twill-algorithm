package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CombinationSumIv;

import java.util.Arrays;

public class CombinationSumIvRecursive implements CombinationSumIv {
    @Override
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        return combinationSumSorted(nums, target);
    }

    public int combinationSumSorted(int[] nums, int target) {
        int result = 0;
        for (int n: nums) {
            if (n > target) {
                break;
            } else if (n == target) {
                result++;
                break;
            }
            result += combinationSumSorted(nums, target - n);
        }
        return result;
    }
}
