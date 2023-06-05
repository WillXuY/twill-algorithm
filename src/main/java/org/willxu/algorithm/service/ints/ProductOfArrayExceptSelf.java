package org.willxu.algorithm.service.ints;

public interface ProductOfArrayExceptSelf {
    /**
     * Given an integer array nums, return an array answer such that
     * answer[i] is equal to the product of all the elements of nums
     * except nums[i].
     * <p>
     * The product of any prefix or suffix of nums is guaranteed to fit
     * in a 32-bit integer.
     * <p>
     * You must write an algorithm that runs in O(n) time and without
     * using the division operation.
     *
     * @param nums 2 <= nums.length <= 10^5
     *             -30 <= nums[i] <= 30
     *             The product of any prefix or suffix of nums is
     *             guaranteed to fit in a 32-bit integer.
     */
    int[] productExceptSelf(int[] nums);
}
