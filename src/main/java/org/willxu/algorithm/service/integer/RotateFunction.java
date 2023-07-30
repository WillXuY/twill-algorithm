package org.willxu.algorithm.service.integer;

public interface RotateFunction {
    /**
     * You are given an integer array nums of length n.
     * <p>
     * Assume arr_k to be an array obtained by rotating nums by k
     * positions clock-wise. We define the rotation function F on nums
     * as follow:
     * <p>
     * F(k) = 0 * arr_k[0] + 1 * arr_k[1] + ... + (n - 1) * arr_k[n - 1].
     * <p>
     * Return the maximum value of F(0), F(1), ..., F(n-1).
     * <p>
     * The test cases are generated so that the answer fits in a 32-bit
     * integer.
     *
     * @param nums n == nums.length
     *             1 <= n <= 10^5
     *             -100 <= nums[i] <= 100
     */
    int maxRotateFunction(int[] nums);
}
