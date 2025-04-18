package leetcode.p2300_2399.p2357_make_array_zero_by_subtracting_equal_amounts;

public interface MakeArrayZeroBySubtractingEqualAmounts {
    /**
     * You are given a non-negative integer array nums. In one
     * operation, you must:
     * <p>
     * - Choose a positive integer x such that x is less than or equal
     *   to the smallest non-zero element in nums.
     * - Subtract x from every positive element in nums.
     * <p>
     * Return the minimum number of operations to make every element in
     * nums equal to 0.
     *
     * @param nums 1 <= nums.length <= 100
     *             0 <= nums[i] <= 100
     */
    int minimumOperations(int[] nums);
}
