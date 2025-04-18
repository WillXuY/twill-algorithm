package leetcode.p0300_0399.p0303_range_sum_query_immutable;

/**
 * Given an integer array nums, handle multiple queries of the following
 * type:
 * 1. Calculate the sum of the elements of nums between indices left and
 *    right inclusive where left <= right.
 * Implement the NumArray class:
 */
public abstract class AbstractNumArray {
    /**
     * NumArray(int[] nums) Initializes the object with the integer
     * array nums.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^5 <= nums[i] <= 10^5
     */
    public AbstractNumArray(int[] nums) {}

    /**
     * Sum the numbers array between left and right.
     *
     * @param left indices left inclusive
     *             0 <= left <= right < nums.length
     * @param right indices right inclusive
     * @return the sum of the elements of nums between in left and right
     *         (i.e. nums[left] + nums[left+1] + ... + nums[right].
     */
    public abstract int sumRange(int left, int right);
}
