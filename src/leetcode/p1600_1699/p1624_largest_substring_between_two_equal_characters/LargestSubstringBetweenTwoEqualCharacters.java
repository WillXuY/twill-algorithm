package leetcode.p1600_1699.p1624_largest_substring_between_two_equal_characters;

public interface LargestSubstringBetweenTwoEqualCharacters {
    /**
     * Given a string s, return the length of the longest substring
     * between two equal characters, excluding the two characters. If
     * there is no such substring return -1.
     *
     * A substring is a contiguous sequence of characters within a
     * string.
     *
     * @param s 1 <= s.length <= 300
     *          s contains only lowercase English letters.
     */
    int maxLengthBetweenEqualCharacters(String s);
}
