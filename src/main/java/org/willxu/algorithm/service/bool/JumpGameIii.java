package org.willxu.algorithm.service.bool;

public interface JumpGameIii {
    /**
     * Given an array of non-negative integers arr, you are initially
     * positioned at start index of the array. When you are at index i,
     * you can jump to i + arr[i] or i - arr[i], check if you can reach
     * any index with value 0.
     * <p>
     * Notice that you can not jump outside of the array at any time.
     *
     * @param arr 1 <= arr.length <= 5 * 10^4
     *            0 <= arr[i] < arr.length
     * @param start 0 <= start < arr.length
     */
    boolean canReach(int[] arr, int start);
}
