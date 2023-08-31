package org.willxu.algorithm.service.bool;

public interface CircularArrayLoop {
    /**
     * You are playing a game involving a circular array of non-zero
     * integers nums. Each nums[i] denotes the number of indices
     * forward/backward you must move if you are located at index i:
     * <p>
     * - If nums[i] is positive, move nums[i] steps forward, and
     * - If nums[i] is negative, move nums[i] steps backward.
     * <p>
     * Since the array is circular, you may assume that moving forward
     * from the last element puts you on the first element, and moving
     * backwards from the first element puts you on the last element.
     * <p>
     * A cycle in the array consists of a sequence of indices seq of
     * length k where:
     * <p>
     * - Following the movement rules above results in the repeating
     *   index sequence seq[0] -> seq[1] -> ... -> seq[k - 1] -> seq[0] -> ...
     * - Every nums[seq[j]] is either all positive or all negative.
     * - k > 1
     * <p>
     * Return true if there is a cycle in nums, or false otherwise.
     *
     * @param nums 1 <= nums.length <= 5000
     *             -1000 <= nums[i] <= 1000
     *             nums[i] != 0
     */
    boolean circularArrayLoop(int[] nums);
}
