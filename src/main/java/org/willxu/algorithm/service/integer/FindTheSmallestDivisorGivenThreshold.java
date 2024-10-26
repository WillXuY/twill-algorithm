package org.willxu.algorithm.service.integer;

public interface FindTheSmallestDivisorGivenThreshold {
    /**
     * Given an array of integers nums and an integer threshold, we will
     * choose a positive integer divisor, divide all the array by it,
     * and sum the division's result. Find the smallest divisor such
     * that the result mentioned above is less than or equal to
     * threshold.
     * <p>
     * Each result of the division is rounded to the nearest integer
     * greater than or equal to that element. (For example: 7/3 = 3 and
     * 10/2 = 5).
     * <p>
     * The test cases are generated so that there will be an answer.
     *
     * @param nums 1 <= nums.length <= 5 * 10^4
     *             1 <= nums[i] <= 10^6
     * @param threshold nums.length <= threshold <= 10^6
     */
    int smallestDivisor(int[] nums, int threshold);
}
