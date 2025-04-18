package org.willxu.algorithm.service.string;

public interface TruncateSentence {
    /**
     * A sentence is a list of words that are separated by a single
     * space with no leading or trailing spaces. Each of the words
     * consists of only uppercase and lowercase English letters
     * (no punctuation).
     *
     * - For example, "Hello World", "HELLO", and "hello world hello
     * world" are all sentences.
     * You are given a sentence s and an integer k. You want to truncate
     * s such that it contains only the first k words. Return s after
     * truncating it.
     *
     * @param s 1 <= s.length <= 500
     *          consist of only lowercase and uppercase English letters
     *          and spaces.
     *          The words in s are separated by a single space.
     *          There are no leading or trailing spaces.
     * @param k is in the range [1, the number of words in s].
     */
    String truncateSentence(String s, int k);
}
