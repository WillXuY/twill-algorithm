package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.SquaresOfSortedArray;

public class SquaresOfSortedArrayInsert implements SquaresOfSortedArray {
    /**
     * 1. Calculate the square of nums.
     * 2. Insert into a sorted array.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^4 <= nums[i] <= 10^4
     *             is sorted in non-decreasing order.
     * @return sorted array.
     */
    @Override
    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i] * nums[i];
            for (int j = 0; j < output.length; j++) {
                if (s <= output[j]) {
                    System.arraycopy(output, j, output, j + 1,
                            output.length - 1 - j);
                    output[j] = s;
                    break;
                }
                if (j == i) {
                    output[j] = s;
                }
            }
        }
        return output;
    }
}
