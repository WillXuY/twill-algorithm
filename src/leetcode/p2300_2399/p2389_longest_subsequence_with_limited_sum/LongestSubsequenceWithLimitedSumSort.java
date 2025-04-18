package leetcode.p2300_2399.p2389_longest_subsequence_with_limited_sum;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSumSort
        implements LongestSubsequenceWithLimitedSum {
    @Override
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        int[] output = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int max = -1;
            for (int j = 0; j < sum.length; j++) {
                if (queries[i] < sum[j]) {
                    max = j;
                    break;
                }
            }
            if (max == -1) {
                max = sum.length;
            }
            output[i] = max;
        }
        return output;
    }
}
