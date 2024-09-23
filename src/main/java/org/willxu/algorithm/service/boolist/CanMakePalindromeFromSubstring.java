package org.willxu.algorithm.service.boolist;

import java.util.List;

public interface CanMakePalindromeFromSubstring {
    /**
     * You are given a string s and array queries where
     * queries[i] = [left_i, right_i, k_i]. We may rearrange the
     * substring s[left_i...right_i] for each query and then choose up
     * to k_i of them to replace with any lowercase English letter.
     * <p>
     * If the substring is possible to be a palindrome string after the
     * operations above, the result of the query is true. Otherwise, the
     * result is false.
     * <p>
     * Return a boolean array answer where answer[i] is the result of
     * the i^th query queries[i].
     * <p>
     * Note that each letter is counted individually for replacement, so
     * if, for example s[left_i...right_i] = "aaa", and k_i = 2, we can
     * only replace two of the letters. Also, note that no query
     * modifies the initial string s.
     *
     * @param s 1 <= s.length <= 10^5
     *          0 <= k_i <= s.length
     *          consists of lowercase English letters.
     * @param queries 1 <= queries.length <= 10^5
     *                0 <= left_i <= right_i < s.length
     */
    List<Boolean> canMakePaliQueries(String s, int[][] queries);
}
