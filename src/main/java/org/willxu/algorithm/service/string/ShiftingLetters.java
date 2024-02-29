package org.willxu.algorithm.service.string;

public interface ShiftingLetters {
    /**
     * You are given a string s of lowercase English letters and an
     * integer array shifts of the same length.
     * <p>
     * Call the shift() of a letter, the next letter in the alphabet,
     * (wrapping around so that 'z' becomes 'a').
     * <p>
     * - For example, shift('a') = 'b', shift('t') = 'u', and
     *   shift('z') = 'a'.
     * <p>
     * Now for each shifts[i] = x, we want to shift the first i + 1
     * letters of s, x times.
     * <p>
     * Return the final string after all such shifts to s are applied.
     *
     * @param s 1 <= s.length <= 10^5
     *          s consists of lowercase English letters.
     * @param shifts shifts.length == s.length
     *               0 <= shifts[i] <= 10^9
     */
    String shiftingLetters(String s, int[] shifts);
}
