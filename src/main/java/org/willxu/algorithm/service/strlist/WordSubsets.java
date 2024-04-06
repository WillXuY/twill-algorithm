package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface WordSubsets {
    /**
     * You are given two string arrays words1 and words2.
     * <p>
     * A string b is a subset of string a if every letter in b occurs in
     * a including multiplicity.
     * <p>
     * - For example, "wrr" is a subset of "warrior" but is not a subset
     *   of "world".
     * <p>
     * A string a from words1 is universal if for every string b in
     * words2, b is a subset of a.
     * <p>
     * Return an array of all the universal strings in words1. You may
     * return the answer in any order.
     *
     * @param words1 1 <= words1.length <= 10^4
     *               1 <= words1[i].length <= 10
     *               consist only of lowercase English letters.
     *               All the strings of words1 are unique.
     * @param words2 1 <= words2[i].length <= 10
     *               1 <= words2.length <= 10^4
     *               consist only of lowercase English letters.
     */
    List<String> wordSubsets(String[] words1, String[] words2);
}
