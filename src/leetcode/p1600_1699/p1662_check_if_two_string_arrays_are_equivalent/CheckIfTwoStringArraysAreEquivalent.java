package leetcode.p1600_1699.p1662_check_if_two_string_arrays_are_equivalent;

public interface CheckIfTwoStringArraysAreEquivalent {
    /**
     * Given two string arrays word1 and word2, return true if the two
     * arrays represent the same string, and false otherwise.
     *
     * A string is represented by an array if the array elements
     * concatenated in order forms the string.
     *
     * @param word1,word2 1 <= word1.length, word2.length <= 103
     *        1 <= word1[i].length, word2[i].length <= 103
     *        1 <= sum(word1[i].length), sum(word2[i].length) <= 103
     *        word1[i] and word2[i] consist of lowercase letters.
     */
    boolean arrayStringsAreEqual(String[] word1, String[] word2);
}
