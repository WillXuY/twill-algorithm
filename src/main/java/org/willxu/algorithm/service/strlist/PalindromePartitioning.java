package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface PalindromePartitioning {
    /**
     * Given a string s, partition s such that every substring of the
     * partition is a palindrome. Return all possible palindrome
     * partitioning of s.
     *
     * @param s 1 <= s.length <= 16
     *          contains only lowercase English letters.
     */
    List<List<String>> partition(String s);
}
