package org.willxu.algorithm.service.integer;

public interface UniqueSubstringsInWraparoundString {
    /**
     * We define the string base to be the infinite wraparound string of
     * "abcdefghijklmnopqrstuvwxyz", so base will look like this:
     * <p>
     * - "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".
     * <p>
     * Given a string s, return the number of unique non-empty
     * substrings of s are present in base.
     *
     * @param s 1 <= s.length <= 10^5
     *          s consists of lowercase English letters.
     */
    int findSubstringInWraproundString(String s);
}
