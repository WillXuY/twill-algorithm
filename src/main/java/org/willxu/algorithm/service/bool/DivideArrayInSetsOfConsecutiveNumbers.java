package org.willxu.algorithm.service.bool;

public interface DivideArrayInSetsOfConsecutiveNumbers {
    /**
     * Given an array of integers nums and a positive integer k, check
     * whether it is possible to divide this array into sets of k
     * consecutive numbers.
     * <p>
     * Return true if it is possible. Otherwise, return false.
     *
     * @param nums,k 1 <= k <= nums.length <= 10^5
     *               1 <= nums[i] <= 10^9
     */
    boolean isPossibleDivide(int[] nums, int k);
}
