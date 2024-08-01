package org.willxu.algorithm.service.integer;

public interface LongestStringChain {
    /**
     * You are given an array of words where each word consists of
     * lowercase English letters.
     * <p>
     * word_A is a predecessor of word_B if and only if we can insert
     * exactly one letter anywhere in word_A without changing the order
     * of the other characters to make it equal to word_B.
     * <p>
     * For example, "abc" is a predecessor of "abac", while "cba" is not
     * a predecessor of "bcad".
     * <p>
     * A word chain is a sequence of words [word_1, word_2, ..., word_k]
     * with k >= 1, where word1 is a predecessor of word_2, word_2 is a
     * predecessor of word_3, and so on. A single word is trivially a
     * word chain with k == 1.
     * <p>
     * Return the length of the longest possible word chain with words
     * chosen from the given list of words.
     *
     * @param words 1 <= words.length <= 1000
     *              1 <= words[i].length <= 16
     *              words[i] only consists of lowercase English letters.
     */
    int longestStrChain(String[] words);
}
