package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface DiagonalTraverseIi {
    /**
     * Given a 2D integer array nums, return all elements of nums in
     * diagonal order as shown in the below images.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             1 <= nums[i].length <= 10^5
     *             1 <= sum(nums[i].length) <= 10^5
     *             1 <= nums[i][j] <= 10^5
     */
    int[] findDiagonalOrder(List<List<Integer>> nums);
}
