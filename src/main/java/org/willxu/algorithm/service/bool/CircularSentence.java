package org.willxu.algorithm.service.bool;

public interface CircularSentence {
    /**
     * A sentence is a list of words that are separated by a single
     * space with no leading or trailing spaces.
     * <p>
     * - For example, "Hello World", "HELLO", "hello world hello world"
     *   are all sentences.
     * <p>
     * Words consist of only uppercase and lowercase English letters.
     * Uppercase and lowercase English letters are considered different.
     * <p>
     * A sentence is circular if:
     * <p>
     * - The last character of a word is equal to the first character of
     *   the next word.
     * - The last character of the last word is equal to the first
     *   character of the first word.
     * <p>
     * For example, "leetcode exercises sound delightful", "eetcode",
     * "leetcode eats soul" are all circular sentences. However,
     * "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like
     * Leetcode" are not circular sentences.
     * <p>
     * Given a string sentence, return true if it is circular.
     * Otherwise, return false.
     *
     * @param sentence 1 <= sentence.length <= 500
     *                 sentence consist of only lowercase and uppercase
     *                 English letters and spaces.
     *                 The words in sentence are separated by a single
     *                 space.
     *                 There are no leading or trailing spaces.
     */
    boolean isCircularSentence(String sentence);
}
