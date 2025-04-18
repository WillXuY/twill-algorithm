package leetcode.p2300_2399.p2341_maximum_number_of_pairs_in_array;

public interface MaximumNumberOfPairsInArray {
    /**
     * You are given a 0-indexed integer array nums. In one operation,
     * you may do the following:
     * <p>
     * - Choose two integers in nums that are equal.
     * - Remove both integers from nums, forming a pair.
     * <p>
     * The operation is done on nums as many times as possible.
     * <p>
     * Return a 0-indexed integer array answer of size 2 where answer[0]
     * is the number of pairs that are formed and answer[1] is the
     * number of leftover integers in nums after doing the operation as
     * many times as possible.
     *
     * @param nums 1 <= nums.length <= 100
     *             0 <= nums[i] <= 100
     */
    int[] numberOfPairs(int[] nums);
}
