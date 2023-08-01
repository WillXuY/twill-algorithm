package org.willxu.algorithm.domain.integer;

/**
 * Given an integer array nums with possible duplicates, randomly output
 * the index of a given target number. You can assume that the given
 * target number must exist in the array.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(int[] nums) Initializes the object with the array nums.
 */
public interface RandomPickIndex {
    /**
     * Picks a random index i from nums where nums[i] == target. If
     * there are multiple valid i's, then each index should have an
     * equal probability of returning.
     *
     * @param target 1 <= nums.length <= 2 * 10^4
     *               -2^31 <= nums[i] <= 2^31 - 1
     *               target is an integer from nums.
     *               At most 10^4 calls will be made to pick.
     */
    int pick(int target);
}
