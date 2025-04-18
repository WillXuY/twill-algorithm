package leetcode.p2100_2199.p2154_keep_multiplying_found_values_by_two;

public interface KeepMultiplyingFoundValuesByTwo {
    /**
     * You are given an array of integers nums. You are also given an
     * integer original which is the first number that needs to be
     * searched for in nums.
     * <p>
     * You then do the following steps:
     * <p>
     * - If original is found in nums, multiply it by two (i.e., set
     *   original = 2 * original).
     * - Otherwise, stop the process.
     * - Repeat this process with the new number as long as you keep
     *   finding the number.
     * <p>
     * Return the final value of original.
     *
     * @param nums 1 <= nums.length <= 1000
     * @param original 1 <= nums[i], original <= 1000
     */
    int findFinalValue(int[] nums, int original);
}
