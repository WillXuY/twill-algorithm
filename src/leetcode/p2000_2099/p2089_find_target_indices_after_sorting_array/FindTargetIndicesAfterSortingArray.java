package leetcode.p2000_2099.p2089_find_target_indices_after_sorting_array;

import java.util.List;

public interface FindTargetIndicesAfterSortingArray {
    /**
     * You are given a 0-indexed integer array nums and a target element
     * target.
     * <p>
     * A target index is an index i such that nums[i] == target.
     * <p>
     * Return a list of the target indices of nums after sorting nums in
     * non-decreasing order. If there are no target indices, return an
     * empty list. The returned list must be sorted in increasing order.
     *
     * @param nums 1 <= nums.length <= 100
     * @param target 1 <= nums[i], target <= 100
     */
    List<Integer> targetIndices(int[] nums, int target);
}
