package org.willxu.algorithm.service.integer;

public interface MaximumNumberOfOccurrencesOfSubstring {
    /**
     * Given a string s, return the maximum number of occurrences of any
     * substring under the following rules:
     * <p>
     * - The number of unique characters in the substring must be less
     *   than or equal to maxLetters.
     * - The substring size must be between minSize and maxSize
     *   inclusive.
     *
     * @param s 1 <= s.length <= 10^5
     *          s consists of only lowercase English letters.
     * @param maxLetters 1 <= maxLetters <= 26
     * @param minSize,maxSize 1 <= minSize <= maxSize <= min(26, s.length)
     */
    int maxFreq(String s, int maxLetters, int minSize, int maxSize);
}
