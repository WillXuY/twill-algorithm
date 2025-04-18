package leetcode.p1900_1999.p1909_remove_one_element_to_make_the_array_strictly_increasing;

public interface RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    /**
     * Given a 0-indexed integer array nums, return true if it can be
     * made strictly increasing after removing exactly one element, or
     * false otherwise. If the array is already strictly increasing,
     * return true.
     *
     * The array nums is strictly increasing if nums[i - 1] < nums[i]
     * for each index (1 <= i < nums.length).
     *
     * @param nums 2 <= nums.length <= 1000
     *             1 <= nums[i] <= 1000
     */
    boolean canBeIncreasing(int[] nums);
}
