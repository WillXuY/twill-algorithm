package org.willxu.algorithm.service.string;

public interface LargestNumber {
    /**
     * Given a list of non-negative integers nums, arrange them such
     * that they form the largest number and return it.
     * <p>
     * Since the result may be very large, so you need to return a
     * string instead of an integer.
     *
     * @param nums 1 <= nums.length <= 100
     *             0 <= nums[i] <= 10^9
     */
    String largestNumber(int[] nums);
}
