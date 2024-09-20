package org.willxu.algorithm.service.ints;

public interface CompareStringsByFrequencyOfTheSmallestCharacter {
    /**
     * Let the function f(s) be the frequency of the lexicographically
     * smallest character in a non-empty string s. For example, if
     * s = "dcce" then f(s) = 2 because the lexicographically smallest
     * character is 'c', which has a frequency of 2.
     * <p>
     * You are given an array of strings words and another array of
     * query strings queries. For each query queries[i], count the
     * number of words in words such that f(queries[i]) < f(W) for each
     * W in words.
     * <p>
     * Return an integer array answer, where each answer[i] is the
     * answer to the i^th query.
     *
     * @param queries 1 <= queries.length <= 2000
     *                1 <= queries[i].length <= 10
     *                consist of lowercase English letters.
     * @param words 1 <= words.length <= 2000
     *              1 <= words[i].length <= 10
     *              consist of lowercase English letters.
     */
    int[] numSmallerByFrequency(String[] queries, String[] words);
}
