package org.willxu.algorithm.service.integer;

public interface FlipStringToMonotoneIncreasing {
    /**
     * A binary string is monotone increasing if it consists of some
     * number of 0's (possibly none), followed by some number of 1's
     * (also possibly none).
     * <p>
     * You are given a binary string s. You can flip s[i] changing it
     * from 0 to 1 or from 1 to 0.
     * <p>
     * Return the minimum number of flips to make s monotone increasing.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either '0' or '1'.
     */
    int minFlipsMonoIncr(String s);
}
