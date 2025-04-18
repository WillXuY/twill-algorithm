package org.willxu.algorithm.service.string;

public interface SortingTheSentence {
    /**
     * A sentence is a list of words that are separated by a single
     * space with no leading or trailing spaces. Each word consists of
     * lowercase and uppercase English letters.
     *
     * A sentence can be shuffled by appending the 1-indexed word
     * position to each word then rearranging the words in the sentence.
     *
     * - For example, the sentence "This is a sentence" can be shuffled
     * as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
     *
     * Given a shuffled sentence s containing no more than 9 words,
     * reconstruct and return the original sentence.
     *
     * @param s 2 <= s.length <= 200
     *          consists of lowercase and uppercase English letters,
     *          spaces, and digits from 1 to 9.
     *          The number of words in s is between 1 and 9.
     *          The words in s are separated by a single space.
     *          contains no leading or trailing spaces.
     */
    String sortSentence(String s);
}
