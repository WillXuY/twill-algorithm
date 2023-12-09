package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface TopkFrequentWords {
    /**
     * Given an array of strings words and an integer k, return the k
     * most frequent strings.
     * <p>
     * Return the answer sorted by the frequency from highest to lowest.
     * Sort the words with the same frequency by their lexicographical
     * order.
     *
     * @param words 1 <= words.length <= 500
     *              1 <= words[i].length <= 10
     *              words[i] consists of lowercase English letters.
     * @param k is in the range [1, The number of unique words[i]]
     */
    List<String> topKFrequent(String[] words, int k);
}
