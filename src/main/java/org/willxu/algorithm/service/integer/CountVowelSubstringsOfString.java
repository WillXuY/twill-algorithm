package org.willxu.algorithm.service.integer;

public interface CountVowelSubstringsOfString {
    /**
     * A substring is a contiguous (non-empty) sequence of characters
     * within a string.
     * <p>
     * A vowel substring is a substring that only consists of vowels
     * ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in
     * it.
     * <p>
     * Given a string word, return the number of vowel substrings in
     * word.
     *
     * @param word 1 <= word.length <= 100
     *             word consists of lowercase English letters only.
     */
    int countVowelSubstrings(String word);
}
