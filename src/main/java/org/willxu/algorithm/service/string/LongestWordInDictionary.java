package org.willxu.algorithm.service.string;

public interface LongestWordInDictionary {
    /**
     * Given an array of strings words representing an English
     * Dictionary, return the longest word in words that can be built
     * one character at a time by other words in words.
     * <p>
     * If there is more than one possible answer, return the longest
     * word with the smallest lexicographical order. If there is no
     * answer, return the empty string.
     * <p>
     * Note that the word should be built from left to right with each
     * additional character being added to the end of a previous word.
     *
     * @param words 1 <= words.length <= 1000
     *              1 <= words[i].length <= 30
     *              words[i] consists of lowercase English letters.
     */
    String longestWord(String[] words);
}
