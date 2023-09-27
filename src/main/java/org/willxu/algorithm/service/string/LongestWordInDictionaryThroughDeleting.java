package org.willxu.algorithm.service.string;

import java.util.List;

public interface LongestWordInDictionaryThroughDeleting {
    /**
     * Given a string s and a string array dictionary, return the
     * longest string in the dictionary that can be formed by deleting
     * some of the given string characters. If there is more than one
     * possible result, return the longest word with the smallest
     * lexicographical order. If there is no possible result, return the
     * empty string.
     *
     * @param s 1 <= s.length <= 1000
     *          consist of lowercase English letters.
     * @param dictionary 1 <= dictionary.length <= 1000
     *                   1 <= dictionary[i].length <= 1000
     *                   consist of lowercase English letters.
     */
    String findLongestWord(String s, List<String> dictionary);
}
