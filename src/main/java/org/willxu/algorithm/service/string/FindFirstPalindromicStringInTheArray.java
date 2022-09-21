package org.willxu.algorithm.service.string;

public interface FindFirstPalindromicStringInTheArray {
    /**
     * Given an array of strings words, return the first palindromic
     * string in the array. If there is no such string, return an empty
     * string "".
     * <p>
     * A string is palindromic if it reads the same forward and
     * backward.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              words[i] consists only of lowercase English letters.
     */
     String firstPalindrome(String[] words);
}
