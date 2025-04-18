package org.willxu.algorithm.service.bool;

public interface RedistributeCharactersToMakeAllStringsEqual {
    /**
     * You are given an array of strings words (0-indexed).
     *
     * In one operation, pick two distinct indices i and j, where
     * words[i] is a non-empty string, and move any character from
     * words[i] to any position in words[j].
     *
     * Return true if you can make every string in words equal using any
     * number of operations, and false otherwise.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              words[i] consists of lowercase English letters.
     */
    boolean makeEqual(String[] words);
}
