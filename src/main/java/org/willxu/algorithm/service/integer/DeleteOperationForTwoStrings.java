package org.willxu.algorithm.service.integer;

public interface DeleteOperationForTwoStrings {
    /**
     * Given two strings word1 and word2, return the minimum number of
     * steps required to make word1 and word2 the same.
     * <p>
     * In one step, you can delete exactly one character in either
     * string.
     *
     * @param word1,word2 1 <= word1.length, word2.length <= 500
     *                    consist of only lowercase English letters.
     */
    int minDistance(String word1, String word2);
}
