package leetcode.p1700_1799.p1768_merge_strings_alternately;

public interface MergeStringsAlternately {
    /**
     * You are given two strings word1 and word2. Merge the strings by
     * adding letters in alternating order, starting with word1. If a
     * string is longer than the other, append the additional letters
     * onto the end of the merged string.
     *
     * Return the merged string.
     *
     * @param word1 1 <= word1.length <= 100
     *              consist of lowercase English letters.
     * @param word2 1 <= word2.length <= 100
     *              consist of lowercase English letters.
     */
    String mergeAlternately(String word1, String word2);
}
