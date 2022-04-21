package org.willxu.algorithm.service.integer;

public interface CheckIfWordOccursAsPrefixOfAnyWordInSentence {
    /**
     * Given a sentence that consists of some words separated by a
     * single space, and a searchWord, check if searchWord is a prefix
     * of any word in sentence.
     *
     * Return the index of the word in sentence (1-indexed) where
     * searchWord is a prefix of this word. If searchWord is a prefix of
     * more than one word, return the index of the first word (minimum
     * index). If there is no such word return -1.
     *
     * A prefix of a string s is any leading contiguous substring of s.
     *
     * @param sentence 1 <= sentence.length <= 100
     *                 consists of lowercase English letters and spaces.
     * @param searchWord 1 <= searchWord.length <= 10
     *                   consists of lowercase English letters.
     * @return search prefix of word's index in sentence.
     */
    int isPrefixOfWord(String sentence, String searchWord);
}
