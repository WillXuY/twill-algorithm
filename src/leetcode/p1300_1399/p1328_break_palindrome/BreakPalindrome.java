package org.willxu.algorithm.service.string;

public interface BreakPalindrome {
    /**
     * Given a palindromic string of lowercase English letters
     * palindrome, replace exactly one character with any lowercase
     * English letter so that the resulting string is not a palindrome
     * and that it is the lexicographically smallest one possible.
     * <p>
     * Return the resulting string. If there is no way to replace a
     * character to make it not a palindrome, return an empty string.
     * <p>
     * A string a is lexicographically smaller than a string b (of the
     * same length) if in the first position where a and b differ, a has
     * a character strictly smaller than the corresponding character in
     * b. For example, "abcc" is lexicographically smaller than "abcd"
     * because the first position they differ is at the fourth
     * character, and 'c' is smaller than 'd'.
     *
     * @param palindrome 1 <= palindrome.length <= 1000
     *                   palindrome consists of only lowercase English
     *                   letters.
     */
    String breakPalindrome(String palindrome);
}
