package org.willxu.algorithm.domain.array;

/**
 * Given an integer array nums, design an algorithm to randomly shuffle
 * the array. All permutations of the array should be equally likely as
 * a result of the shuffling.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(int[] nums) Initializes the object with the integer array
 * nums.
 */
public interface SheffleAnArray {
    /**
     * Resets the array to its original configuration and returns it.
     */
    int[] reset();

    /**
     * @return Returns a random shuffling of the array.
     */
    int[] shuffle();
}
