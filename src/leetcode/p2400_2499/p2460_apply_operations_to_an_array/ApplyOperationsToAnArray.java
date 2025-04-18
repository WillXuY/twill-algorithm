package leetcode.p2400_2499.p2460_apply_operations_to_an_array;

public interface ApplyOperationsToAnArray {
    /**
     * You are given a 0-indexed array nums of size n consisting of
     * non-negative integers.
     * <p>
     * You need to apply n - 1 operations to this array where, in the
     * ith operation (0-indexed), you will apply the following on the
     * ith element of nums:
     * <p>
     * - If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set
     *   nums[i + 1] to 0. Otherwise, you skip this operation.
     * <p>
     * After performing all the operations, shift all the 0's to the end
     * of the array.
     * <p>
     * - For example, the array [1,0,2,0,0,1] after shifting all its 0's
     *   to the end, is [1,2,1,0,0,0].
     * <p>
     * Return the resulting array.
     * <p>
     * Note that the operations are applied sequentially, not all at
     * once.
     *
     * @param nums 2 <= nums.length <= 2000
     *             0 <= nums[i] <= 1000
     */
    int[] applyOperations(int[] nums);
}
