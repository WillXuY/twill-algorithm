package leetcode.p1800_1899.p1876_substrings_of_size_three_with_distinct_characters;

public interface SubstringsOfSizeThreeWithDistinctCharacters {
    /**
     * A string is good if there are no repeated characters.
     *
     * Given a string s, return the number of good substrings of length
     * three in s.
     *
     * Note that if there are multiple occurrences of the same
     * substring, every occurrence should be counted.
     *
     * A substring is a contiguous sequence of characters in a string.
     *
     * @param s 1 <= s.length <= 100
     *          s consists of lowercase English letters.
     */
    int countGoodSubstrings(String s);
}
