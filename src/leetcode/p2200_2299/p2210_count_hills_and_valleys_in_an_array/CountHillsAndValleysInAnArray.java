package leetcode.p2200_2299.p2210_count_hills_and_valleys_in_an_array;

public interface CountHillsAndValleysInAnArray {
    /**
     * You are given a 0-indexed integer array nums. An index i is part
     * of a hill in nums if the closest non-equal neighbors of i are
     * smaller than nums[i]. Similarly, an index i is part of a valley
     * in nums if the closest non-equal neighbors of i are larger than
     * nums[i]. Adjacent indices i and j are part of the same hill or
     * valley if nums[i] == nums[j].
     * <p>
     * Note that for an index to be part of a hill or valley, it must
     * have a non-equal neighbor on both the left and right of the
     * index.
     * <p>
     * Return the number of hills and valleys in nums.
     *
     * @param nums 3 <= nums.length <= 100
     *             1 <= nums[i] <= 100
     */
    int countHillValley(int[] nums);
}
