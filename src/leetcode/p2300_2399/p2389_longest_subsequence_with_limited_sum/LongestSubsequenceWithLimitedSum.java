package leetcode.p2300_2399.p2389_longest_subsequence_with_limited_sum;

public interface LongestSubsequenceWithLimitedSum {
    /**
     * You are given an integer array nums of length n, and an integer
     * array queries of length m.
     * <p>
     * Return an array answer of length m where answer[i] is the maximum
     * size of a subsequence that you can take from nums such that the
     * sum of its elements is less than or equal to queries[i].
     * <p>
     * A subsequence is an array that can be derived from another array
     * by deleting some or no elements without changing the order of the
     * remaining elements.
     *
     * @param nums n == nums.length
     * @param queries m == queries.length
     *                1 <= n, m <= 1000
     *                1 <= nums[i], queries[i] <= 106
     */
    int[] answerQueries(int[] nums, int[] queries);
}
