package org.willxu.algorithm.service.integer;

public interface MaximumProductSubarray {
    /**
     * Given an integer array nums, find a subarray that has the largest
     * product, and return the product.
     * <p>
     * The test cases are generated so that the answer will fit in a
     * 32-bit integer.
     *
     * @param nums 1 <= nums.length <= 2 * 10^4
     *             -10 <= nums[i] <= 10
     *             The product of any prefix or suffix of nums is
     *             guaranteed to fit in a 32-bit integer.
     */
    int maxProduct(int[] nums);
}
