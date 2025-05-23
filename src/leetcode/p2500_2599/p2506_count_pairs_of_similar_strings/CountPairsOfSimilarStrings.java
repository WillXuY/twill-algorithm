package leetcode.p2500_2599.p2506_count_pairs_of_similar_strings;

public interface CountPairsOfSimilarStrings {
    /**
     * You are given a 0-indexed string array words.
     * <p>
     * Two strings are similar if they consist of the same characters.
     * <p>
     * - For example, "abca" and "cba" are similar since both consist of
     *   characters 'a', 'b', and 'c'.
     * - However, "abacba" and "bcfd" are not similar since they do not
     *   consist of the same characters.
     * <p>
     * Return the number of pairs (i, j) such that 0 <= i < j <=
     * word.length - 1 and the two strings words[i] and words[j] are
     * similar.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              words[i] consist of only lowercase English letters.
     */
    int similarPairs(String[] words);
}
