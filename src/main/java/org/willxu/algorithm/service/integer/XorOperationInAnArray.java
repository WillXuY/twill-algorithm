package org.willxu.algorithm.service.integer;

public interface XorOperationInAnArray {
    /**
     * You are given an integer n and an integer start.
     *
     * Define an array nums where nums[i] = start + 2 * i (0-indexed)
     * and n == nums.length.
     *
     * Return the bitwise XOR of all elements of nums.
     *
     * @param n 1 <= n <= 1000
     *          n == nums.length
     * @param start 0 <= start <= 1000
     */
    int xorOperation(int n, int start);
}
