package org.willxu.algorithm.service.ints;

public interface RunningSumOf1DimensionalArray {
    /**
     * Given an array nums. We define a running sum of an array as
     * runningSum[i] = sum(nums[0]…nums[i]).
     *
     * Return the running sum of nums.
     *
     * @param nums 1 <= nums.length <= 1000
     *             -10^6 <= nums[i] <= 10^6
     */
    int[] runningSum(int[] nums);
}
