package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface FindAllDuplicatesInAnArray {
    /**
     * Given an integer array nums of length n where all the integers of
     * nums are in the range [1, n] and each integer appears once or
     * twice, return an array of all the integers that appears twice.
     * <p>
     * You must write an algorithm that runs in O(n) time and uses only
     * constant extra space.
     *
     * @param nums n == nums.length
     *             1 <= n <= 10^5
     *             1 <= nums[i] <= n
     *             Each element in nums appears once or twice.
     */
    List<Integer> findDuplicates(int[] nums);
}
