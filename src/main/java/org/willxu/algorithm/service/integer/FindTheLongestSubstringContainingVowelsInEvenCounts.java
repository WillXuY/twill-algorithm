package org.willxu.algorithm.service.integer;

public interface FindTheLongestSubstringContainingVowelsInEvenCounts {
    /**
     * Given the string s, return the size of the longest substring
     * containing each vowel an even number of times. That is, 'a', 'e',
     * 'i', 'o', and 'u' must appear an even number of times.
     *
     * @param s 1 <= s.length <= 5 x 10^5
     *          contains only lowercase English letters.
     */
    int findTheLongestSubstring(String s);
}
