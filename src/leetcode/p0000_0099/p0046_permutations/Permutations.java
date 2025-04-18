package leetcode.p0000_0099.p0046_permutations;

import java.util.List;

public interface Permutations {
    /**
     * Given an array nums of distinct integers, return all the possible
     * permutations. You can return the answer in any order.
     *
     * @param nums 1 <= nums.length <= 6
     *             -10 <= nums[i] <= 10
     *             All the integers of nums are unique.
     */
    List<List<Integer>> permute(int[] nums);
}
