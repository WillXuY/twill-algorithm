package org.willxu.algorithm.service.integer;

public interface FindWordsThatCanBeFormedByCharacters {
    /**
     * You are given an array of strings words and a string chars.
     * A string is good if it can be formed by characters from chars
     * (each character can only be used once).
     * Return the sum of lengths of all good strings in words.
     *
     * @param words 1 <= words.length <= 1000
     *              1 <= words[i].length <= 100
     *              consist of lowercase English letters.
     * @param chars 1 <= chars.length <= 100
     *              consist of lowercase English letters.
     * @return sum of lengths of all good strings in words.
     */
    int countCharacters(String[] words, String chars);
}
