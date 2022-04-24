package org.willxu.algorithm.service.ints;

public interface ShuffleTheArray {
    /**
     * Given the array nums consisting of 2n elements in the form
     * [x_1, x_2, ..., x_n, y_1, y_2, ..., y_n].
     *
     * Return the array in the form [x_1, y_1, x_2, y_2, ..., x_n, y_n].
     *
     * @param nums nums.length == 2n
     *             1 <= nums[i] <= 10^3
     * @param n 1 <= n <= 500
     */
    int[] shuffle(int[] nums, int n);
}
