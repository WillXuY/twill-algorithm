package leetcode.p0300_0399.p0377_combination_sum_iv;

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
