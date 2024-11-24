package org.willxu.algorithm.service.integer;

public interface MinumumNumberOfStepsToMakeTwoStringsAnagram {
    /**
     * You are given two strings of the same length s and t. In one step
     * you can choose any character of t and replace it with another
     * character.
     * <p>
     * Return the minimum number of steps to make t an anagram of s.
     * <p>
     * An Anagram of a string is a string that contains the same
     * characters with a different (or the same) ordering.
     *
     * @param s 1 <= s.length <= 5 * 10^4
     *          consist of lowercase English letters only.
     * @param t s.length == t.length
     *          consist of lowercase English letters only.
     */
    int minSteps(String s, String t);
}
