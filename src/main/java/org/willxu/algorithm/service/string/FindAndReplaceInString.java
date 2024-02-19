package org.willxu.algorithm.service.string;

public interface FindAndReplaceInString {
    /**
     * You are given a 0-indexed string s that you must perform k
     * replacement operations on. The replacement operations are given
     * as three 0-indexed parallel arrays, indices, sources, and
     * targets, all of length k.
     * <p>
     * To complete the i^th replacement operation:
     * <p>
     * 1. Check if the substring sources[i] occurs at index indices[i]
     *    in the original string s.
     * 2. If it does not occur, do nothing.
     * 3. Otherwise if it does occur, replace that substring with
     *    targets[i].
     * <p>
     * For example, if s = "abcd", indices[i] = 0, sources[i] = "ab",
     * and targets[i] = "eee", then the result of this replacement will
     * be "eeecd".
     * <p>
     * All replacement operations must occur simultaneously, meaning the
     * replacement operations should not affect the indexing of each
     * other. The testcases will be generated such that the replacements
     * will not overlap.
     * <p>
     * - For example, a testcase with s = "abc", indices = [0, 1], and
     *   sources = ["ab","bc"] will not be generated because the "ab"
     *   and "bc" replacements overlap.
     * <p>
     * Return the resulting string after performing all replacement
     * operations on s.
     * <p>
     * A substring is a contiguous sequence of characters in a string.
     *
     * @param s 1 <= s.length <= 1000
     *          k == indices.length == sources.length == targets.length
     *          1 <= k <= 100
     * s consists of only lowercase English letters.
     * @param indices 0 <= indexes[i] < s.length
     * @param sources consist of only lowercase English letters.
     *                1 <= sources[i].length <= 50
     * @param targets consist of only lowercase English letters.
     *                1 <= targets[i].length <= 50
     */
    String findReplaceString(String s, int[] indices,
                             String[] sources, String[] targets);
}
