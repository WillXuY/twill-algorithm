package org.willxu.algorithm.service.integer;

public interface GetEqualSubstringsWithinBudget {
    /**
     * You are given two strings s and t of the same length and an
     * integer maxCost.
     * <p>
     * You want to change s to t. Changing the i^th character of s to
     * i^th character of t costs |s[i] - t[i]| (i.e., the absolute
     * difference between the ASCII values of the characters).
     * <p>
     * Return the maximum length of a substring of s that can be changed
     * to be the same as the corresponding substring of t with a cost
     * less than or equal to maxCost. If there is no substring from s
     * that can be changed to its corresponding substring from t,
     * return 0.
     *
     * @param s,t 1 <= s.length <= 10^5
     *            t.length == s.length
     *            consist of only lowercase English letters.
     * @param maxCost 0 <= maxCost <= 10^6
     */
    int equalSubstring(String s, String t, int maxCost);
}
