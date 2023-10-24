package org.willxu.algorithm.service.bool;

public interface PermutationInString {
    /**
     * Given two strings s1 and s2, return true if s2 contains a
     * permutation of s1, or false otherwise.
     * <p>
     * In other words, return true if one of s1's permutations is the
     * substring of s2.
     *
     * @param s1,s2 1 <= s1.length, s2.length <= 10^4
     *              s1 and s2 consist of lowercase English letters.
     */
    boolean checkInclusion(String s1, String s2);
}
