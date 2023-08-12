package org.willxu.algorithm.service.integer;

public interface LongestRepeatingCharacterReplacement {
    /**
     * You are given a string s and an integer k. You can choose any
     * character of the string and change it to any other uppercase
     * English character. You can perform this operation at most k times.
     * <p>
     * Return the length of the longest substring containing the same
     * letter you can get after performing the above operations.
     *
     * @param s 1 <= s.length <= 10^5
     *          s consists of only uppercase English letters.
     * @param k 0 <= k <= s.length
     */
    int characterReplacement(String s, int k);
}
