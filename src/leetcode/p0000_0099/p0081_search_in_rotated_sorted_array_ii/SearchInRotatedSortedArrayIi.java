package leetcode.p0000_0099.p0081_search_in_rotated_sorted_array_ii;

public interface SearchInRotatedSortedArrayIi {
    /**
     * There is an integer array nums sorted in non-decreasing order
     * (not necessarily with distinct values).
     * <p>
     * Before being passed to your function, nums is rotated at an
     * unknown pivot index k (0 <= k < nums.length) such that the
     * resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0],
     * nums[1], ..., nums[k-1]] (0-indexed). For example,
     * [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and
     * become [4,5,6,6,7,0,1,2,4,4].
     * <p>
     * Given the array nums after the rotation and an integer target,
     * return true if target is in nums, or false if it is not in nums.
     * <p>
     * You must decrease the overall operation steps as much as possible.
     *
     * @param nums 1 <= nums.length <= 5000
     *             -104 <= nums[i] <= 104
     *             nums is guaranteed to be rotated at some pivot.
     * @param target -104 <= target <= 104
     */
    boolean search(int[] nums, int target);
}
