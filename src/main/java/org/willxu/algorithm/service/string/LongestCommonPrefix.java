package org.willxu.algorithm.service.string;

public interface LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string
     * amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     * @param strs - 1 <= strs.length <= 200
     *             - 0 <= strs[i].length <= 200
     *             - strs[i] consists of only lower-case English
     *             letters.
     * @return longest common prefix
     */
    String longestCommonPrefix(String[] strs);
}
