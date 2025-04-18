package leetcode.p1900_1999.p1984_minimum_difference_between_highest_and_lowest_of_scores;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfScoresSort
        implements MinimumDifferenceBetweenHighestAndLowestOfScores {
    @Override
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int output = Integer.MAX_VALUE;
        for (int i = 0; i + k <= nums.length; i++) {
            int diff = nums[i + k - 1] - nums[i];
            if (output > diff) {
                output = diff;
            }
        }
        return output;
    }
}
