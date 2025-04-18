package org.willxu.algorithm.service.ints;

public interface TopkFrequentElements {
    /**
     * Given an integer array nums and an integer k, return the k most
     * frequent elements. You may return the answer in any order.
     * <p>
     * It is guaranteed that the answer is unique.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^4 <= nums[i] <= 10^4
     * @param k is in the range [1, the number of unique elements in the
     *          array].
     */
    int[] topKFrequent(int[] nums, int k);
}
