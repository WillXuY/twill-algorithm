package org.willxu.algorithm.service.integer;

public interface CountCommonWordsWithOneOccurrence {
    /**
     * Given two string arrays words1 and words2, return the number of
     * strings that appear exactly once in each of the two arrays.
     *
     * @param words1,words2 1 <= words1.length, words2.length <= 1000
     *        1 <= words1[i].length, words2[j].length <= 30
     *        consists only of lowercase English letters.
     */
    int countWords(String[] words1, String[] words2);
}
