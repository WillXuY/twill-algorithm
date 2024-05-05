package org.willxu.algorithm.service.integer;

public interface MaximumWidthRamp {
    /**
     * A ramp in an integer array nums is a pair (i, j) for which i < j
     * and nums[i] <= nums[j]. The width of such a ramp is j - i.
     * <p>
     * Given an integer array nums, return the maximum width of a ramp
     * in nums. If there is no ramp in nums, return 0.
     *
     * @param nums 2 <= nums.length <= 5 * 10^4
     *             0 <= nums[i] <= 5 * 10^4
     */
    int maxWidthRamp(int[] nums);
}
