package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface MajorityElementIi {
    /**
     * Given an integer array of size n, find all elements that appear
     * more than ⌊ n/3 ⌋ times.
     *
     * @param nums 1 <= nums.length <= 5 * 10^4
     *             -10^9 <= nums[i] <= 10^9
     */
    List<Integer> majorityElement(int[] nums);
}
