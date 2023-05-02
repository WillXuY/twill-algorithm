package org.willxu.algorithm.service.string;

public interface ReverseWordsInString {
    /**
     * Given an input string s, reverse the order of the words.
     * <p>
     * A word is defined as a sequence of non-space characters. The
     * words in s will be separated by at least one space.
     * <p>
     * Return a string of the words in reverse order concatenated by a
     * single space.
     * <p>
     * Note that s may contain leading or trailing spaces or multiple
     * spaces between two words. The returned string should only have a
     * single space separating the words. Do not include any extra spaces.
     *
     * @param s 1 <= s.length <= 104
     *          contains English letters (upper-case and lower-case),
     *          digits, and spaces ' '.
     *          There is at least one word in s.
     */
    String reverseWords(String s);
}
