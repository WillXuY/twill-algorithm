package org.willxu.algorithm.service.integer;

public interface TwoKeysKeyboard {
    /**
     * There is only one character 'A' on the screen of a notepad. You
     * can perform one of two operations on this notepad for each step:
     * <p>
     * - Copy All: You can copy all the characters present on the screen
     *   (a partial copy is not allowed).
     * - Paste: You can paste the characters which are copied last time.
     * <p>
     * Given an integer n, return the minimum number of operations to
     * get the character 'A' exactly n times on the screen.
     *
     * @param n 1 <= n <= 1000
     */
    int minSteps(int n);
}
