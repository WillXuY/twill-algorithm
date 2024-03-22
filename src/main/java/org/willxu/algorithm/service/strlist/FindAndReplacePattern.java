package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface FindAndReplacePattern {
    /**
     * Given a list of strings words and a string pattern, return a
     * list of words[i] that match pattern. You may return the answer in
     * any order.
     * <p>
     * A word matches the pattern if there exists a permutation of
     * letters p so that after replacing every letter x in the pattern
     * with p(x), we get the desired word.
     * <p>
     * Recall that a permutation of letters is a bijection from letters
     * to letters: every letter maps to another letter, and no two
     * letters map to the same letter.
     *
     * @param words 1 <= pattern.length <= 20
     *              1 <= words.length <= 50
     *              are lowercase English letters.
     * @param pattern words[i].length == pattern.length
     *                are lowercase English letters.
     */
    List<String> findAndReplacePattern(String[] words, String pattern);
}
