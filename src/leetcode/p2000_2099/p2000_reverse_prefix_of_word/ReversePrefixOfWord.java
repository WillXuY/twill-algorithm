package org.willxu.algorithm.service.string;

public interface ReversePrefixOfWord {
    /**
     * Given a 0-indexed string word and a character ch, reverse the
     * segment of word that starts at index 0 and ends at the index of
     * the first occurrence of ch (inclusive). If the character ch does
     * not exist in word, do nothing.
     * <p>
     * - For example, if word = "abcdefd" and ch = "d", then you should
     *   reverse the segment that starts at 0 and ends at 3 (inclusive).
     *   The resulting string will be "dcbaefd".
     * <p>
     * Return the resulting string.
     *
     * @param word 1 <= word.length <= 250
     *             consists of lowercase English letters.
     * @param ch is a lowercase English letter.
     */
    String reversePrefix(String word, char ch);
}
