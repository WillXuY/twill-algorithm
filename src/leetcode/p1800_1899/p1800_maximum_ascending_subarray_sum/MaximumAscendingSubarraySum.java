package leetcode.p1800_1899.p1800_maximum_ascending_subarray_sum;

public interface MaximumAscendingSubarraySum {
    /**
     * Given an array of positive integers nums, return the maximum
     * possible sum of an ascending subarray in nums.
     *
     * A subarray is defined as a contiguous sequence of numbers in an
     * array.
     *
     * A subarray [nums_l, nums_(l+1), ..., nums_(r-1), nums_r] is
     * ascending if for all i where l <= i < r, nums_i < nums_(i+1).
     * Note that a subarray of size 1 is ascending.
     *
     * @param nums 1 <= nums.length <= 100
     *             1 <= nums[i] <= 100
     */
    int maxAscendingSum(int[] nums);
}
