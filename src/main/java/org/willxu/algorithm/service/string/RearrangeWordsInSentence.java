package org.willxu.algorithm.service.string;

public interface RearrangeWordsInSentence {
    /**
     * Given a sentence text (A sentence is a string of space-separated
     * words) in the following format:
     * <p>
     * - First letter is in upper case.
     * - Each word in text are separated by a single space.
     * <p>
     * Your task is to rearrange the words in text such that all words
     * are rearranged in an increasing order of their lengths. If two
     * words have the same length, arrange them in their original order.
     * <p>
     * Return the new text following the format shown above.
     *
     * @param text text begins with a capital letter and then contains
     *             lowercase letters and single space between words.
     *             1 <= text.length <= 10^5
     */
    String arrangeWords(String text);
}
