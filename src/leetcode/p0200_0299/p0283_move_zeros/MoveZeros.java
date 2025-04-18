package org.willxu.algorithm.service.empty;

public interface MoveZeros {
    /**
     * Given an integer array nums, move all 0's to the end of it while
     * maintaining the relative order of the non-zero elements.
     *
     * Note that you must do this in-place without making a copy of the
     * array.
     *
     * Follow up: Could you minimize the total number of operation done?
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -2^31 <= nums[i] <= 2^31 - 1
     */
    void moveZeroes(int[] nums);
}
