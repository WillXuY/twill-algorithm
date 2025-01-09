package org.willxu.algorithm.service.integer;

public interface MaximumNumberOfVowelsInSubstringOfGivenLength {
    /**
     * Given a string s and an integer k, return the maximum number of
     * vowel letters in any substring of s with length k.
     * <p>
     * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
     *
     * @param s 1 <= s.length <= 10^5
     *          consists of lowercase English letters.
     * @param k 1 <= k <= s.length
     */
    int maxVowels(String s, int k);
}
