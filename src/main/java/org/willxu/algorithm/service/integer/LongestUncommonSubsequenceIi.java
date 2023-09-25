package org.willxu.algorithm.service.integer;

public interface LongestUncommonSubsequenceIi {
    /**
     * Given an array of strings strs, return the length of the longest
     * uncommon subsequence between them. If the longest uncommon
     * subsequence does not exist, return -1.
     * <p>
     * An uncommon subsequence between an array of strings is a string
     * that is a subsequence of one string but not the others.
     * <p>
     * A subsequence of a string s is a string that can be obtained
     * after deleting any number of characters from s.
     * <p>
     * For example, "abc" is a subsequence of "aebdc" because you can
     * delete the underlined characters in "aebdc" to get "abc". Other
     * subsequences of "aebdc" include "aebdc", "aeb",
     * and "" (empty string).
     *
     * @param strs 2 <= strs.length <= 50
     *             1 <= strs[i].length <= 10
     *             strs[i] consists of lowercase English letters.
     */
    int findLUSlength(String[] strs);
}
