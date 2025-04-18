package leetcode.p2300_2399.p2395_find_subarrays_with_equal_sum;

public interface FindSubarraysWithEqualSum {
    /**
     * Given a 0-indexed integer array nums, determine whether there
     * exist two subarrays of length 2 with equal sum. Note that the two
     * subarrays must begin at different indices.
     * <p>
     * Return true if these subarrays exist, and false otherwise.
     * <p>
     * A subarray is a contiguous non-empty sequence of elements within
     * an array.
     *
     * @param nums 2 <= nums.length <= 1000
     *             -109 <= nums[i] <= 109
     */
    boolean findSubarrays(int[] nums);
}
