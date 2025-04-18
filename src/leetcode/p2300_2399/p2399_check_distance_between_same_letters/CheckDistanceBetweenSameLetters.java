package org.willxu.algorithm.service.bool;

public interface CheckDistanceBetweenSameLetters {
    /**
     * You are given a 0-indexed string s consisting of only lowercase
     * English letters, where each letter in s appears exactly twice.
     * You are also given a 0-indexed integer array distance of length
     * 26.
     * <p>
     * Each letter in the alphabet is numbered from 0 to 25 (i.e.
     * 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).
     * <p>
     * In a well-spaced string, the number of letters between the two
     * occurrences of the ith letter is distance[i]. If the ith letter
     * does not appear in s, then distance[i] can be ignored.
     * <p>
     * Return true if s is a well-spaced string, otherwise return false.
     *
     * @param s 2 <= s.length <= 52
     *          consists only of lowercase English letters.
     *          Each letter appears in s exactly twice.
     * @param distance distance.length == 26
     *                 0 <= distance[i] <= 50
     */
    boolean checkDistances(String s, int[] distance);
}
