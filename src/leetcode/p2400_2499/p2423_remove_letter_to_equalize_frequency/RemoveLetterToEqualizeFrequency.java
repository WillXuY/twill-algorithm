package org.willxu.algorithm.service.bool;

public interface RemoveLetterToEqualizeFrequency {
    /**
     * You are given a 0-indexed string word, consisting of lowercase
     * English letters. You need to select one index and remove the
     * letter at that index from word so that the frequency of every
     * letter present in word is equal.
     * <p>
     * Return true if it is possible to remove one letter so that the
     * frequency of all letters in word are equal, and false otherwise.
     * <p>
     * Note:
     * <p>
     * - The frequency of a letter x is the number of times it occurs in
     *   the string.
     * - You must remove exactly one letter and cannot choose to do
     *   nothing.
     *
     * @param word 2 <= word.length <= 100
     *             consists of lowercase English letters only.
     */
    boolean equalFrequency(String word);
}
