package leetcode.p2100_2199.p2176_count_equal_and_divisible_pairs_in_an_array;

public interface CountEqualAndDivisiblePairsInAnArray {
    /**
     * Given a 0-indexed integer array nums of length n and an integer
     * k, return the number of pairs (i, j) where 0 <= i < j < n, such
     * that nums[i] == nums[j] and (i * j) is divisible by k.
     *
     * @param nums,k 1 <= nums.length <= 100
     *               1 <= nums[i], k <= 100
     */
    int countPairs(int[] nums, int k);
}
