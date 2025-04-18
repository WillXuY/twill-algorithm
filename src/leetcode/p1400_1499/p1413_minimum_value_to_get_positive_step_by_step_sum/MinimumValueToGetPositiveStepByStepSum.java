package leetcode.p1400_1499.p1413_minimum_value_to_get_positive_step_by_step_sum;

public interface MinimumValueToGetPositiveStepByStepSum {
    /**
     * Given an array of integers nums, you start with an initial
     * positive value startValue.
     * In each iteration, you calculate the step by step sum of
     * startValue plus elements in nums (from left to right).
     * Return the minimum positive value of startValue such that the
     * step by step sum is never less than 1.
     *
     * @param nums 1 <= nums.length <= 100
     *             -100 <= nums[i] <= 100
     * @return min start value step by step sum is positive value.
     */
    int minStartValue(int[] nums);
}
