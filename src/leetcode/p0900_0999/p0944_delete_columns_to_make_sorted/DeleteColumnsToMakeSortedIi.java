package org.willxu.algorithm.service.integer;

public interface DeleteColumnsToMakeSortedIi {
    /**
     * You are given an array of n strings strs, all of the same length.
     * <p>
     * We may choose any deletion indices, and we delete all the
     * characters in those indices for each string.
     * <p>
     * For example, if we have strs = ["abcdef","uvwxyz"] and deletion
     * indices {0, 2, 3}, then the final array after deletions is
     * ["bef", "vyz"].
     * <p>
     * Suppose we chose a set of deletion indices answer such that after
     * deletions, the final array has its elements in lexicographic
     * order (i.e., strs[0] <= strs[1] <= strs[2] <= ... <= strs[n - 1]).
     * Return the minimum possible value of answer.length.
     *
     * @param strs n == strs.length
     *             1 <= n <= 100
     *             1 <= strs[i].length <= 100
     *             strs[i] consists of lowercase English letters.
     */
    int minDeletionSize(String[] strs);
}
