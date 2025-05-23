package leetcode.p0000_0099.p0033_search_in_rotated_sorted_array;

public interface SearchInRotatedSortedArray {
    /**
     * There is an integer array nums sorted in ascending order (with
     * distinct values).
     * <p>
     * Prior to being passed to your function, nums is possibly rotated
     * at an unknown pivot index k (1 <= k < nums.length) such that the
     * resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0],
     * nums[1], ..., nums[k-1]] (0-indexed). For example,
     * [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become
     * [4,5,6,7,0,1,2].
     * <p>
     * Given the array nums after the possible rotation and an integer
     * target, return the index of target if it is in nums, or -1 if it
     * is not in nums.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * @param nums 1 <= nums.length <= 5000
     *             -104 <= nums[i] <= 104
     *             All values of nums are unique.
     *             nums is an ascending array that is possibly rotated.
     * @param target -104 <= target <= 104
     */
    int search(int[] nums, int target);
}
