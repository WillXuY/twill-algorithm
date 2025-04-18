package org.willxu.algorithm.service.bool;

public interface CheckWhetherTwoStringsAreAlmostEquivalent {
    /**
     * Two strings word1 and word2 are considered almost equivalent if
     * the differences between the frequencies of each letter from 'a'
     * to 'z' between word1 and word2 is at most 3.
     * <p>
     * Given two strings word1 and word2, each of length n, return true
     * if word1 and word2 are almost equivalent, or false otherwise.
     * <p>
     * The frequency of a letter x is the number of times it occurs in
     * the string.
     *
     * @param word1,word2 n == word1.length == word2.length
     *                    1 <= n <= 100
     *                    consist only of lowercase English letters.
     */
    boolean checkAlmostEquivalent(String word1, String word2);
}
