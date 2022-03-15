package org.willxu.algorithm.service.integer;

public interface RemovePalindromicSubsequences {
    /**
     * You are given a string s consisting only of letters 'a' and 'b'.
     * In a single step you can remove one palindromic subsequence from
     * s.
     * Return the minimum number of steps to make the given string
     * empty.
     * A string is a subsequence of a given string if it is generated by
     * deleting some characters of a given string without changing its
     * order. Note that a subsequence does not necessarily need to be
     * contiguous.
     * A string is called palindrome if is one that reads the same
     * backward as well as forward.
     *
     * @param s 1 <= s.length <= 1000
     *          s[i] is either 'a' or 'b'.
     * @return the minimum number of steps to empty the string.
     */
    int removePalindromeSub(String s);
}
