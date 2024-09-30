package org.willxu.algorithm.service.string;

import java.util.List;

public interface SmallestStringWithSwaps {
    /**
     * You are given a string s, and an array of pairs of indices in the
     * string pairs where pairs[i] = [a, b] indicates 2
     * indices(0-indexed) of the string.
     * <p>
     * You can swap the characters at any pair of indices in the given
     * pairs any number of times.
     * <p>
     * Return the lexicographically smallest string that s can be
     * changed to after using the swaps.
     *
     * @param s 1 <= s.length <= 10^5
     *          only contains lower case English letters.
     * @param pairs 0 <= pairs.length <= 10^5
     *              0 <= pairs[i][0], pairs[i][1] < s.length
     */
    String smallestStringWithSwaps(String s, List<List<Integer>> pairs);
}
