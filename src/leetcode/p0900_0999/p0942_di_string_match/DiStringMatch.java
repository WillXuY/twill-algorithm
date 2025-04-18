package org.willxu.algorithm.service.ints;

public interface DiStringMatch {
    /**
     * A permutation perm of n + 1 integers of all the integers in the
     * range [0, n] can be represented as a string s of length n where:
     * - s[i] == 'I' if perm[i] < perm[i + 1], and
     * - s[i] == 'D' if perm[i] > perm[i + 1].
     * Given a string s, reconstruct the permutation perm and return it.
     * If there are multiple valid permutations perm, return any of
     * them.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either 'I' or 'D'.
     * @return any integer array match the di string[].
     */
    int[] diStringMatch(String s);
}
