package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface IntersectionOfMultipleArrays {
    /**
     * Given a 2D integer array nums where nums[i] is a non-empty array
     * of distinct positive integers, return the list of integers that
     * are present in each array of nums sorted in ascending order.
     *
     * @param nums 1 <= nums.length <= 1000
     *             1 <= sum(nums[i].length) <= 1000
     *             1 <= nums[i][j] <= 1000
     *             All the values of nums[i] are unique.
     */
    List<Integer> intersection(int[][] nums);
}
