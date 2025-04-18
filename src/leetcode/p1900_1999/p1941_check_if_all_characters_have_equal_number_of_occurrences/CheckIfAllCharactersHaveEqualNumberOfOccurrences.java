package org.willxu.algorithm.service.bool;

public interface CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    /**
     * Given a string s, return true if s is a good string, or false
     * otherwise.
     * <p>
     * A string s is good if all the characters that appear in s have
     * the same number of occurrences (i.e., the same frequency).
     *
     * @param s 1 <= s.length <= 1000
     *          s consists of lowercase English letters.
     */
    boolean areOccurrencesEqual(String s);
}
