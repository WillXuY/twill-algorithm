package leetcode.p1900_1999.p1961_check_if_string_is_prefix_of_array;

public interface CheckIfStringIsPrefixOfArray {
    /**
     * Given a string s and an array of strings words, determine whether
     * s is a prefix string of words.
     * <p>
     * A string s is a prefix string of words if s can be made by
     * concatenating the first k strings in words for some positive k no
     * larger than words.length.
     * <p>
     * Return true if s is a prefix string of words, or false otherwise.
     *
     * @param s 1 <= s.length <= 1000
     *          consist of only lowercase English letters.
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 20
     *              consist of only lowercase English letters.
     */
    boolean isPrefixString(String s, String[] words);
}
