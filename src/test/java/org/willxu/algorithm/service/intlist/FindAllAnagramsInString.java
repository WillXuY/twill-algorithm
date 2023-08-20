package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface FindAllAnagramsInString {
    /**
     * Given two strings s and p, return an array of all the start
     * indices of p's anagrams in s. You may return the answer in any
     * order.
     * <p>
     * An Anagram is a word or phrase formed by rearranging the letters
     * of a different word or phrase, typically using all the original
     * letters exactly once.
     *
     * @param s,p 1 <= s.length, p.length <= 3 * 10^4
     *            consist of lowercase English letters.
     */
    List<Integer> findAnagrams(String s, String p);
}
