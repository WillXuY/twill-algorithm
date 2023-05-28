package org.willxu.algorithm.service.integer;

public interface KthLargestElementInAnArray {
    /**
     * Given an integer array nums and an integer k, return the k^th
     * largest element in the array.
     * <p>
     * Note that it is the k^th largest element in the sorted order, not
     * the k^th distinct element.
     * <p>
     * You must solve it in O(n) time complexity.
     *
     * @param nums,k 1 <= k <= nums.length <= 10^5
     *               -10^4 <= nums[i] <= 10^4
     */
    int findKthLargest(int[] nums, int k);
}
