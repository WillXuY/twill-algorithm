package org.willxu.algorithm.service.integer;

public interface NrepeatedElementInSize2nArray {
    /**
     * You are given an integer array nums with the following
     * properties:
     * - nums.length == 2 * n.
     * - nums contains n + 1 unique elements.
     * - Exactly one element of nums is repeated n times.
     * Return the element that is repeated n times.
     *
     * Constraints:
     * - 2 <= n <= 5000
     *
     * @param nums nums.length = 2 * n
     *             0 <= nums[i] <= 10^4
     *             contains n + 1 unique elements and one of them is
     *             repeated exactly n times.
     * @return the element in nums which repeated n times.
     */
    int repeatedNTimes(int[] nums);
}
