package org.willxu.algorithm.service.bool;

public interface CheckIfStringCanBreakAnotherString {
    /**
     * Given two strings: s1 and s2 with the same size, check if some
     * permutation of string s1 can break some permutation of string s2
     * or vice-versa. In other words s2 can break s1 or vice-versa.
     * <p>
     * A string x can break string y (both of size n) if x[i] >= y[i]
     * (in alphabetical order) for all i between 0 and n-1.
     *
     * @param s1 s1.length == n
     *           1 <= n <= 10^5
     *           All strings consist of lowercase English letters.
     * @param s2 s2.length == n
     */
    boolean checkIfCanBreak(String s1, String s2);
}
