package leetcode.p0300_0399.p0307_range_sum_query_mutable;

/**
 * Given an integer array nums, handle multiple queries of the following
 * types:
 * <p>
 * Update the value of an element in nums.
 * <p>
 * Calculate the sum of the elements of nums between indices left and
 * right inclusive where left <= right.
 * <p>
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * <p>
 * 1 <= nums.length <= 3 * 10^4
 * <p>
 * At most 3 * 104 calls will be made to update and sumRange.
 */
public interface RangeSumQueryMutable {
    /**
     * Updates the value of nums[index] to be val.
     *
     * @param index 0 <= index < nums.length
     * @param va -100 <= val <= 100
     */
    void update(int index, int val);

    /**
     * @param left,right 0 <= left <= right < nums.length
     * @return the sum of the elements of nums between indices left and
     *         right inclusive
     *         (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     */
    int sumRange(int left, int right);
}
