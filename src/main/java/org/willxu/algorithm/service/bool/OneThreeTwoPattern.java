package org.willxu.algorithm.service.bool;

public interface OneThreeTwoPattern {
    /**
     * Given an array of n integers nums, a 132 pattern is a subsequence
     * of three integers nums[i], nums[j] and nums[k] such that
     * i < j < k and nums[i] < nums[k] < nums[j].
     * <p>
     * Return true if there is a 132 pattern in nums, otherwise, return
     * false.
     *
     * @param nums n == nums.length
     *             1 <= n <= 2 * 10^5
     *             -10^9 <= nums[i] <= 10^9
     */
    boolean find132pattern(int[] nums);
}
