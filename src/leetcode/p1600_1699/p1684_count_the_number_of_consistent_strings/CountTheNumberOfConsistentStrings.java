package leetcode.p1600_1699.p1684_count_the_number_of_consistent_strings;

public interface CountTheNumberOfConsistentStrings {
    /**
     * You are given a string allowed consisting of distinct characters
     * and an array of strings words. A string is consistent if all
     * characters in the string appear in the string allowed.
     *
     * Return the number of consistent strings in the array words.
     *
     * @param allowed 1 <= allowed.length <= 26
     *                The characters in allowed are distinct.
     *                contain only lowercase English letters.
     * @param words 1 <= words.length <= 104
     *              1 <= words[i].length <= 10
     *              contain only lowercase English letters.
     */
    int countConsistentStrings(String allowed, String[] words);
}
