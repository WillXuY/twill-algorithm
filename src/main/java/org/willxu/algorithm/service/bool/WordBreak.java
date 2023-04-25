package org.willxu.algorithm.service.bool;

import java.util.List;

public interface WordBreak {
    /**
     * Given a string s and a dictionary of strings wordDict, return
     * true if s can be segmented into a space-separated sequence of one
     * or more dictionary words.
     * <p>
     * Note that the same word in the dictionary may be reused multiple
     * times in the segmentation.
     *
     * @param s 1 <= s.length <= 300
     *          consist of only lowercase English letters.
     * @param wordDict 1 <= wordDict.length <= 1000
     *                 1 <= wordDict[i].length <= 20
     *                 consist of only lowercase English letters.
     *                 All the strings of wordDict are unique.
     */
    boolean wordBreak(String s, List<String> wordDict);
}
