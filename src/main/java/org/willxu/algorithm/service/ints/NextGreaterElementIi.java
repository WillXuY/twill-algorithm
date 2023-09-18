package org.willxu.algorithm.service.ints;

public interface NextGreaterElementIi {
    /**
     * Given a circular integer array nums (i.e., the next element of
     * nums[nums.length - 1] is nums[0]), return the next greater number
     * for every element in nums.
     * <p>
     * The next greater number of a number x is the first greater number
     * to its traversing-order next in the array, which means you could
     * search circularly to find its next greater number. If it doesn't
     * exist, return -1 for this number.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^9 <= nums[i] <= 10^9
     */
    int[] nextGreaterElements(int[] nums);
}
